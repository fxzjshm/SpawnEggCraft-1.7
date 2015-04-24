package eNTeR.fxz.SpawnEggCraft.block;

import eNTeR.fxz.SpawnEggCraft.SpawnEggCraft;
import eNTeR.fxz.SpawnEggCraft.tileentity.*;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
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
        //try{
        //p_149727_5_.openGui(SpawnEggCopyingMachineGuiHandler.instance, SpawnEggCraft.GUI_ID_SAMPLE, p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
        //}
        //catch(Exception error){
		    //System.out.println(error.getMessage());
		    //System.out.println(error.getStackTrace());
        //}
        //finally{
        	try{
        		p_149727_5_.openGui(SpawnEggCraft.instance, SpawnEggCraft.GUI_ID_SAMPLE, p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
        }
        	catch(Exception error){
    		    System.out.println(error.getMessage());
    		    System.out.println(error.getStackTrace());
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
