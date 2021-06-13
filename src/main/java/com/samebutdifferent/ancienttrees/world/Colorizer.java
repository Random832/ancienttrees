package com.samebutdifferent.ancienttrees.world;

import com.samebutdifferent.ancienttrees.block.ModLeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;

public class Colorizer {

    // OLD CLASS, NOT BEING USED ANYMORE. KEEP FOR REFERENCE.

    /*public static void registerBlockColor(final LeavesBlock block) {
        Minecraft.getInstance().getBlockColors().register((BlockState state, IBlockDisplayReader access, BlockPos pos, int tintIndex) -> {
            if(!(access.getBlockState(pos).getBlock() instanceof LeavesBlock)){
                pos.below();
            }
            if(pos != null && access.getBlockState(pos).getBlock() instanceof LeavesBlock){
                if(block instanceof ModLeavesBlock){
                    String val = access.getBlockState(pos).getValue(ModLeavesBlock.VARIANT).toString();
                    if (val.equals("ACEMUS")){
                        return AcemusColorizer.getColor(pos);
                    }
                    if (val.equals("CERASU")){
                        return CerasuColorizer.getColor(pos);
                    }
                    if (val.equals("KULIST")){
                        return KulistColorizer.getColor(pos);
                    }
                    if (val.equals("HEKUR")){
                        return BiomeColors.getAverageFoliageColor(access,pos);
                    }
                    if (val.equals("LATA")){
                        return BiomeColors.getAverageFoliageColor(access,pos);
                    }
                    if (val.equals("NUCIS")){
                        return BiomeColors.getAverageFoliageColor(access,pos);
                    }
                }
            } return 0xFFFFFF;
        }, block);
    }*/
}
