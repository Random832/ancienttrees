package com.samebutdifferent.ancienttrees.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;

public class ModLogBlock extends RotatedPillarBlock {
    public ModLogBlock() {
        super(AbstractBlock.Properties.copy(Blocks.OAK_LOG));
    }
}
