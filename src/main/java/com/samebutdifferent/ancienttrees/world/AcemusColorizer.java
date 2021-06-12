package com.samebutdifferent.ancienttrees.world;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import org.jetbrains.annotations.Nullable;

public enum AcemusColorizer implements IBlockColor {
    INSTANCE;

    @Override
    public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
        return 0;
    }
}
