package eNTeR.fxz.spawneggcraft.block;

import cpw.mods.fml.common.FMLCommonHandler;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCopyingMachineGUI;
import eNTeR.fxz.spawneggcraft.gui.SpawnEggCraftContainerCopyingMachine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class CopyingMachine extends BlockContainer{

	public CopyingMachine(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	@SuppressWarnings("finally")
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		TileEntity tileEntity = p_149727_1_.getTileEntity(p_149727_2_,p_149727_3_,p_149727_4_);
        //如果TileEntity没有被加载或者玩家在潜行，则不打开GUI。
        if (tileEntity == null || p_149727_5_.isSneaking()) {
                return false;
        }
        //在这里打开GUI：参数1为Mod实例类，参数2为GUI的ID（在主类中声明），后面的参数分别是世界和坐标
        	try{
        		if(!p_149727_1_.isRemote){
            		//FMLNetworkHandler.openGui(p_149727_5_,(Object)new SpawnEggCraft(), SpawnEggCraft.GUI_ID_SAMPLE, p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
            		
            		
        	        if (p_149727_5_ instanceof EntityPlayerMP)
        	        {
        	            EntityPlayerMP entityPlayerMP = (EntityPlayerMP) p_149727_5_;
        	            Container remoteGuiContainer = new SpawnEggCraftContainerCopyingMachine((SpawnEggCraftTileEntityCopyingMachine)p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_), p_149727_5_.inventory);
        	            if (remoteGuiContainer != null)
        	            {
        	                entityPlayerMP.getNextWindowId();
        	                entityPlayerMP.closeContainer();
        	                int windowId = entityPlayerMP.currentWindowId;
        	                //FMLMessage.OpenGui openGui = new FMLMessage.OpenGui(windowId, SpawnEggCraft.modid, SpawnEggCraft.GUI_ID_SAMPLE, p_149727_2_, p_149727_3_, p_149727_4_);
        	                //EmbeddedChannel embeddedChannel = cpw.mods.fml.common.network.internal.FMLNetworkHandler.channelPair.get(Side.SERVER);
        	                //embeddedChannel.attr(FMLOutboundHandler.FML_MESSAGETARGET).set(OutboundTarget.PLAYER);
        	                //embeddedChannel.attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(entityPlayerMP);
        	                //embeddedChannel.writeOutbound(openGui);
        	                entityPlayerMP.openContainer = remoteGuiContainer;
        	                entityPlayerMP.openContainer.windowId = windowId;
        	                entityPlayerMP.openContainer.addCraftingToCrafters(entityPlayerMP);
        	            }
        	        }
            		
        		}else{
        			FMLCommonHandler.instance().showGuiScreen(new SpawnEggCopyingMachineGUI((SpawnEggCraftTileEntityCopyingMachine)p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_), p_149727_5_.inventory));
        		}
        		}
        	catch(Exception error){
        		p_149727_5_.addChatMessage(new ChatComponentText(error.getMessage()));
    		    p_149727_5_.addChatMessage(new ChatComponentText(error.getStackTrace().toString()));
    		    p_149727_5_.addChatMessage(new ChatComponentText(error.getLocalizedMessage()));
    		    p_149727_5_.addChatMessage(new ChatComponentText(error.toString()));
    		    p_149727_5_.addChatMessage(new ChatComponentText("GUI has crashed!"));
        	}
        	finally{
        		return true;
        		}
        	//}
        
        
    }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new SpawnEggCraftTileEntityCopyingMachine();
	}
    
    
}
