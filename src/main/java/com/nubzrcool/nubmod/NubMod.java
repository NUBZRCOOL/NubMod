package com.nubzrcool.nubmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("nubmod")
public class NubMod {

	public NubMod() {
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}
}
