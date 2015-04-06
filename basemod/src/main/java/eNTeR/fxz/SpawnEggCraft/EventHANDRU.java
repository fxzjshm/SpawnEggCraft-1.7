package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.eventhandler.Event;

public class EventHANDRU extends Event{
	
	public final EntityPlayer entityPlayer;
	
	public EventHANDRU(EntityPlayer entity)
	{
		super();
		entityPlayer = entity;
	}
}
