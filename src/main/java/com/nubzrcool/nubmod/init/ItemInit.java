package com.nubzrcool.nubmod.init;

import com.google.common.base.Supplier;
import com.nubzrcool.nubmod.NubMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NubMod.MOD_ID);
	//--------------
	
	
	//Boring Item
	public static final RegistryObject<Item> BORING_ITEM = register("boring_item", () -> new Item(new Item.Properties().tab(NubMod.NUB_TAB)));
	
	
	//--------------
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		
		return ITEMS.register(name, item);
	}
	
}
