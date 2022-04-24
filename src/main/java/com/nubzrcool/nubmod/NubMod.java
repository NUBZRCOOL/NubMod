package com.nubzrcool.nubmod;

import com.nubzrcool.nubmod.init.BlockInit;
import com.nubzrcool.nubmod.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("nubmod")
public class NubMod {

	public static final String MOD_ID = "nubmod";
	
	public static final CreativeModeTab NUB_TAB = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			
			return new ItemStack(ItemInit.BORING_ITEM.get());
		}
	};
	
	
	public NubMod() {
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}
}
