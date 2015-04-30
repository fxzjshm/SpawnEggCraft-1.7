package eNTeR.fxz.spawneggcraft;

import java.io.File;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.google.common.eventbus.EventBus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
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
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.VersionRange;
import eNTeR.fxz.spawneggcraft.block.CopyingMachine;
import eNTeR.fxz.spawneggcraft.block.SpawnEggCraftTileEntityCopyingMachine;
import eNTeR.fxz.spawneggcraft.config.SpawnEggCraftConfig;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCopyingMachineGUI;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCopyingMachineGuiHandler;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCraftContainerCopyingMachine;
import eNTeR.fxz.spawneggcraft.registrecipe.SpawnEggCraftRegisty;

/**@author fxz*/
@Mod(modid=SpawnEggCraft.modid, name=SpawnEggCraft.name, version=SpawnEggCraft.version)

public class SpawnEggCraft implements IGuiHandler,ModContainer {
	public static final String modid ="SpawnEggCraft_basemod";
	public static final String name ="SpawnEggCraft_basemod";
	public static final String version ="0.1.1";
    public static int LANZ_JBU = 1;
    public static String IsDoubleCraft = "true";
    public static Item Specimen = new eNTeR.fxz.spawneggcraft.item.Specimen();
    public static Block SpawnEggCopyingMachine = new CopyingMachine(Material.rock);
    public static Block BlockSlime = new net.minecraft.block.BlockSlime();
	public final static SpawnEggCraft instance = new SpawnEggCraft();
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
	    Specimen.setUnlocalizedName("Specimen").setTextureName("fxz:Specimen").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(Specimen, "Specimen");
		
		//Blocks
		//SpawnEggCopyingMachine
		SpawnEggCopyingMachine.setBlockName("SpawnEggCopyingMachine").setBlockTextureName("fxz:SpawnEggCopyingMachine").setHardness(3.0f).setResistance(20.0f).setCreativeTab(CreativeTabs.tabDecorations);
		GameRegistry.registerBlock(SpawnEggCopyingMachine,"SpawnEggCopyingMachine");
		GameRegistry.registerTileEntity(SpawnEggCraftTileEntityCopyingMachine.class, "SpawnEggCopyingTileEntity");
		//BlockSlime
		BlockSlime.setBlockName("BlockSlime");
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
		NetworkRegistry.INSTANCE.registerGuiHandler((Object)SpawnEggCraft.instance, this);
		//Event_Bus
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
		//ModContainer
		//Warning
		//TODO Check It
		//NetworkRegistry.INSTANCE.register(this, SpawnEggCraft.class, "0.1.1", new SpawnEggCraftASMDataTable());
	}
	
	@SubscribeEvent
	public static void LivingDeathEvent(LivingDeathEvent event){
		String EntityName = event.entity.getClass().getName();
		String KillerName = null;
		try{
		KillerName = event.source.getEntity().getClass().getName();
		}
		catch(Exception error){
			System.out.println(error.getMessage());
			System.out.println(error.getStackTrace());
		}
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
            		(
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
    			&&
    				(
    						KillerName=="net.minecraft.entity.moster.EntityCreeper"||KillerName=="xz"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityZombie"||KillerName=="yq"
    						||
    						KillerName=="net.minecraft.entity.passive.EntitySkeleton"||KillerName=="yl"
    						||
    						KillerName=="net.minecraft.entity.passive.EntitySpider"||KillerName=="yo"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityCaveSpider"||KillerName=="xy"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityPigZombie"||KillerName=="yh"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityBlaze"||KillerName=="xx"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityGhast"||KillerName=="yd"
    						||
    						KillerName=="net.minecraft.entity.passive.EntitySlime"||KillerName=="ym"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityMagmaCube"||KillerName=="yf"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityEnderman"||KillerName=="ya"
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
	
	@SubscribeEvent
	public static void LivingFallEvent_BlockSlime(LivingFallEvent event){
		System.out.println(event.entityLiving.worldObj.getBlock(event.entityLiving.serverPosX, (event.entityLiving.serverPosY)-1, event.entityLiving.serverPosZ).getClass().getName());
		if(event.entityLiving.worldObj.getBlock(event.entityLiving.serverPosX, (event.entityLiving.serverPosY)-1, event.entityLiving.serverPosZ)==SpawnEggCraft.BlockSlime){}
	}

    @Override
    /**
     * 返回服务器端的GUI元素，对于方块GUI，返回一个Container子类，或null。
     */
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	player.addChatMessage(new ChatComponentText("getServerGuiElement"));
    	player.addChatMessage(new ChatComponentText("ID=="+ID));
        if(ID == SpawnEggCraft.GUI_ID_SAMPLE) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            //简单的错误检查
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
     * 返回客户端的GUI元素。对于方块GUI，返回一个Gui子类。
     */
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	player.addChatMessage(new ChatComponentText("getClientGuiElement"));
    	player.addChatMessage(new ChatComponentText("ID=="+ID));
        if(ID == SpawnEggCraft.GUI_ID_SAMPLE) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            //简单的错误检查
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
