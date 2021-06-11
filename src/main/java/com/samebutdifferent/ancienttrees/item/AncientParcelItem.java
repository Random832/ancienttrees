package com.samebutdifferent.ancienttrees.item;

import com.samebutdifferent.ancienttrees.AncientTrees;
import com.samebutdifferent.ancienttrees.init.ModBlocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
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

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClientSide) {
            ItemStack content = new ItemStack(ModBlocks.ACEMUS_SAPLING.get());
            content.setCount(1);
            final ItemEntity entityItem = player.drop(content, true, true);
            entityItem.setPickUpDelay(0);
            entityItem.setOwner(player.getUUID());
        }
        if (!player.abilities.instabuild) {
            player.getItemInHand(hand).shrink(1);
        }
        return ActionResult.sidedSuccess(player.getItemInHand(hand), world.isClientSide);
    }
}