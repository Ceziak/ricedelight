package net.ceziak.ricedelight.datagen;

import net.ceziak.ricedelight.block.ModBlocks;
import net.ceziak.ricedelight.block.custom.BasilCropBlock;
import net.ceziak.ricedelight.block.custom.PepperCropBlock;
import net.ceziak.ricedelight.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

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

    public static void gatherData(GatherDataEvent event) {
        ModLootTables provider = new ModLootTables(
                event.getGenerator().getPackOutput(),
                event.getLookupProvider()
        );

        event.getGenerator().addProvider(
                event.includeServer(),
                provider
        );
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
            dropSelf(ModBlocks.PEPPER_CRATE.get());
            dropSelf(ModBlocks.BASIL_CRATE.get());

            add(
                    ModBlocks.BASIL_CROP.get(),
                    createCropDrops(
                            ModBlocks.BASIL_CROP.get(),
                            ModItems.BASIL.get(),
                            ModItems.BASIL_SEEDS.get(),
                            LootItemBlockStatePropertyCondition
                                    .hasBlockStateProperties(ModBlocks.BASIL_CROP.get())
                                    .setProperties(
                                            StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(
                                                            BasilCropBlock.AGE,
                                                            BasilCropBlock.MAX_AGE
                                                    )
                                    )
                    )
            );

            add(
                    ModBlocks.PEPPER_CROP.get(),
                    createCropDrops(
                            ModBlocks.PEPPER_CROP.get(),
                            ModItems.PEPPER.get(),
                            ModItems.PEPPER_SEEDS.get(),
                            LootItemBlockStatePropertyCondition
                                    .hasBlockStateProperties(ModBlocks.PEPPER_CROP.get())
                                    .setProperties(
                                            StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(
                                                            PepperCropBlock.AGE,
                                                            PepperCropBlock.MAX_AGE
                                                    )
                                    )
                    )
            );
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS
                    .getEntries()
                    .stream()
                    .map(entry -> (Block) entry.get())
                    .toList();
        }
    }
}
