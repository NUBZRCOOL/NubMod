package com.nubzrcool.nubmod.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.nubzrcool.nubmod.NubMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NiobiumBlocks {

	public static final DeferredRegister<Block> NIOBIUM_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NubMod.MOD_ID);
	public static final DeferredRegister<Item> NIOBIUM_ITEMS = NiobiumItems.NIOBIUM_ITEMS;
	//--------------
	
	
	//Niobium Block
	public static final RegistryObject<Block> NIOBIUM_BLOCK = register("niobium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(4.0f)
					.sound(SoundType.METAL).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
	
	//Niobium Ore
	public static final RegistryObject<Block> NIOBIUM_ORE = register("niobium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(4.5f)
					.sound(SoundType.METAL).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(NubMod.NIOBIUM_TAB)));
	
	
	//--------------
		private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
			
			return NIOBIUM_BLOCKS.register(name, block);
		}
		
		private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
			
			RegistryObject<T> obj = registerBlock(name, block);
			NIOBIUM_ITEMS.register(name, item.apply(obj));
			return obj;
		}
	
}
