package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnEggCraftAddItems extends Item{
	
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
    
    @Override
    public boolean itemInteractionForEntity(ItemStack p_111207_1_, EntityPlayer p_111207_2_, EntityLivingBase p_111207_3_)
    {
    	EntityLiving entityliving = (EntityLiving)p_111207_3_;
        if (!p_111207_1_.hasDisplayName())
        {
            return false;
        }
        else if (p_111207_3_ instanceof EntityLiving)
        {
        	if(!p_111207_3_.isClientWorld())
        	{
            return false;
        	} else {
        		if(entityliving.getCustomNameTag()!=p_111207_1_.getDisplayName()){
        			entityliving.setCustomNameTag(p_111207_1_.getDisplayName());
        			entityliving.func_110163_bv();
        			if(p_111207_3_.isRiding()==false){
        			EntityMinecart entityMinecart = EntityMinecart.createMinecart(p_111207_2_.getEntityWorld(), (int)p_111207_3_.posX + 0.75, (int)p_111207_3_.posY + 0.5, (int)p_111207_3_.posZ + 0.75, 0);
        			p_111207_2_.getEntityWorld().spawnEntityInWorld(entityMinecart);
        			}
        			--p_111207_1_.stackSize;
        			return true;
        		} else {
        			return false;
        		}
        	}
        }
        else
        {
            return super.itemInteractionForEntity(p_111207_1_, p_111207_2_, p_111207_3_);
        }
    }
}
