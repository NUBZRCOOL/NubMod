package com.nubzrcool.nubmod.init;

import com.google.common.base.Supplier;
import com.nubzrcool.nubmod.NubMod;
import com.nubzrcool.nubmod.init.ToolMaps.Niobium;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NiobiumTools {

	public static final DeferredRegister<Item> NIOBIUM_TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, NubMod.MOD_ID);
	//--------------
	
	
	//Niobium Sword
	public static final RegistryObject<SwordItem> NIOBIUM_SWORD = registerItems("niobium_sword", () -> new SwordItem(new Niobium(10.0f), 0, -2.4f, new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
	
	//Niobium Pickaxe
	public static final RegistryObject<PickaxeItem> NIOBIUM_PICKAXE = registerItems("niobium_pickaxe", () -> new PickaxeItem(new Niobium(5.0f), 0, -2.8f, new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
	
	//Niobium Axe
	public static final RegistryObject<AxeItem> NIOBIUM_AXE = registerItems("niobium_axe", () -> new AxeItem(new Niobium(12.0f), 0, -3.0f, new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
	
	//Niobium Shovel
	public static final RegistryObject<ShovelItem> NIOBIUM_SHOVEL = registerItems("niobium_shovel", () -> new ShovelItem(new Niobium(6.0f), 0, -3.0f, new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
	
	//Niobium Hoe
	public static final RegistryObject<HoeItem> NIOBIUM_HOE = registerItems("niobium_hoe", () -> new HoeItem(new Niobium(5.0f), 0, 0.0f, new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
			
			
	//--------------
	private static <T extends Item> RegistryObject<T> registerItems(final String name, final Supplier<T> item) {
		
		return NIOBIUM_TOOLS.register(name, item);
	}
}
