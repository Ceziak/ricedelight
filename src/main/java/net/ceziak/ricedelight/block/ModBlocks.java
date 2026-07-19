package net.ceziak.ricedelight.block;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.custom.BasilCropBlock;
import net.ceziak.ricedelight.block.custom.PepperCropBlock;
import net.ceziak.ricedelight.block.custom.WildCropBlock;
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

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(RiceDelight.MOD_ID);

    // Growable crops - their seed items are registered in ModItems.
    public static final DeferredBlock<BasilCropBlock> BASIL_CROP =
            BLOCKS.registerBlock(
                    "basil_crop",
                    properties -> new BasilCropBlock(
                            properties
                                    .noCollission()
                                    .randomTicks()
                                    .instabreak()
                                    .sound(SoundType.CROP)
                                    .noOcclusion()
                    )
            );

    public static final DeferredBlock<PepperCropBlock> PEPPER_CROP =
            BLOCKS.registerBlock(
                    "bell_pepper_crop",
                    properties -> new PepperCropBlock(
                            properties
                                    .noCollission()
                                    .randomTicks()
                                    .instabreak()
                                    .sound(SoundType.CROP)
                                    .noOcclusion()
                    )
            );

    // Wild crops - these receive normal BlockItems.
    public static final DeferredBlock<WildCropBlock> WILD_BASIL =
            registerBlock(
                    "wild_basil",
                    properties -> new WildCropBlock(
                            properties
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .noOcclusion()
                    )
            );

    public static final DeferredBlock<WildCropBlock> WILD_BELL_PEPPERS =
            registerBlock(
                    "wild_bell_peppers",
                    properties -> new WildCropBlock(
                            properties
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .noOcclusion()
                    )
            );

    // Crates.
    public static final DeferredBlock<Block> PEPPER_CRATE =
            registerBlock(
                    "pepper_crate",
                    properties -> new Block(
                            properties
                                    .sound(SoundType.WOOD)
                                    .strength(2.0F, 3.0F)
                    )
            );

    public static final DeferredBlock<Block> BASIL_CRATE =
            registerBlock(
                    "basil_crate",
                    properties -> new Block(
                            properties
                                    .sound(SoundType.WOOD)
                                    .strength(2.0F, 3.0F)
                    )
            );

    private static <T extends Block> DeferredBlock<T> registerBlock(
            String name,
            Function<BlockBehaviour.Properties, T> blockFactory
    ) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, blockFactory);
        registerBlockItem(name, block);
        return block;
    }

    private static <T extends Block> void registerBlockItem(
            String name,
            DeferredBlock<T> block
    ) {
        ModItems.ITEMS.register(
                name,
                () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private ModBlocks() {
    }
}
