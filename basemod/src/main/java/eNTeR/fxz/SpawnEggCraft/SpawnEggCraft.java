/**@author fxz*/
package eNTeR.fxz.SpawnEggCraft;

import java.io.File;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import com.google.common.eventbus.EventBus;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.VersionRange;

import eNTeR.fxz.SpawnEggCraft.asmdatatable.*;
import eNTeR.fxz.SpawnEggCraft.block.*;
import eNTeR.fxz.SpawnEggCraft.config.*;
import eNTeR.fxz.SpawnEggCraft.gui.*;
import eNTeR.fxz.SpawnEggCraft.registrecipe.*;
import eNTeR.fxz.SpawnEggCraft.tileentity.*;
import eNTeR.fxz.SpawnEggCraft.eventhandler.*;

@Mod(modid=SpawnEggCraft.modid, name=SpawnEggCraft.name, version=SpawnEggCraft.version)

public class SpawnEggCraft implements ModContainer{
	public static final String modid ="SpawnEggCraft_basemod";
	public static final String name ="SpawnEggCraft_basemod";
	public static final String version ="0.1.1";
    public static int LANZ_JBU = 1;
    public static String IsDoubleCraft = "true";
    public static Item Specimen;
    public static Block SpawnEggCopyingMachine;
    public static Block BlockSlime;
	public static final Object instance = new SpawnEggCraft();
	public static Random ran1=new Random();
	String Number = "2";
	String NumberofSlimeInput = "1";
	public static final int GUI_ID_SAMPLE = 20;
    
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) throws Exception
	{
		
		SpawnEggCraftConfig.InitliazeConfig(event.getSuggestedConfigurationFile());
		try
		{
			Number = SpawnEggCraftConfig.GetGeneralProperties("Number","2");
			
		}
		catch(Exception error)
		{ 
		    System.out.println(error.getMessage());
		    System.out.println(error.getStackTrace());
		}
		SpawnEggCraftConfig.SaveConfig();
		
		//Items
		//Specimen
	    Specimen = new eNTeR.fxz.SpawnEggCraft.item.Specimen();
	    Specimen.setUnlocalizedName("Specimen").setTextureName("fxz:Specimen").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(Specimen, "Specimen");
		
		//Blocks
		//SpawnEggCopyingMachine
		SpawnEggCopyingMachine = new CopyingMachine(Material.rock);
		SpawnEggCopyingMachine.setBlockName("SpawnEggCopyingMachine").setBlockTextureName("fxz:SpawnEggCopyingMachine").setHardness(3.0f).setResistance(20.0f).setCreativeTab(CreativeTabs.tabDecorations);
		GameRegistry.registerBlock(SpawnEggCopyingMachine,"SpawnEggCopyingMachine");
		GameRegistry.registerTileEntity(SpawnEggCraftTileEntityCopyingMachine.class, "SpawnEggCopyingTileEntity");
		//BlockSlime
		BlockSlime = new net.minecraft.block.BlockSlime();
		BlockSlime.setBlockName("BlockSlime").setBlockTextureName("fxz:slime").setCreativeTab(CreativeTabs.tabDecorations);
		BlockSlime.slipperiness = 0.8F;
		GameRegistry.registerBlock(BlockSlime,"BlockSlime");
		
		//registry
		//GUIHandler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new SpawnEggCopyingMachineGuiHandler());
		//Event_Bus
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
		//ModContainer
		//Warning
		//TODO Check It
		NetworkRegistry.INSTANCE.register(this, SpawnEggCraft.class, "0.1.1", new SpawnEggCraftASMDataTable());
		
		}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	    LANZ_JBU=Integer.valueOf(Number);
	    SpawnEggCraftRegistRecipe.SpawnEggCraftDoRegistRecipe(LANZ_JBU);
		}
	
	
	@SubscribeEvent
	public void LivingDeath(LivingDeathEvent event){
		SpawnEggCraftEventHandler.LivingDeathEvent(event);
	}
	
	@SubscribeEvent
	public void LivingFall_BlockSlime(LivingFallEvent event){
		SpawnEggCraftEventHandler.LivingFallEvent_BlockSlime(event);
	}

	@Override
	public String getModId() {
		return SpawnEggCraft.modid;
	}

	@Override
	public String getName() {
		return SpawnEggCraft.name;
	}

	@Override
	public String getVersion() {
		return SpawnEggCraft.version;
	}

	@Override
	public File getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModMetadata getMetadata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bindMetadata(MetadataCollection mc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabledState(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<ArtifactVersion> getRequirements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtifactVersion> getDependencies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtifactVersion> getDependants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSortingRules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(Object mod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getMod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArtifactVersion getProcessedVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDisplayVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VersionRange acceptableMinecraftVersionRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certificate getSigningCertificate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getCustomModProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getCustomResourcePackClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getSharedModDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Disableable canBeDisabled() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGuiClassName() {
		// TODO Auto-generated method stub
		return "eNTeR.fxz.SpawnEggCraft.SpawnEggCopyingMachineGuiHandler";
	}

	@Override
	public List<String> getOwnedPackages() {
		// TODO Auto-generated method stub
		return null;
	}

}
