package com.samebutdifferent.ancienttrees.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.OakTree;

public class ModSaplingBlock extends SaplingBlock {
    public ModSaplingBlock() {
        super(new OakTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING));
    }
}
