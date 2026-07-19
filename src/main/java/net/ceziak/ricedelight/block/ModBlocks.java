package net.ceziak.ricedelight.block;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.custom.BasilCropBlock;
import net.ceziak.ricedelight.block.custom.PepperCropBlock;
import net.ceziak.ricedelight.block.custom.WildCropBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    RiceDelight.MOD_ID
            );

    public static final RegistryObject<BasilCropBlock> BASIL_CROP =
            BLOCKS.register(
                    "basil_crop",
                    () -> new BasilCropBlock(
                            BlockBehaviour.Properties.of()
                                    .noCollission()
                                    .randomTicks()
                                    .instabreak()
                                    .sound(SoundType.CROP)
                                    .noOcclusion()
                    )
            );

    public static final RegistryObject<PepperCropBlock> PEPPER_CROP =
            BLOCKS.register(
                    "bell_pepper_crop",
                    () -> new PepperCropBlock(
                            BlockBehaviour.Properties.of()
                                    .noCollission()
                                    .randomTicks()
                                    .instabreak()
                                    .sound(SoundType.CROP)
                                    .noOcclusion()
                    )
            );

    public static final RegistryObject<WildCropBlock> WILD_BASIL =
            BLOCKS.register(
                    "wild_basil",
                    () -> new WildCropBlock(
                            BlockBehaviour.Properties.of()
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .noOcclusion()
                    )
            );

    public static final RegistryObject<WildCropBlock> WILD_BELL_PEPPERS =
            BLOCKS.register(
                    "wild_bell_peppers",
                    () -> new WildCropBlock(
                            BlockBehaviour.Properties.of()
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .noOcclusion()
                    )
            );

    public static final RegistryObject<Block> PEPPER_CRATE =
            BLOCKS.register(
                    "pepper_crate",
                    () -> new Block(
                            BlockBehaviour.Properties.of()
                                    .sound(SoundType.WOOD)
                                    .strength(2.0F, 3.0F)
                    )
            );

    public static final RegistryObject<Block> BASIL_CRATE =
            BLOCKS.register(
                    "basil_crate",
                    () -> new Block(
                            BlockBehaviour.Properties.of()
                                    .sound(SoundType.WOOD)
                                    .strength(2.0F, 3.0F)
                    )
            );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private ModBlocks() {
    }
}
