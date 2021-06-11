package com.samebutdifferent.ancienttrees.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;

public class ModLeavesBlock extends LeavesBlock {
    public ModLeavesBlock() {
        super(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES));
    }
}
