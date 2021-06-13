package com.samebutdifferent.ancienttrees.world;

import com.samebutdifferent.ancienttrees.AncientTrees;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.resources.IResourceManager;
import net.minecraft.resources.IResourceManagerReloadListener;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.resource.IResourceType;
import net.minecraftforge.resource.ISelectiveResourceReloadListener;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.Predicate;

public enum AcemusColorizer implements ISelectiveResourceReloadListener, IBlockColor {
    INSTANCE;

    private static ByteBuffer buffer = ByteBuffer.allocate(256*256);

    public static int getColor(BlockPos pos) {
        int day = 0;
        final ClientWorld world = Minecraft.getInstance().player.clientLevel;
        if (world != null) {
            final ClientWorld.ClientWorldInfo info = world.getLevelData();
            day = (int) (info.getGameTime() / 24000L) & 0xff;
        }

        final int i = (pos.getX() << 3) + day & 0xff;
        final int j = (pos.getZ() << 3) + day & 0xff;
        buffer.put((byte) (i << 8 | j));
        return buffer.getInt();
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager, Predicate<IResourceType> resourcePredicate) {
        try {
            buffer = TextureUtil.readResource(resourceManager.getResource(new ResourceLocation(AncientTrees.MOD_ID, "textures/colormap/acemus.png")).getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos pos, int p_getColor_4_) {
        return getColor(pos);
    }
}