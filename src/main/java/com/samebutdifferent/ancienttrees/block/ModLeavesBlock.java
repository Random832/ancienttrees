package com.samebutdifferent.ancienttrees.block;

import com.samebutdifferent.ancienttrees.world.EnumType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.state.EnumProperty;

import javax.annotation.Nullable;

public class ModLeavesBlock extends LeavesBlock {
    public String VARIANT;

    public ModLeavesBlock(@Nullable EnumType enumType) {
        super(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES));
        if (enumType != null) {
            this.VARIANT = enumType.getName();
        }
    }
}
