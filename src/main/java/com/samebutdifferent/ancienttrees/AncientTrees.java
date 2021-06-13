package com.samebutdifferent.ancienttrees;

import com.samebutdifferent.ancienttrees.renderer.BlockRenderer;
import com.samebutdifferent.ancienttrees.init.ModBlocks;
import com.samebutdifferent.ancienttrees.init.ModItems;
import com.samebutdifferent.ancienttrees.world.AcemusColorizer;
import com.samebutdifferent.ancienttrees.world.CerasuColorizer;
import com.samebutdifferent.ancienttrees.world.KulistColorizer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AncientTrees.MOD_ID)
public class AncientTrees {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ancienttrees";

    public static final ItemGroup GROUP = new ItemGroup(AncientTrees.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PORFFOR_SAPLING.get());
        }
    };

    public AncientTrees() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register the block colors method
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerBlockColors);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        BlockRenderer.renderBlocks();
    }

    private void registerBlockColors(final ColorHandlerEvent.Block event) {
        event.getBlockColors().register(AcemusColorizer.INSTANCE, ModBlocks.ACEMUS_LEAVES.get());
        event.getBlockColors().register(CerasuColorizer.INSTANCE, ModBlocks.CERASU_LEAVES.get());
        event.getBlockColors().register(KulistColorizer.INSTANCE, ModBlocks.KULIST_LEAVES.get());
        event.getBlockColors().register((state, reader, pos, color) -> {
            return reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColors.getDefaultColor();
        }, ModBlocks.HEKUR_LEAVES.get(), ModBlocks.LATA_LEAVES.get(), ModBlocks.NUCIS_LEAVES.get(), ModBlocks.TUOPA_LEAVES.get());
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
        }
    }
}
