package eNTeR.fxz.spawneggcraft.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import eNTeR.fxz.spawneggcraft.SpawnEggCraft;
import eNTeR.fxz.spawneggcraft.block.SpawnEggCraftTileEntityCopyingMachine;

public class SpawnEggCopyingMachineGuiHandler implements IGuiHandler {

	public static final Object instance = new SpawnEggCopyingMachineGuiHandler();
    
    /**
     * 返回服务器端的GUI元素，对于方块GUI，返回一个Container子类，或null。
     */
	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
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

    /**
     * 返回客户端的GUI元素。对于方块GUI，返回一个Gui子类。
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
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

