package net.ceziak.ricedelight.datagen;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(
        modid = RiceDelight.MOD_ID
)
public final class ModLootTables extends LootTableProvider {

    private ModLootTables(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider
    ) {
        super(
                output,
                Set.of(),
                List.of(
                        new LootTableProvider.SubProviderEntry(
                                BlockTables::new,
                                LootContextParamSets.BLOCK
                        )
                ),
                lookupProvider
        );
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeServer(), output -> new ModLootTables(output, event.getLookupProvider()));
    }

    private static final class BlockTables extends BlockLootSubProvider {

        private BlockTables(HolderLookup.Provider lookupProvider) {
            super(
                    Set.of(),
                    FeatureFlags.DEFAULT_FLAGS,
                    lookupProvider
            );
        }

        @Override
        protected void generate() {
            // Pepper crate drops one pepper crate.
            dropSelf(ModBlocks.PEPPER_CRATE.get());

            // Add future normal blocks here:
            // dropSelf(ModBlocks.ANOTHER_BLOCK.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries()
                    .stream()
                    .map(entry -> (Block) entry.value())
                    .toList();
        }
    }

}