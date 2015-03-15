package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class SpawnEggCraftAddItems extends Item{
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par3EntityPlayer,World par2World, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if(!par2World.isRemote){
			x += Facing.offsetsXForSide[par7];
            y += Facing.offsetsYForSide[par7];
            z += Facing.offsetsZForSide[par7];
            
			//AddCodes
            
			if(par1ItemStack.getUnlocalizedName()=="item.MobSpawner_Chicken")
			{
			Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)93, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
			par2World.spawnEntityInWorld(entity1);
			}
			
			EntityMinecart entityMinecart = EntityMinecart.createMinecart(par2World, (int)x + 0.5, (int)y + 0.5, (int)z + 0.5, 0);
			par2World.spawnEntityInWorld(entityMinecart);

			
	        if (!par3EntityPlayer.capabilities.isCreativeMode)
	        {
	            --par1ItemStack.stackSize;
	        }
		
		}
		return false;
	}
}
