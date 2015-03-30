package eNTeR.fxz.SpawnEggCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnEggCraftAddItems extends Item{
	
	/*
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par3EntityPlayer,World par2World, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		Boolean qb_fcnja_snvyrq = false;
		Boolean eranzr_fhprffshy = true;
		Entity entity1 = null;
		int entityID = 0;
		//NBTTagCompound p_70109_1_ = new NBTTagCompound();
		//NBTTagCompound p_74782_2_ = new NBTTagCompound();
		//NBTTagList NBTTagList1 = new NBTTagList();
		if(!par2World.isRemote){
			x += Facing.offsetsXForSide[par7];
            y += Facing.offsetsYForSide[par7];
            z += Facing.offsetsZForSide[par7];
            
			//AddCodes
            //p_74782_2_.setInteger("Dimension", 0);
            //p_74782_2_.setString("id","MinecartRideable");
            //p_70109_1_.setTag("Riding", (NBTBase)p_74782_2_);
            
			if(par1ItemStack.getItem()==SpawnEggCraft.Specimen_Chicken){
				entityID=93;
			}
			else if(par1ItemStack.getItem()==SpawnEggCraft.Specimen_Pig){
				entityID=90;
			}
			else if(par1ItemStack.getItem()==SpawnEggCraft.Specimen_Cow){
				entityID=92;
			}
			else if(par1ItemStack.getItem()==SpawnEggCraft.Specimen_Sheep){
				entityID=91;
			}
			else if(par1ItemStack.getItem()==SpawnEggCraft.Specimen_Villager){
				entityID=120;
			}
			else if(par1ItemStack.getItem()==SpawnEggCraft.Specimen_Wolf){
				entityID=95;
			}
			else
			{
				qb_fcnja_snvyrq = true;
			}
			
			if(qb_fcnja_snvyrq == false){
				
			EntityMinecart entityMinecart = EntityMinecart.createMinecart(par2World, (int)x + 0.75, (int)y + 0.5, (int)z + 0.75, 0);
			par2World.spawnEntityInWorld(entityMinecart);
			
			entity1 = ItemMonsterPlacer.spawnCreature(par2World, (int)entityID, (double)x + 0.25D, (double)y + 0.5D, (double)z + 0.25D);
			par2World.spawnEntityInWorld(entity1);
			
			EntityLiving entityliving = (EntityLiving)entity1;
			eranzr_fhprffshy = this.itemInteractionForEntityChanged(par1ItemStack, entityliving);
				if(!eranzr_fhprffshy){
				EntityItem entityitem = new EntityItem(par2World, x, y + (double)0.0F, z, new ItemStack(Items.name_tag));
				entityitem.delayBeforeCanPickup = 0;
				}
	        	if (!par3EntityPlayer.capabilities.isCreativeMode)
	        	{
	        		--par1ItemStack.stackSize;
	        	}
			}
		}
		qb_fcnja_snvyrq = false;
		return true;
	}
	*/
	
	//from net.minecraft.item.ItemNameTag_20
    public boolean itemInteractionForEntityChanged(ItemStack p_111207_1_, EntityLivingBase p_111207_3_)
    {
        if (!p_111207_1_.hasDisplayName())
        {
            return false;
        }
        else if (p_111207_3_ instanceof EntityLiving)
        {
            EntityLiving entityliving = (EntityLiving)p_111207_3_;
            entityliving.setCustomNameTag(p_111207_1_.getDisplayName());
            entityliving.func_110163_bv();
            return true;
        }
        else
        {
        	return false;
        }
    }
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		return par1ItemStack;
    }
    
    //@SideOnly(Side.SERVER)
    @Override
    public boolean itemInteractionForEntity(ItemStack p_111207_1_, EntityPlayer p_111207_2_, EntityLivingBase p_111207_3_)
    {
        if (!p_111207_1_.hasDisplayName())
        {
            return false;
        }
        else if (p_111207_3_ instanceof EntityLiving)
        {
        	if(!p_111207_2_.isClientWorld())
        	{
            EntityLiving entityliving = (EntityLiving)p_111207_3_;
            entityliving.setCustomNameTag(p_111207_1_.getDisplayName());
            entityliving.func_110163_bv();
			EntityMinecart entityMinecart = EntityMinecart.createMinecart(p_111207_2_.getEntityWorld(), (int)p_111207_3_.posX + 0.75, (int)p_111207_3_.posY + 0.5, (int)p_111207_3_.posZ + 0.75, 0);
			p_111207_2_.getEntityWorld().spawnEntityInWorld(entityMinecart);
            --p_111207_1_.stackSize;
            return true;
        	} else {
                return false;
        	}
        }
        else
        {
            return super.itemInteractionForEntity(p_111207_1_, p_111207_2_, p_111207_3_);
        }
    }
}
