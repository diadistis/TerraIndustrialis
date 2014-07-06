package com.noiz.steamcraft.proxy;

import com.noiz.steamcraft.SteamCraftBlocks;
import com.noiz.steamcraft.entities.tiles.TileEntityHeater;
import com.noiz.steamcraft.entities.tiles.TileEntityTank;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public abstract class CommonProxy {

	public void registerEntities() {
		GameRegistry.registerTileEntity(TileEntityHeater.class, "heater");
		GameRegistry.registerTileEntity(TileEntityTank.class, "tank");
	}

	public abstract void registerGUI();

	public abstract void registerRenderInformation();
}
