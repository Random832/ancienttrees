package com.samebutdifferent.ancienttrees.init;

import com.samebutdifferent.ancienttrees.AncientTrees;
import com.samebutdifferent.ancienttrees.item.AncientParcelItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AncientTrees.MOD_ID);

    public static final RegistryObject<AncientParcelItem> ANCIENT_PARCEL = ITEMS.register("ancient_parcel", AncientParcelItem::new);
}
