package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SpawnEggCraftAddBlocks extends Block{

	protected SpawnEggCraftAddBlocks(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_1_.isRemote)
        {
            return true;
        }
        else
        {
        	 Minecraft mc = Minecraft.getMinecraft();
             mc.displayGuiScreen(new SpawnEggCraftGUIOfSpawnEggCopyingMachine(mc.currentScreen));
            return true;
        }
    };
    
    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
           // TODO Auto-generated method stub
           return new SpawnEggCraftTileEntityCopyingMachine();
    }
    
    
}
