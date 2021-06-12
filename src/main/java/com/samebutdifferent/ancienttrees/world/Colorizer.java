package com.samebutdifferent.ancienttrees.world;

import com.samebutdifferent.ancienttrees.block.ModLeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;

public class Colorizer {
    public static void registerBlockColor(final LeavesBlock block) {
        Minecraft.getInstance().getBlockColors().register((BlockState state, IBlockDisplayReader access, BlockPos pos, int tintIndex) -> {
            if(!(access.getBlockState(pos).getBlock() instanceof LeavesBlock)){
                pos.below();
            }
            if(pos != null && access.getBlockState(pos).getBlock() instanceof LeavesBlock){
                if(block instanceof ModLeavesBlock){
                    String val = ((ModLeavesBlock) access.getBlockState(pos).getBlock()).VARIANT;
                    System.out.println(val);
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
    }

    public static void registerItemBlockColor(final LeavesBlock block) {
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> {
            if (block instanceof ModLeavesBlock) {
                BlockItem item = (BlockItem) stack.getItem();
                String val = ((ModLeavesBlock) item.getBlock()).VARIANT;
                switch (val) {
                    case "ACEMUS":
                        return AcemusColorizer.getInventoryColor();
                    case "CERASU":
                        return CerasuColorizer.getInventoryColor();
                    case "KULIST":
                        return KulistColorizer.getInventoryColor();
                    case "HEKUR":
                    case "LATA":
                    case "NUCIS":
                    default:
                        return FoliageColors.getDefaultColor();
                }
            }
            return 0xFFFFFF;
        }, block);
    }
}
