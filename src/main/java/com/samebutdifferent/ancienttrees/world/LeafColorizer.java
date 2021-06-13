package com.samebutdifferent.ancienttrees.world;

import com.samebutdifferent.ancienttrees.AncientTrees;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.resource.IResourceType;
import net.minecraftforge.resource.ISelectiveResourceReloadListener;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.function.Predicate;

public class LeafColorizer implements IBlockColor, IItemColor {
    private NativeImage buffer = null;
    private ResourceLocation TEXTURE;

    public LeafColorizer(ResourceLocation texture) {
        TEXTURE = texture;
    }

    public int getColor(BlockState state, @Nullable IBlockDisplayReader worldIn, @Nullable BlockPos pos, int tintIndex) {
        if(pos == null)
            return getColorMapPixel(128, 128);
        final ClientWorld world = Minecraft.getInstance().level;
        int day = world != null ? (int) (world.getDayTime() / 24000L) & 0xff : 0;
        final int i = (pos.getX() << 3) + day & 0xff;
        final int j = (pos.getZ() << 3) + day & 0xff;
        return getColorMapPixel(i, j);
    }

    @Override
    public int getColor(ItemStack stack, int tintIndex) {
        return getColorMapPixel(128, 128);
    }

    private int getColorMapPixel(int u, int v) {
        if(buffer == null) return -1;
        int abgr = buffer.getPixelRGBA(u, v);
        return (abgr & 0xff00ff00) | ((abgr >> 16) & 0xff) | ((abgr & 0xff) << 16);
    }

    public void loadTexture(IResourceManager resourceManager) {
        try {
            buffer = NativeImage.read(resourceManager.getResource(TEXTURE).getInputStream());
            if(buffer.getWidth() < 256 || buffer.getHeight() < 256) {
                // TODO log the texture was the wrong size
                buffer = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            buffer = null;
        }
    }
}