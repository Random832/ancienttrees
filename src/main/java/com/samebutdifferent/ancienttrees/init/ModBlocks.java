package com.samebutdifferent.ancienttrees.init;

import com.samebutdifferent.ancienttrees.AncientTrees;
import com.samebutdifferent.ancienttrees.block.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientTrees.MOD_ID);

    public static final RegistryObject<Block> ACEMUS_LOG = register("acemus_log", ModLogBlock::new);
    public static final RegistryObject<Block> CEDRUM_LOG = register("cedrum_log", ModLogBlock::new);
    public static final RegistryObject<Block> CERASU_LOG = register("cerasu_log", ModLogBlock::new);
    public static final RegistryObject<Block> DELNAS_LOG = register("delnas_log", ModLogBlock::new);
    public static final RegistryObject<Block> EWCALY_LOG = register("ewcaly_log", ModLogBlock::new);
    public static final RegistryObject<Block> HEKUR_LOG = register("hekur_log", ModLogBlock::new);
    public static final RegistryObject<Block> KIPARIS_LOG = register("kiparis_log", ModLogBlock::new);
    public static final RegistryObject<Block> KULIST_LOG = register("kulist_log", ModLogBlock::new);
    public static final RegistryObject<Block> LATA_LOG = register("lata_log", ModLogBlock::new);
    public static final RegistryObject<Block> NUCIS_LOG = register("nucis_log", ModLogBlock::new);
    public static final RegistryObject<Block> PORFFOR_LOG = register("porffor_log", ModLogBlock::new);
    public static final RegistryObject<Block> SALYX_LOG = register("salyx_log", ModLogBlock::new);
    public static final RegistryObject<Block> TUOPA_LOG = register("tuopa_log", ModLogBlock::new);

    public static final RegistryObject<Block> ACEMUS_LEAVES = register("acemus_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> CEDRUM_LEAVES = register("cedrum_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> CERASU_LEAVES = register("cerasu_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> DELNAS_LEAVES = register("delnas_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> EWCALY_LEAVES = register("ewcaly_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> HEKUR_LEAVES = register("hekur_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> KIPARIS_LEAVES = register("kiparis_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> KULIST_LEAVES = register("kulist_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> LATA_LEAVES = register("lata_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> NUCIS_LEAVES = register("nucis_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> PORFFOR_LEAVES = register("porffor_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> SALYX_LEAVES = register("salyx_leaves", ModLeavesBlock::new);
    public static final RegistryObject<Block> TUOPA_LEAVES = register("tuopa_leaves", ModLeavesBlock::new);

    public static final RegistryObject<Block> ACEMUS_PLANKS = register("acemus_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> CEDRUM_PLANKS = register("cedrum_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> CERASU_PLANKS = register("cerasu_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> DELNAS_PLANKS = register("delnas_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> EWCALY_PLANKS = register("ewcaly_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> HEKUR_PLANKS = register("hekur_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> KIPARIS_PLANKS = register("kiparis_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> KULIST_PLANKS = register("kulist_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> LATA_PLANKS = register("lata_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> NUCIS_PLANKS = register("nucis_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> PORFFOR_PLANKS = register("porffor_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> SALYX_PLANKS = register("salyx_planks", ModPlanksBlock::new);
    public static final RegistryObject<Block> TUOPA_PLANKS = register("tuopa_planks", ModPlanksBlock::new);

    public static final RegistryObject<Block> ACEMUS_SAPLING = register("acemus_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> CEDRUM_SAPLING = register("cedrum_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> CERASU_SAPLING = register("cerasu_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> DELNAS_SAPLING = register("delnas_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> EWCALY_SAPLING = register("ewcaly_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> HEKUR_SAPLING = register("hekur_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> KIPARIS_SAPLING = register("kiparis_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> KULIST_SAPLING = register("kulist_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> LATA_SAPLING = register("lata_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> NUCIS_SAPLING = register("nucis_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> PORFFOR_SAPLING = register("porffor_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> SALYX_SAPLING = register("salyx_sapling", ModSaplingBlock::new);
    public static final RegistryObject<Block> TUOPA_SAPLING = register("tuopa_sapling", ModSaplingBlock::new);

    public static final RegistryObject<Block> ACEMUS_SLAB = register("acemus_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> CEDRUM_SLAB = register("cedrum_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> CERASU_SLAB = register("cerasu_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> DELNAS_SLAB = register("delnas_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> EWCALY_SLAB = register("ewcaly_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> HEKUR_SLAB = register("hekur_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> KIPARIS_SLAB = register("kiparis_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> KULIST_SLAB = register("kulist_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> LATA_SLAB = register("lata_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> NUCIS_SLAB = register("nucis_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> PORFFOR_SLAB = register("porffor_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> SALYX_SLAB = register("salyx_slab", ModSlabBlock::new);
    public static final RegistryObject<Block> TUOPA_SLAB = register("tuopa_slab", ModSlabBlock::new);

    public static final RegistryObject<Block> ACEMUS_STAIRS = register("acemus_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> CEDRUM_STAIRS = register("cedrum_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> CERASU_STAIRS = register("cerasu_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> DELNAS_STAIRS = register("delnas_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> EWCALY_STAIRS = register("ewcaly_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> HEKUR_STAIRS = register("hekur_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> KIPARIS_STAIRS = register("kiparis_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> KULIST_STAIRS = register("kulist_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> LATA_STAIRS = register("lata_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> NUCIS_STAIRS = register("nucis_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> PORFFOR_STAIRS = register("porffor_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> SALYX_STAIRS = register("salyx_stairs", ModStairsBlock::new);
    public static final RegistryObject<Block> TUOPA_STAIRS = register("tuopa_stairs", ModStairsBlock::new);

    public static final RegistryObject<Block> ACEMUS_DOOR = register("acemus_door", ModDoorBlock::new);
    public static final RegistryObject<Block> CEDRUM_DOOR = register("cedrum_door", ModDoorBlock::new);
    public static final RegistryObject<Block> CERASU_DOOR = register("cerasu_door", ModDoorBlock::new);
    public static final RegistryObject<Block> DELNAS_DOOR = register("delnas_door", ModDoorBlock::new);
    public static final RegistryObject<Block> EWCALY_DOOR = register("ewcaly_door", ModDoorBlock::new);
    public static final RegistryObject<Block> HEKUR_DOOR = register("hekur_door", ModDoorBlock::new);
    public static final RegistryObject<Block> KIPARIS_DOOR = register("kiparis_door", ModDoorBlock::new);
    public static final RegistryObject<Block> KULIST_DOOR = register("kulist_door", ModDoorBlock::new);
    public static final RegistryObject<Block> LATA_DOOR = register("lata_door", ModDoorBlock::new);
    public static final RegistryObject<Block> NUCIS_DOOR = register("nucis_door", ModDoorBlock::new);
    public static final RegistryObject<Block> PORFFOR_DOOR = register("porffor_door", ModDoorBlock::new);
    public static final RegistryObject<Block> SALYX_DOOR = register("salyx_door", ModDoorBlock::new);
    public static final RegistryObject<Block> TUOPA_DOOR = register("tuopa_door", ModDoorBlock::new);
    
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(AncientTrees.GROUP)));
        return toReturn;
    }
}
