package com.samebutdifferent.ancienttrees.item;

import com.samebutdifferent.ancienttrees.AncientTrees;
import com.samebutdifferent.ancienttrees.init.ModBlocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class AncientParcelItem extends Item {
    public AncientParcelItem() {
        super(new Properties().tab(AncientTrees.GROUP));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.add(new TranslationTextComponent("ancienttrees.ancient_parcel.tooltip").withStyle(TextFormatting.GOLD));
    }

    public static final ResourceLocation ANCIENT_PARCEL_LOOT = new ResourceLocation("ancienttrees", "items/ancient_parcel");

    public void getRandomSapling(ServerWorld world, PlayerEntity player) {
        LootTable loottable = world.getServer().getLootTables().get(ANCIENT_PARCEL_LOOT);
        LootContext.Builder builder = new LootContext.Builder(world);
        for (ItemStack sapling : loottable.getRandomItems(builder.create(loottable.getParamSet()))) {
            ItemEntity entityItem = player.drop(sapling, true, true);
            entityItem.setPickUpDelay(0);
            entityItem.setOwner(player.getUUID());
        }
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClientSide) {
            if (world instanceof ServerWorld)
            {
                ServerWorld serverWorld = (ServerWorld)world;
                getRandomSapling(serverWorld, player);
            }
        }
        if (!player.abilities.instabuild) {
            player.getItemInHand(hand).shrink(1);
        }
        return ActionResult.sidedSuccess(player.getItemInHand(hand), world.isClientSide);
    }
}