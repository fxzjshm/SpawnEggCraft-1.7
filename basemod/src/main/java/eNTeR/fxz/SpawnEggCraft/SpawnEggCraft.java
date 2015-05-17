package eNTeR.fxz.spawneggcraft;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eNTeR.fxz.spawneggcraft.block.CopyingMachine;
import eNTeR.fxz.spawneggcraft.block.SpawnEggCraftTileEntityCopyingMachine;
import eNTeR.fxz.spawneggcraft.command.CommandBoom;
import eNTeR.fxz.spawneggcraft.config.SpawnEggCraftConfig;

/**The main class of SpawnEggCraft.
 * 
 * @author fxz*/
@Mod(modid=SpawnEggCraft.modid, name=SpawnEggCraft.name, version=SpawnEggCraft.version)
public class SpawnEggCraft {
	/**The ID of this mod.*/
	public static final String modid ="SpawnEggCraft";
	/**A user friendly name for this mod.*/
	public static final String name ="SpawnEggCraft";
	/**The version of this mod.*/
	public static final String version ="0.1.1";
	/**The number of the recipe output with spawn eggs.*/
    public static int LANZ_JBU = 1;
    /**The item : Specimen.*/
    public static final Item Specimen = new eNTeR.fxz.spawneggcraft.item.Specimen().setUnlocalizedName("Specimen").setTextureName("fxz:Specimen").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMisc);
    /**The block: Copying machine of spawn eggs.*/
    public static final Block SpawnEggCopyingMachine = new CopyingMachine(Material.rock).setBlockName("SpawnEggCopyingMachine").setBlockTextureName("fxz:SpawnEggCopyingMachine").setHardness(3.0f).setResistance(20.0f).setCreativeTab(CreativeTabs.tabDecorations);
    /**The block: Slime block which in 1.8.*/
    public static final Block BlockSlime = new net.minecraft.block.BlockSlime().setBlockName("BlockSlime");
	/**The instance of this class.*/
    public static final SpawnEggCraft instance = new SpawnEggCraft();
    /**An instance of java.util.Random.*/
	public static Random ran1=new Random();
	/**The number of the recipe output with spawn eggs.*/
	public static String Number = "2";
	/**The ID of GUI of Copying machine of spawn eggs.*/
	public static final int GUI_ID_SAMPLE = 20;
	public static final String classNameFront_passive = "net.minecraft.entity.passive.Entity";
	public static final String classNameFront_moster = "net.minecraft.entity.moster.Entity";
    
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
		GameRegistry.registerItem(Specimen, "Specimen");
		
		//Blocks
		//SpawnEggCopyingMachine
		GameRegistry.registerBlock(SpawnEggCopyingMachine,"SpawnEggCopyingMachine");
		GameRegistry.registerTileEntity(SpawnEggCraftTileEntityCopyingMachine.class, "SpawnEggCopyingTileEntity");
		//BlockSlime
		GameRegistry.registerBlock(BlockSlime,"BlockSlime");
		
		//GuiHandler
		//NetworkRegistry.INSTANCE.registerGuiHandler(this, new SpawnEggCopyingMachineGuiHandler());

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
			Character.valueOf('2'), new ItemStack(SpawnEggCraft.BlockSlime,1), 
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
		GameRegistry.addRecipe(new ItemStack(SpawnEggCraft.Specimen,1), new Object[]{
			"01",
			Character.valueOf('0'), new ItemStack(Items.book, 1),
			Character.valueOf('1'), new ItemStack(Items.nether_star, 1), 
		});
		//SlimeBall
		GameRegistry.addRecipe(new ItemStack(Items.slime_ball, 9), new Object[]{
			"0",
			Character.valueOf('0'), new ItemStack(SpawnEggCraft.BlockSlime, 1),
		});
		//Blocks
		//BlockSlime
		GameRegistry.addRecipe(new ItemStack(SpawnEggCraft.BlockSlime,1), new Object[]{
			"000",
			"000",
			"000",
			Character.valueOf('0'), new ItemStack(Items.slime_ball, 1),
		});
	    
		//registry
		//Event_Bus
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
	}
	
	@SideOnly(Side.SERVER)
	@SubscribeEvent
	public void LivingDeathEvent(LivingDeathEvent event){
		String EntityName = event.entity.getClass().getName();
		String KillerName = null;
		boolean IsSuccessful = true;
		try{
		KillerName = event.source.getEntity().getClass().getName();
		}
		catch(Exception error){
			System.out.println("Falled to get killer's name.Sorry!");
			IsSuccessful = false;
			if((Math.abs(ran1.nextLong())%(Math.abs(ran1.nextLong()%400)+100)==127)&&
					(
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Cow")||EntityName.equalsIgnoreCase("wh")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Sheep")||EntityName.equalsIgnoreCase("wp")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Pig")||EntityName.equalsIgnoreCase("wo")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Chicken")||EntityName.equalsIgnoreCase("wg")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Mooshroom")||EntityName.equalsIgnoreCase("wm")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Bat")||EntityName.equalsIgnoreCase("we")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Ocelot")||EntityName.equalsIgnoreCase("wn")
            		||
            		EntityName.equalsIgnoreCase(classNameFront_passive+"Wolf")||EntityName.equalsIgnoreCase("wv")
            		)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    		}
		}
		if(!event.entity.worldObj.isRemote){
			if(
					EntityName.equalsIgnoreCase(classNameFront_moster+"Creeper")||EntityName.equalsIgnoreCase("xz")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Zombie")||EntityName.equalsIgnoreCase("yq")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Skeleton")||EntityName.equalsIgnoreCase("yl")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Spider")||EntityName.equalsIgnoreCase("yo")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"CaveSpider")||EntityName.equalsIgnoreCase("xy")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"PigZombie")||EntityName.equalsIgnoreCase("yh")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Blaze")||EntityName.equalsIgnoreCase("xx")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Ghast")||EntityName.equalsIgnoreCase("yd")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Slime")||EntityName.equalsIgnoreCase("ym")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"MagmaCube")||EntityName.equalsIgnoreCase("yf")
					||
					EntityName.equalsIgnoreCase(classNameFront_moster+"Enderman")||EntityName.equalsIgnoreCase("ya")
					
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
            		(IsSuccessful == true)
            		&&
            		(
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Cow")||EntityName.equalsIgnoreCase("wh")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Sheep")||EntityName.equalsIgnoreCase("wp")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Pig")||EntityName.equalsIgnoreCase("wo")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Chicken")||EntityName.equalsIgnoreCase("wg")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Mooshroom")||EntityName.equalsIgnoreCase("wm")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Bat")||EntityName.equalsIgnoreCase("we")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Ocelot")||EntityName.equalsIgnoreCase("wn")
                    		||
                    		EntityName.equalsIgnoreCase(classNameFront_passive+"Wolf")||EntityName.equalsIgnoreCase("wv")
            		)
    			&&
    				(
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Creeper")||KillerName.equalsIgnoreCase("xz")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Zombie")||KillerName.equalsIgnoreCase("yq")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Skeleton")||KillerName.equalsIgnoreCase("yl")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Spider")||KillerName.equalsIgnoreCase("yo")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"CaveSpider")||KillerName.equalsIgnoreCase("xy")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"PigZombie")||KillerName.equalsIgnoreCase("yh")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Blaze")||KillerName.equalsIgnoreCase("xx")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Ghast")||KillerName.equalsIgnoreCase("yd")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Slime")||KillerName.equalsIgnoreCase("ym")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"MagmaCube")||KillerName.equalsIgnoreCase("yf")
    						||
    						KillerName.equalsIgnoreCase(classNameFront_moster+"Enderman")||KillerName.equalsIgnoreCase("ya")
    				)
    			)
    			
            {
    			if((Math.abs(ran1.nextLong())%100==64)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            }else if(event.entity.isBurning()==true&&
            		(EntityName.equalsIgnoreCase("net.minecraft.entity.moster.EntityWitch")||EntityName.equalsIgnoreCase("yp"))
            		)
            {
            	if((Math.abs(ran1.nextLong())%50)==25){
            	EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.experience_bottle,(int)((ran1.nextInt()%9)+1)));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
            	}
            }
		}
	}
	
    /**@author szszss*/
	@SideOnly(Side.SERVER)
    @SubscribeEvent
    public void letsrock(ServerChatEvent event)
    {
        if(event.message.equalsIgnoreCase("KABOOM"))
        {
            event.setCanceled(true);//截获玩家的指令并不让它显示在屏幕�?,用来模拟游戏指令(Command)
            EntityPlayer player = event.player;
            //player.addChatMessage(new ChatComponentText("Thanks,szszss."));//欢迎来到冥界,宇佐见莲�?.
                //这个长的让人发指的东西是获取玩家附近的生�?
                List<?> list = player.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(player.posX-30D, player.posY-20D, player.posZ-30D, player.posX+30D, player.posY+20D, player.posZ+30D));
                //值得�?提的是我这里使用的是遍历�?,传统的下标遍历因为无法锁定资源可能导致ConcurrentModificationException...
                for(Iterator<?> iterator = list.iterator();iterator.hasNext();)
                {
                    EntityLiving entity = (EntityLiving)iterator.next();
                    if(entity.equals(player)) //别把自己也给炸了...
                    {
                        continue;
                    }
                    if(entity instanceof EntityDragon || entity instanceof EntityWither){
                    	player.worldObj.createExplosion(player, entity.posX, entity.posY, entity.posZ, 8f, false);
                    	continue;
                    }
                    player.worldObj.createExplosion(player, entity.posX, entity.posY, entity.posZ, 4f, false);
                }
        }
    }
    
	/**@author darkyoooooo*/
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        ServerCommandManager serverCommandManager = (ServerCommandManager) event.getServer().getCommandManager();
        serverCommandManager.registerCommand(new CommandBoom());
     }
    
    //TODO
    @SideOnly(Side.SERVER)
    @SubscribeEvent(priority = EventPriority.HIGHEST,receiveCanceled = true)
    public void livingFallEvent(LivingFallEvent event){
    	if(event.entityLiving.isClientWorld()){
    	int x = (int)event.entityLiving.posX;
    	int y = (int)event.entityLiving.posY;
    	int z = (int)event.entityLiving.posZ;
    	Block block = event.entityLiving.worldObj.getBlock((int)event.entityLiving.posX, (int)event.entityLiving.posY - 1, (int)event.entityLiving.posZ);
    	System.out.println(event.entityLiving.getClass().getName()+" : " + block.getClass().getName() + " X:" + x + " Y:" + y + " Z:" + z);
    	if (block.equals(BlockSlime)) {
    		if (event.distance < 0.5F) {
    			event.distance = 0.0F;
    			return;
    		}
    		event.entityLiving.posY = event.entityLiving.posY + event.distance * 0.8F;
    		event.distance = 0;
    		event.setCanceled(true);
    	}
    	}
    }
}
