package com.samebutdifferent.ancienttrees.world;

import net.minecraft.util.math.BlockPos;

public class KulistColorizer {
    private static int[] buffer = new int[256 * 256];

    public static int getInventoryColor()
    {
        return buffer[0x80 << 8 | 0x80];
    }

    public static int getColor(BlockPos pos)
    {
        final int i = pos.getX() + pos.getY() & 0xff;
        final int j = pos.getZ() + pos.getY() & 0xff;
        return buffer[i << 8 | j];
    }
}
