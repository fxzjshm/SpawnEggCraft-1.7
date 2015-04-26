package eNTeR.fxz.SpawnEggCraft.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import eNTeR.fxz.SpawnEggCraft.SpawnEggCraft;
import eNTeR.fxz.SpawnEggCraft.container.SpawnEggCraftContainerCopyingMachine;
import eNTeR.fxz.SpawnEggCraft.tileentity.SpawnEggCraftTileEntityCopyingMachine;

public class SpawnEggCopyingMachineGuiHandler implements IGuiHandler {

	public static final Object instance = new SpawnEggCopyingMachineGuiHandler();
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

	}

