package com.noiz.steamcraft.handlers.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.ForgeSubscribe;

import TFC.GUI.GuiInventoryTFC;

import com.noiz.steamcraft.entities.tiles.TileEntityHeater;
import com.noiz.steamcraft.gui.GuiHeater;
import com.noiz.steamcraft.handlers.GuiHandlerServer;

public class GuiHandler extends GuiHandlerServer {

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		TileEntity te = world.getBlockTileEntity(x, y, z);
		switch (ID) {
		case GUI_HeaterID:
			return new GuiHeater(player.inventory, ((TileEntityHeater) te), world, x,
					y, z);
		}
		return null;
	}
	


	@ForgeSubscribe
	public void openGuiHandler(GuiOpenEvent event)
	{
		if(event.gui instanceof GuiInventory && !(event.gui instanceof GuiInventoryTFC))
			event.gui = new GuiInventoryTFC(Minecraft.getMinecraft().thePlayer);
	}
}