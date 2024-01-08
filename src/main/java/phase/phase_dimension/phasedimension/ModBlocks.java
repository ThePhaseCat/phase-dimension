package phase.phase_dimension.phasedimension;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CONDENSED_DIRT = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS)
            ), "condensed_dirt", true);

    public static final Block PHASE_ROCK = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS)
            ), "phase_rock", true);

    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("phase-dimension", name);

        if(shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());

            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}
}
