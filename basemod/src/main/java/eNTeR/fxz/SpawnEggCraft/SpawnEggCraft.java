package eNTeR.fxz.SpawnEggCraft;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=SpawnEggCraft.MODID, name=SpawnEggCraft.NAME, version=SpawnEggCraft.VERSION)
public class SpawnEggCraft {
    public static final String MODID = "SpawnEggCraft_basemod";
    public static final String NAME = "SpawnEggCraft_basemod";
    public static final String VERSION = "0.1.1";
    public static int LANZ_JBU = 1;
    public static String IsDoubleCraft = "true";
    String SpawnEggCraft_String = "";
    static public Item Specimen;
    static public Block SpawnEggCopyingMachine;
	Random ran1=new Random();
	Random ran2=new Random();
	String Number = "2";
	String NumberofSlimeInput = "1";
	
    
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) throws Exception
	{
		SpawnEggCraftConfig.InitliazeConfig(event.getSuggestedConfigurationFile());
		try
		{
			Number = SpawnEggCraftConfig.GetGeneralProperties("Number","2");
			NumberofSlimeInput = SpawnEggCraftConfig.GetGeneralProperties("Number of Slime(Input)","5");
			
		}
		catch(Exception error)
		{ 
		    System.out.println(error.getMessage());
		    System.out.println(error.getStackTrace());
		}
		SpawnEggCraftConfig.SaveConfig();
		//Items
		//Specimen
	    SpawnEggCraft_String = "Specimen";
	    Specimen = new SpawnEggCraftAddItems();
	    Specimen.setUnlocalizedName(SpawnEggCraft_String).setTextureName("fxz:"+SpawnEggCraft_String).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(Specimen, SpawnEggCraft_String);
		
		//Blocks
		//SpawnEggCopyingMachine
		SpawnEggCopyingMachine = new SpawnEggCraftAddBlocks(Material.rock);
		SpawnEggCopyingMachine.setBlockName("SpawnEggCopyingMachine");
		SpawnEggCopyingMachine.setBlockTextureName("fxz:SpawnEggCopyingMachine");
		SpawnEggCopyingMachine.setHardness(3.0f); 
		SpawnEggCopyingMachine.setResistance(20.0f);
		SpawnEggCopyingMachine.setLightLevel(0.0f);
		SpawnEggCopyingMachine.setStepSound(Block.soundTypeStone);
		SpawnEggCopyingMachine.setCreativeTab(CreativeTabs.tabDecorations);
		SpawnEggCopyingMachine.setHarvestLevel("pickaxe", -1);
		GameRegistry.registerBlock(SpawnEggCopyingMachine,"SpawnEggCopyingMachine");
		}
 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	    LANZ_JBU=Integer.valueOf(Number);
				//Recipes
				//spawn_eggs
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
					Character.valueOf('0'), new ItemStack(Items.egg, Integer.valueOf(NumberofSlimeInput)),
					Character.valueOf('1'), new ItemStack(Items.wheat_seeds, Integer.valueOf(NumberofSlimeInput)), 
					Character.valueOf('2'), new ItemStack(Items.slime_ball, Integer.valueOf(NumberofSlimeInput)), 
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
				//Specimen
				GameRegistry.addRecipe(new ItemStack(Specimen,1), new Object[]{
					"01",
					Character.valueOf('0'), new ItemStack(Items.book, 1),
					Character.valueOf('1'), new ItemStack(Items.nether_star, 1), 
				});
				
				MinecraftForge.EVENT_BUS.register(this);
				FMLCommonHandler.instance().bus().register(this);
		
		}
	
	
	@SubscribeEvent
	public void LivingDeath(LivingDeathEvent event){
		if(!event.entity.worldObj.isRemote){
			if(
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.moster.EntityCreeper"||String.valueOf(event.entity.getClass().getName())=="xz"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityZombie"||String.valueOf(event.entity.getClass().getName())=="yq"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntitySkeleton"||String.valueOf(event.entity.getClass().getName())=="yl"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntitySpider"||String.valueOf(event.entity.getClass().getName())=="yo"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityCaveSpider"||String.valueOf(event.entity.getClass().getName())=="xy"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityPigZombie"||String.valueOf(event.entity.getClass().getName())=="yh"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityBlaze"||String.valueOf(event.entity.getClass().getName())=="xx"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityGhast"||String.valueOf(event.entity.getClass().getName())=="yd"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntitySlime"||String.valueOf(event.entity.getClass().getName())=="ym"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityMagmaCube"||String.valueOf(event.entity.getClass().getName())=="yf"
					||
					String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityEnderman"||String.valueOf(event.entity.getClass().getName())=="ya"
					
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
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityCow"||String.valueOf(event.entity.getClass().getName())=="wh"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntitySheep"||String.valueOf(event.entity.getClass().getName())=="wp"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityPig"||String.valueOf(event.entity.getClass().getName())=="wo"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityChicken"||String.valueOf(event.entity.getClass().getName())=="wg"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityMooshroom"||String.valueOf(event.entity.getClass().getName())=="wm"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityBat"||String.valueOf(event.entity.getClass().getName())=="we"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityOcelot"||String.valueOf(event.entity.getClass().getName())=="wn"
            	||
            	String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.passive.EntityWolf"||String.valueOf(event.entity.getClass().getName())=="wv"
    			)
    			
            {
    			if((Math.abs(ran1.nextLong())%(Math.abs(ran2.nextLong()%400)+100)==127)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY + (double)0.0F, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            }else if(event.entity.isBurning()==true&&
            		(String.valueOf(event.entity.getClass().getName())=="net.minecraft.entity.moster.EntityWitch"||String.valueOf(event.entity.getClass().getName())=="yp")
            		)
            {
            	if((Math.abs(ran1.nextLong())%50)==25){
            	EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY + (double)0.0F, event.entity.posZ, new ItemStack(Items.experience_bottle,(int)(ran1.nextInt()%9)));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
            	}
            }
		}
	}
	
}
