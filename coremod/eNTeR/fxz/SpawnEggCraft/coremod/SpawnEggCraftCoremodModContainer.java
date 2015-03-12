package eNTeR.fxz.SpawnEggCraft.coremod;

import java.util.Arrays;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import com.google.common.eventbus.EventBus;

public class SpawnEggCraftCoremodModContainer extends DummyModContainer{
	public SpawnEggCraftCoremodModContainer()
	{
	super(new ModMetadata());
	ModMetadata meta = getMetadata();
	meta.modId = "SpawnEggCraftCoremod_coremod";
	meta.name = "SpawnEggCraftCoremod";
	meta.version = "0.0.1";
	meta.authorList = Arrays.asList("eNTeR.fxz");
	meta.description = "Change mobs!";
	meta.url = "";
	}
	 
	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
	bus.register(this);
	return true;
	 
	}
}
