package com.nubzrcool.nubmod;

import com.nubzrcool.nubmod.init.BlockInit;
import com.nubzrcool.nubmod.init.ItemInit;
import com.nubzrcool.nubmod.init.NiobiumBlocks;
import com.nubzrcool.nubmod.init.NiobiumItems;
import com.nubzrcool.nubmod.init.NiobiumTools;

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
	
	public static final CreativeModeTab NUB_TAB = new CreativeModeTab("MEME") {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			
			return new ItemStack(ItemInit.BORING_ITEM.get());
		}
	};
	
	public static final CreativeModeTab NIOBIUM_TAB = new CreativeModeTab("Niobium") {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			
			return new ItemStack(NiobiumItems.NIOBIUM.get());
		}
	};
	
	
	public NubMod() {
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		NiobiumItems.NIOBIUM_ITEMS.register(bus);
		NiobiumTools.NIOBIUM_TOOLS.register(bus);
		NiobiumBlocks.NIOBIUM_BLOCKS.register(bus);
		
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}
}
