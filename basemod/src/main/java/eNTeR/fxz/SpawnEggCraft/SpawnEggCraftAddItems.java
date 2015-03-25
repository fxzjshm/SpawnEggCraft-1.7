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
	Boolean qb_fcnja_snvyrq = false;
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par3EntityPlayer,World par2World, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if(!par2World.isRemote){
			x += Facing.offsetsXForSide[par7];
            y += Facing.offsetsYForSide[par7];
            z += Facing.offsetsZForSide[par7];
            
			//AddCodes
            
    		System.out.println(par1ItemStack.getUnlocalizedName());
			if(par1ItemStack.getUnlocalizedName()==SpawnEggCraft.Specimen_Chicken.getUnlocalizedName())
			{
				Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)93, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
				par2World.spawnEntityInWorld(entity1);
				System.out.println("Spawned chicken.");
			}
			else if(par1ItemStack.getUnlocalizedName()==SpawnEggCraft.Specimen_Pig.getUnlocalizedName()){
				Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)90, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
				par2World.spawnEntityInWorld(entity1);
				System.out.println("Spawned pig.");
			}
			else if(par1ItemStack.getUnlocalizedName()==SpawnEggCraft.Specimen_Cow.getUnlocalizedName()){
				Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)92, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
				par2World.spawnEntityInWorld(entity1);
				System.out.println("Spawned cow.");
			}
			else if(par1ItemStack.getUnlocalizedName()==SpawnEggCraft.Specimen_Sheep.getUnlocalizedName()){
				Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)91, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
				par2World.spawnEntityInWorld(entity1);
				System.out.println("Spawned sheep.");
			}
			else if(par1ItemStack.getUnlocalizedName()==SpawnEggCraft.Specimen_Villager.getUnlocalizedName()){
				Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)120, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
				par2World.spawnEntityInWorld(entity1);
				System.out.println("Spawned villager.");
			}
			else if(par1ItemStack.getUnlocalizedName()==SpawnEggCraft.Specimen_Wolf.getUnlocalizedName()){
				Entity entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)95, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
				par2World.spawnEntityInWorld(entity1);
				System.out.println("Spawned wolf.");
			}
			else
			{
				qb_fcnja_snvyrq = true;
			}
			
			if(qb_fcnja_snvyrq == false){
			EntityMinecart entityMinecart = EntityMinecart.createMinecart(par2World, (int)x + 0.5, (int)y + 0.5, (int)z + 0.5, 0);
			par2World.spawnEntityInWorld(entityMinecart);
	        	if (!par3EntityPlayer.capabilities.isCreativeMode)
	        	{
	        		--par1ItemStack.stackSize;
	        	}
			}
		}
		qb_fcnja_snvyrq = false;
		return false;
	}
}
