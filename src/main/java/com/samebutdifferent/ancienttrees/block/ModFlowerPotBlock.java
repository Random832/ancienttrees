package com.samebutdifferent.ancienttrees.block;

import com.samebutdifferent.ancienttrees.init.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;

public class ModFlowerPotBlock extends FlowerPotBlock {
    public ModFlowerPotBlock() {
        super(ModBlocks.ACEMUS_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING));
    }
}
