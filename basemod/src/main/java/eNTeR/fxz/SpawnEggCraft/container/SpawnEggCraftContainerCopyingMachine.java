package eNTeR.fxz.SpawnEggCraft.container;

import eNTeR.fxz.SpawnEggCraft.tileentity.SpawnEggCraftTileEntityCopyingMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class SpawnEggCraftContainerCopyingMachine extends Container{

    /**在Container中放TileEntity句柄方便访问*/
    private SpawnEggCraftTileEntityCopyingMachine theTile;
    
    public SpawnEggCraftContainerCopyingMachine(SpawnEggCraftTileEntityCopyingMachine tileEntity, InventoryPlayer invPlayer) {
        bindTileSlots(tileEntity);
        bindPlayerSlots(invPlayer);
        theTile = tileEntity;
    }
    
    /**
     * 绑定TileEntity的物品槽。
     * @param t
     */
    private void bindTileSlots(SpawnEggCraftTileEntityCopyingMachine t){}
    
    /**
     * 绑定玩家物品栏。
     * @param inv
     */
    private void bindPlayerSlots(InventoryPlayer inv){}

    @Override
    /**
     * 判定它能否被使用，在这里调用TileEntity中的判读函数。
     */
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return theTile.isUseableByPlayer(entityplayer);
    }

}
