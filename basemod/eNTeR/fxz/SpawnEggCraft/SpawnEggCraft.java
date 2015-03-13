package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=SpawnEggCraft.MODID, name=SpawnEggCraft.NAME, version=SpawnEggCraft.VERSION)
//@Mod(modid="SpawnEggCraft", name="SpawnEggCraft", version="0.0.1")
public class SpawnEggCraft {
    public static final String MODID = "SpawnEggCraft_basemod";
    public static final String NAME = "SpawnEggCraft";
    public static final String VERSION = "0.0.1";
    public static int LANZ_JBU = 1;
    public static String IsDoubleCraft = "true";
    public static String IsNotPeaceful = "true";
    //public static File ConfigFile = new File("\\config\\SpawnEggCraft.cfg");//!
    
    
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) throws Exception
	{
		
		/*SpawnEggCraftConfig.InitliazeConfig(ConfigFile);
		System.out.println("IsDoubleCraft == " + IsDoubleCraft);
		System.out.println("IsNotPeaceful == " + IsNotPeaceful);
		IsDoubleCraft = SpawnEggCraftConfig.GetGeneralProperties("IsDoubleCraft","true");
		IsNotPeaceful = SpawnEggCraftConfig.GetGeneralProperties("IsNotPeaceful","");
		System.out.println("IsDoubleCraft == " + IsDoubleCraft);
		System.out.println("IsNotPeaceful == " + IsNotPeaceful);*/
	    if(IsDoubleCraft=="true")
	    {
	    	LANZ_JBU=2;
	    }
		
		//Mob
		
		//EntityRegistry.registerModEntity(EntityAnimal.class,"Chicken_SpawnEggCraft",1,this,64,3,true);
		  
		 
		}
		

	 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
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
		if(IsNotPeaceful == "true")
		{
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
			Character.valueOf('0'), new ItemStack(Items.egg, 1),
			Character.valueOf('1'), new ItemStack(Items.wheat_seeds, 1), 
			Character.valueOf('2'), new ItemStack(Items.slime_ball, 1), 
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
		}
	} 
}