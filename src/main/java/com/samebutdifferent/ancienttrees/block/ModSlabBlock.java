package com.samebutdifferent.ancienttrees.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class ModSlabBlock extends SlabBlock {
    public ModSlabBlock() {
        super(AbstractBlock.Properties.copy(Blocks.OAK_SLAB));
    }
}
