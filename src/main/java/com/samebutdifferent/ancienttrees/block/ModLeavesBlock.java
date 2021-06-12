package com.samebutdifferent.ancienttrees.block;

import com.samebutdifferent.ancienttrees.world.EnumType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.state.EnumProperty;

public class ModLeavesBlock extends LeavesBlock {
    public ModLeavesBlock() {
        super(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES));
    }

    public static final EnumProperty VARIANT = EnumProperty.create("variant", EnumType.class);
}
