package eNTeR.fxz.SpawnEggCraft.coremod;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class SpawnEggCraftCoremodLoadingPlugin implements IFMLLoadingPlugin {

	@Override
	public String[] getASMTransformerClass() {
		// TODO Auto-generated method stub
		return new String[]{"eNTeR.fxz.SpawnEggCraft.coremod.SpawnEggCraftCoremodTransformer"};
	}

	@Override
	public String getModContainerClass() {
		// TODO Auto-generated method stub
		return "eNTeR.fxz.SpawnEggCraft.coremod.SpawnEggCraftCoremodModContainer";
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAccessTransformerClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
