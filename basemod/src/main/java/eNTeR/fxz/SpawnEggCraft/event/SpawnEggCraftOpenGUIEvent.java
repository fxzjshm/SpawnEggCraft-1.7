package eNTeR.fxz.SpawnEggCraft.event;

import cpw.mods.fml.common.eventhandler.Event;

public class SpawnEggCraftOpenGUIEvent extends Event{
	
	int GUI_Opening_ID = 0;
	public SpawnEggCraftOpenGUIEvent(int GUI_ID){
		super();
		GUI_Opening_ID = GUI_ID;
	}
}
