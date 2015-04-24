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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import eNTeR.fxz.SpawnEggCraft.tileentity.*;

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
				//Recipes
				//Spawn_eggs
				//Chicken
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,93), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.feather, 1), 
					Character.valueOf('2'), new ItemStack(Items.chicken, 1), 
					});
				System.out.println(String.valueOf(LANZ_JBU));
				//pig
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,90), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.carrot, 1), 
					Character.valueOf('2'), new ItemStack(Items.porkchop, 1), 
					});
				//cow
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,92), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.leather, 1), 
					Character.valueOf('2'), new ItemStack(Items.beef, 1), 
					});
				//sheep
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,91), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.wheat, 1), 
					Character.valueOf('2'), new ItemStack(Blocks.wool, 1), 
					});
				//villager
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,120), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.golden_apple, 1), 
					Character.valueOf('2'), new ItemStack(Items.emerald, 1), 
				});
				//wolf
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,95), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.bone, 1), 
					Character.valueOf('2'), new ItemStack(Items.rotten_flesh, 1), 
				});
				//cat
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,98), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.fish, 1), 
					Character.valueOf('2'), new ItemStack(Items.milk_bucket, 1), 
				});
				//mushroomcow_brown_mushroom
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,96), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.brown_mushroom, 1), 
					Character.valueOf('2'), new ItemStack(Items.spawn_egg, LANZ_JBU,92), 
				});
				//mushroomcow_red_mushroom
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,96), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.red_mushroom, 1), 
					Character.valueOf('2'), new ItemStack(Items.spawn_egg, LANZ_JBU,92), 
				});
				//Squid
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,94), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.dye, 1,0), 
					Character.valueOf('2'), new ItemStack(Items.dye, 1,1), 
				});
				
				//Bat
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,65), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.stone, 1), 
					Character.valueOf('2'), new ItemStack(Blocks.cobblestone, 1), 
				});
				//Witch
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,66), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.potionitem, 1,0), 
					Character.valueOf('2'), new ItemStack(Items.spawn_egg, 1,120), 
				});
				//Silverfish
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,60), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.stonebrick, 1,0), 
					Character.valueOf('2'), new ItemStack(Blocks.stonebrick, 1,3), 
				});
				//Cave spider
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,59), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.planks, 1), 
					Character.valueOf('2'), new ItemStack(Items.spider_eye, 1), 
				});	
				//Zombie pigman
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,57), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.gold_nugget, 1), 
					Character.valueOf('2'), new ItemStack(Items.rotten_flesh, 1), 
				});	
				//MagmaCube
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,62), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.blaze_powder, 1), 
					Character.valueOf('2'), new ItemStack(Items.magma_cream, 1), 
				});	
				//Blaze
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,61), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.blaze_rod, 1), 
					Character.valueOf('2'), new ItemStack(Items.lava_bucket, 1), 
				});	
				//Enderman
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,58), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.grass, 1), 
					Character.valueOf('2'), new ItemStack(Items.ender_pearl, 1), 
				});	
				//Ghast
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,61), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.fire_charge, 1), 
					Character.valueOf('2'), new ItemStack(Items.ghast_tear, 1), 
				});	
				//Slime
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,55), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg,1),
					Character.valueOf('1'), new ItemStack(Items.wheat_seeds,1), 
					Character.valueOf('2'), new ItemStack(BlockSlime,1), 
				});	
				//Zombie
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,54), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.feather, 1), 
					Character.valueOf('2'), new ItemStack(Items.rotten_flesh, 1), 
				});	
				//Spider
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,52), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.string, 1), 
					Character.valueOf('2'), new ItemStack(Items.spider_eye, 1), 
				});	
				//Skeleton
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,51), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Items.arrow, 1), 
					Character.valueOf('2'), new ItemStack(Items.bone, 1), 
				});	
				//Creeper
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,50), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.leaves, 1), 
					Character.valueOf('2'), new ItemStack(Items.gunpowder, 1), 
				});	
				//Creeper2
				GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, LANZ_JBU,50), new Object[]{
					"010", 
					"121", 
					"010", 
					Character.valueOf('0'), new ItemStack(Items.egg, 1),
					Character.valueOf('1'), new ItemStack(Blocks.leaves2, 1), 
					Character.valueOf('2'), new ItemStack(Items.gunpowder, 1), 
				});
				//Items
				//Specimen
				GameRegistry.addRecipe(new ItemStack(Specimen,1), new Object[]{
					"01",
					Character.valueOf('0'), new ItemStack(Items.book, 1),
					Character.valueOf('1'), new ItemStack(Items.nether_star, 1), 
				});
				//SlimeBall
				GameRegistry.addRecipe(new ItemStack(Items.slime_ball, 9), new Object[]{
					"0",
					Character.valueOf('0'), new ItemStack(BlockSlime, 1),
				});
				//Blocks
				//BlockSlime
				GameRegistry.addRecipe(new ItemStack(BlockSlime,1), new Object[]{
					"000",
					"000",
					"000",
					Character.valueOf('0'), new ItemStack(Items.slime_ball, 1),
				});


		}
	
	
	@SubscribeEvent
	public void LivingDeath(LivingDeathEvent event){
		String EntityName = event.entity.getClass().getName();
		if(!event.entity.worldObj.isRemote){
			if(
					EntityName=="net.minecraft.entity.moster.EntityCreeper"||EntityName=="xz"
					||
					EntityName=="net.minecraft.entity.passive.EntityZombie"||EntityName=="yq"
					||
					EntityName=="net.minecraft.entity.passive.EntitySkeleton"||EntityName=="yl"
					||
					EntityName=="net.minecraft.entity.passive.EntitySpider"||EntityName=="yo"
					||
					EntityName=="net.minecraft.entity.passive.EntityCaveSpider"||EntityName=="xy"
					||
					EntityName=="net.minecraft.entity.passive.EntityPigZombie"||EntityName=="yh"
					||
					EntityName=="net.minecraft.entity.passive.EntityBlaze"||EntityName=="xx"
					||
					EntityName=="net.minecraft.entity.passive.EntityGhast"||EntityName=="yd"
					||
					EntityName=="net.minecraft.entity.passive.EntitySlime"||EntityName=="ym"
					||
					EntityName=="net.minecraft.entity.passive.EntityMagmaCube"||EntityName=="yf"
					||
					EntityName=="net.minecraft.entity.passive.EntityEnderman"||EntityName=="ya"
					
				)
			{
    			if((Math.abs(ran1.nextLong())%100)==50){
    				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY + (double)0.0F, event.entity.posZ, new ItemStack(Items.experience_bottle));
    				entityitem.delayBeforeCanPickup = 10;
    				event.entity.worldObj.spawnEntityInWorld(entityitem);	
    			}
            } 
			else
            if(
            		EntityName=="net.minecraft.entity.passive.EntityCow"||EntityName=="wh"
            		||
            		EntityName=="net.minecraft.entity.passive.EntitySheep"||EntityName=="wp"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityPig"||EntityName=="wo"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityChicken"||EntityName=="wg"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityMooshroom"||EntityName=="wm"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityBat"||EntityName=="we"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityOcelot"||EntityName=="wn"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityWolf"||EntityName=="wv"
    			)
    			
            {
    			if((Math.abs(ran1.nextLong())%(Math.abs(ran1.nextLong()%400)+100)==127)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            }else if(event.entity.isBurning()==true&&
            		(EntityName=="net.minecraft.entity.moster.EntityWitch"||EntityName=="yp")
            		)
            {
            	if((Math.abs(ran1.nextLong())%50)==25){
            	EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.experience_bottle,(int)(ran1.nextInt()%9)));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
            	}
            }
			System.out.println("------------------------Did it kill an entity?------------------------");
			System.out.println(event.source.getSourceOfDamage().getClass().getName());
		}
	}
	
	@SubscribeEvent
	public void LivingFall_BlockSlime(LivingFallEvent event){
		//if(event.entityLiving){
			
		//}
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
