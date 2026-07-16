package net.ceziak.ricedelight.block;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(RiceDelight.MOD_ID);

    // Crates
    public static final DeferredBlock<Block> PEPPER_CRATE =
            registerBlock("pepper_crate",
                    properties -> new Block(properties.sound(SoundType.WOOD).strength(2.0f, 3.0f)));

    public static final DeferredBlock<Block> BASIL_CRATE =
            registerBlock("basil_crate",
                    properties -> new Block(properties.sound(SoundType.WOOD).strength(2.0f, 3.0f)));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(
                name, () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}