package eNTeR.fxz.spawneggcraft;

import net.minecraft.entity.player.EntityPlayer;

public class EventHANDRU extends cpw.mods.fml.common.eventhandler.Event {

	public final EntityPlayer entityPlayer;
	
	public EventHANDRU(EntityPlayer entity){
		super();
		entityPlayer = entity;
	}
}
