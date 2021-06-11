package com.samebutdifferent.ancienttrees.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;

public class ModDoorBlock extends DoorBlock {
    public ModDoorBlock() {
        super(AbstractBlock.Properties.copy(Blocks.OAK_DOOR));
    }
}
