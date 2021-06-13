package com.samebutdifferent.ancienttrees;

import com.samebutdifferent.ancienttrees.init.ModBlocks;
import com.samebutdifferent.ancienttrees.renderer.BlockRenderer;
import com.samebutdifferent.ancienttrees.world.LeafColorizer;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.IReloadableResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.resource.ISelectiveResourceReloadListener;

public class ClientSetup {
    static LeafColorizer ACEMUS_INSTANCE = new LeafColorizer(new ResourceLocation(AncientTrees.MOD_ID, "textures/colormap/acemus.png"));
    static LeafColorizer CERASU_INSTANCE = new LeafColorizer(new ResourceLocation(AncientTrees.MOD_ID, "textures/colormap/cerasu.png"));
    static LeafColorizer KULIST_INSTANCE = new LeafColorizer(new ResourceLocation(AncientTrees.MOD_ID, "textures/colormap/kulist.png"));

    static void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        BlockRenderer.renderBlocks();
        Minecraft minecraft = event.getMinecraftSupplier().get();
        IReloadableResourceManager resourceManager = (IReloadableResourceManager)minecraft.getResourceManager(); // ???
        ACEMUS_INSTANCE.loadTexture(resourceManager);
        CERASU_INSTANCE.loadTexture(resourceManager);
        KULIST_INSTANCE.loadTexture(resourceManager);
        resourceManager.registerReloadListener((ISelectiveResourceReloadListener)(resourceManagerIn, predicate) -> {
            ACEMUS_INSTANCE.loadTexture(resourceManagerIn);
            CERASU_INSTANCE.loadTexture(resourceManagerIn);
            KULIST_INSTANCE.loadTexture(resourceManagerIn);
        });
    }

    static void registerBlockColors(final ColorHandlerEvent.Block event) {
        event.getBlockColors().register(ACEMUS_INSTANCE, ModBlocks.ACEMUS_LEAVES.get());
        event.getBlockColors().register(CERASU_INSTANCE, ModBlocks.CERASU_LEAVES.get());
        event.getBlockColors().register(KULIST_INSTANCE, ModBlocks.KULIST_LEAVES.get());
        event.getBlockColors().register((state, reader, pos, tintIndex) -> reader != null && pos != null ?
                BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColors.getDefaultColor(),
                ModBlocks.HEKUR_LEAVES.get(), ModBlocks.LATA_LEAVES.get(), ModBlocks.NUCIS_LEAVES.get(), ModBlocks.TUOPA_LEAVES.get());
    }

    static void registerItemColors(final ColorHandlerEvent.Item event) {
        event.getItemColors().register(ACEMUS_INSTANCE, ModBlocks.ACEMUS_LEAVES.get());
        event.getItemColors().register(CERASU_INSTANCE, ModBlocks.CERASU_LEAVES.get());
        event.getItemColors().register(KULIST_INSTANCE, ModBlocks.KULIST_LEAVES.get());
        event.getItemColors().register((stack, tintIndex) -> FoliageColors.getDefaultColor(),
                ModBlocks.HEKUR_LEAVES.get(), ModBlocks.LATA_LEAVES.get(), ModBlocks.NUCIS_LEAVES.get(), ModBlocks.TUOPA_LEAVES.get());
    }
}
