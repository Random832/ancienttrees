package com.samebutdifferent.ancienttrees.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class ModStairsBlock extends StairsBlock {
    public ModStairsBlock() {
        super(Blocks.OAK_PLANKS.defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_PLANKS));
    }
}
