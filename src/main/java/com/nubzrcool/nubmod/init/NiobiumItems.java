package com.nubzrcool.nubmod.init;

import com.google.common.base.Supplier;
import com.nubzrcool.nubmod.NubMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NiobiumItems {
	
		public static final DeferredRegister<Item> NIOBIUM_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NubMod.MOD_ID);
		//--------------
	

		//Niobium//
		public static final RegistryObject<Item> NIOBIUM = registerItems("niobium", () -> new Item(new Item.Properties().tab(NubMod.NIOBIUM_TAB)));

		

		//--------------
		private static <T extends Item> RegistryObject<T> registerItems(final String name, final Supplier<T> item) {
			
			return NIOBIUM_ITEMS.register(name, item);
		}
}
