package eNTeR.fxz.spawneggcraft;

import java.io.File;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.google.common.eventbus.EventBus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.VersionRange;
import eNTeR.fxz.spawneggcraft.asmdatatable.SpawnEggCraftASMDataTable;
import eNTeR.fxz.spawneggcraft.block.CopyingMachine;
import eNTeR.fxz.spawneggcraft.block.SpawnEggCraftTileEntityCopyingMachine;
import eNTeR.fxz.spawneggcraft.config.SpawnEggCraftConfig;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCopyingMachineGUI;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCopyingMachineGuiHandler;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCraftContainerCopyingMachine;
import eNTeR.fxz.spawneggcraft.registrecipe.SpawnEggCraftRegisty;

/**The main class of SpawnEggCraft.
 * 
 * @author fxz*/
@Mod(modid=SpawnEggCraft.modid, name=SpawnEggCraft.name, version=SpawnEggCraft.version)
public class SpawnEggCraft implements IGuiHandler,ModContainer {
	/**The ID of this mod.*/
	public static final String modid ="SpawnEggCraft_basemod";
	/**A user friendly name for this mod.*/
	public static final String name ="SpawnEggCraft_basemod";
	/**The version of this mod.*/
	public static final String version ="0.1.1";
	/**The number of the recipe output with spawn eggs.*/
    public static int LANZ_JBU = 1;
    /**The item : Specimen.*/
    public static Item Specimen = new eNTeR.fxz.spawneggcraft.item.Specimen().setUnlocalizedName("Specimen").setTextureName("fxz:Specimen").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMisc);
    /**The block: Copying machine of spawn eggs.*/
    public static Block SpawnEggCopyingMachine = new CopyingMachine(Material.rock).setBlockName("SpawnEggCopyingMachine").setBlockTextureName("fxz:SpawnEggCopyingMachine").setHardness(3.0f).setResistance(20.0f).setCreativeTab(CreativeTabs.tabDecorations);
    /**The block: Slime block which in 1.8.*/
    public static Block BlockSlime = new net.minecraft.block.BlockSlime().setBlockName("BlockSlime");
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

		}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	    LANZ_JBU=Integer.valueOf(Number);
	    SpawnEggCraftRegisty.SpawnEggCraftRegistRecipe(LANZ_JBU);
	    
		//registry
		//GUIHandler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new SpawnEggCopyingMachineGuiHandler());
		//TODO ?
		//NetworkRegistry.INSTANCE.registerGuiHandler((Object)SpawnEggCraft.instance, this);
		//Event_Bus
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
		//ModContainer
		//Warning
		//TODO Check It
		NetworkRegistry.INSTANCE.register(this, SpawnEggCraft.class, "0.1.1", new SpawnEggCraftASMDataTable());
	}
	
	@SubscribeEvent
	public void LivingDeathEvent(LivingDeathEvent event){
		String EntityName = event.entity.getClass().getName();
		String KillerName = null;
		try{
		KillerName = event.source.getEntity().getClass().getName();
		}
		catch(Exception error){
			EntityPlayer entityPlayer = (EntityPlayer)event.entity;
			entityPlayer.addChatMessage(new ChatComponentText("Falled to get killer's name.Sorry!"));
			if((Math.abs(ran1.nextLong())%(Math.abs(ran1.nextLong()%400)+100)==127)&&
					(
            		EntityName==classNameFront_passive+"Cow"||EntityName=="wh"
            		||
            		EntityName==classNameFront_passive+"Sheep"||EntityName=="wp"
            		||
            		EntityName==classNameFront_passive+"Pig"||EntityName=="wo"
            		||
            		EntityName==classNameFront_passive+"Chicken"||EntityName=="wg"
            		||
            		EntityName==classNameFront_passive+"Mooshroom"||EntityName=="wm"
            		||
            		EntityName==classNameFront_passive+"Bat"||EntityName=="we"
            		||
            		EntityName==classNameFront_passive+"Ocelot"||EntityName=="wn"
            		||
            		EntityName==classNameFront_passive+"Wolf"||EntityName=="wv"
            		)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    		}
		}
		if(!event.entity.worldObj.isRemote){
			if(
					EntityName==classNameFront_moster+"Creeper"||EntityName=="xz"
					||
					EntityName==classNameFront_moster+"Zombie"||EntityName=="yq"
					||
					EntityName==classNameFront_moster+"Skeleton"||EntityName=="yl"
					||
					EntityName==classNameFront_moster+"Spider"||EntityName=="yo"
					||
					EntityName==classNameFront_moster+"CaveSpider"||EntityName=="xy"
					||
					EntityName==classNameFront_moster+"PigZombie"||EntityName=="yh"
					||
					EntityName==classNameFront_moster+"Blaze"||EntityName=="xx"
					||
					EntityName==classNameFront_moster+"Ghast"||EntityName=="yd"
					||
					EntityName==classNameFront_moster+"Slime"||EntityName=="ym"
					||
					EntityName==classNameFront_moster+"MagmaCube"||EntityName=="yf"
					||
					EntityName==classNameFront_moster+"Enderman"||EntityName=="ya"
					
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
            		(
            		EntityName==classNameFront_passive+"Cow"||EntityName=="wh"
            		||
            		EntityName==classNameFront_passive+"Sheep"||EntityName=="wp"
            		||
            		EntityName==classNameFront_passive+"Pig"||EntityName=="wo"
            		||
            		EntityName==classNameFront_passive+"Chicken"||EntityName=="wg"
            		||
            		EntityName==classNameFront_passive+"Mooshroom"||EntityName=="wm"
            		||
            		EntityName==classNameFront_passive+"Bat"||EntityName=="we"
            		||
            		EntityName==classNameFront_passive+"Ocelot"||EntityName=="wn"
            		||
            		EntityName==classNameFront_passive+"Wolf"||EntityName=="wv"
            		)
    			&&
    				(
    						KillerName==classNameFront_moster+"Creeper"||KillerName=="xz"
    						||
    						KillerName==classNameFront_moster+"Zombie"||KillerName=="yq"
    						||
    						KillerName==classNameFront_moster+"Skeleton"||KillerName=="yl"
    						||
    						KillerName==classNameFront_moster+"Spider"||KillerName=="yo"
    						||
    						KillerName==classNameFront_moster+"CaveSpider"||KillerName=="xy"
    						||
    						KillerName==classNameFront_moster+"PigZombie"||KillerName=="yh"
    						||
    						KillerName==classNameFront_moster+"Blaze"||KillerName=="xx"
    						||
    						KillerName==classNameFront_moster+"Ghast"||KillerName=="yd"
    						||
    						KillerName==classNameFront_moster+"Slime"||KillerName=="ym"
    						||
    						KillerName==classNameFront_moster+"MagmaCube"||KillerName=="yf"
    						||
    						KillerName==classNameFront_moster+"Enderman"||KillerName=="ya"
    				)
    			)
    			
            {
    			if((Math.abs(ran1.nextLong())%100==64)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            }else if(event.entity.isBurning()==true&&
            		(EntityName=="net.minecraft.entity.moster.EntityWitch"||EntityName=="yp")
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
	
	/*@SubscribeEvent
	public void LivingFallEvent_BlockSlime(LivingFallEvent event){
		System.out.println(event.entityLiving.worldObj.getBlock(event.entityLiving.serverPosX, (event.entityLiving.serverPosY)-1, event.entityLiving.serverPosZ).getClass().getName());
		if(event.entityLiving.worldObj.getBlock(event.entityLiving.serverPosX, (event.entityLiving.serverPosY)-1, event.entityLiving.serverPosZ)==SpawnEggCraft.BlockSlime){}
	}*/

    @Override
    /**
     * 返回服务器端的GUI元素，对于方块GUI，返回一个Container子类，或null�?
     */
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	player.addChatMessage(new ChatComponentText("getServerGuiElement"));
    	player.addChatMessage(new ChatComponentText("ID=="+ID));
        if(ID == SpawnEggCraft.GUI_ID_SAMPLE) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            //�?单的错误�?�?
            if(tileEntity == null || !(tileEntity instanceof SpawnEggCraftTileEntityCopyingMachine)){
                return null;
        }else{
            return new SpawnEggCraftContainerCopyingMachine((SpawnEggCraftTileEntityCopyingMachine)tileEntity, player.inventory);
            }
            }
        return null;
    }

    @Override
    /**
     * 返回客户端的GUI元素。对于方块GUI，返回一个Gui子类�?
     */
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	player.addChatMessage(new ChatComponentText("getClientGuiElement"));
    	player.addChatMessage(new ChatComponentText("ID==" + ID));
        if(ID == SpawnEggCraft.GUI_ID_SAMPLE) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            //�?单的错误�?�?
            if(tileEntity == null || !(tileEntity instanceof SpawnEggCraftTileEntityCopyingMachine)){
                return null;
            }
            else
            {
            return new SpawnEggCopyingMachineGUI((SpawnEggCraftTileEntityCopyingMachine)tileEntity, player.inventory);
            }
            }
        return null;
    }
    
    @SubscribeEvent
    public void letsrock(ServerChatEvent event)
    {
        if(event.message.equals("KABOOM"))
        {
            event.setCanceled(true);//截获玩家的指令并不让它显示在屏幕�?,用来模拟游戏指令(Command)
            EntityPlayer player = event.player;
            EventHANDRU eventHANDRU = new EventHANDRU(player);//初始化一个事�?
            MinecraftForge.EVENT_BUS.post(eventHANDRU);//发布�?
            if(eventHANDRU.getResult() == Result.ALLOW)
            {
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
    }
 
    @SubscribeEvent
    public void goodbyeRenko(EventHANDRU event)
    {
    	event.entityPlayer.addChatMessage(new ChatComponentText("Thanks,szszss."));//欢迎来到冥界,宇佐见莲�?.
        event.setResult(Result.ALLOW);
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
	public String getGuiClassName() {
		// TODO Auto-generated method stub
		return "eNTeR.fxz.SpawnEggCraft.SpawnEggCopyingMachineGUI";
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
	public List<String> getOwnedPackages() {
		// TODO Auto-generated method stub
		return null;
	}
}
