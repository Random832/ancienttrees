package com.samebutdifferent.ancienttrees.block;

import com.samebutdifferent.ancienttrees.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BlockRenderer {
    public static void renderBlocks() {
        RenderType rendertype2 = RenderType.cutout();
        RenderTypeLookup.setRenderLayer(ModBlocks.ACEMUS_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDRUM_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.CERASU_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.DELNAS_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.EWCALY_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.HEKUR_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.KIPARIS_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.KULIST_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.LATA_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.NUCIS_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.PORFFOR_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.SALYX_SAPLING.get(), rendertype2);
        RenderTypeLookup.setRenderLayer(ModBlocks.TUOPA_SAPLING.get(), rendertype2);
    }
}
