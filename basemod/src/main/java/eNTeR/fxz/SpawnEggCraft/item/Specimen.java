package eNTeR.fxz.spawneggcraft.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecartEmpty;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class Specimen extends Item{
    
    @Override
    public boolean itemInteractionForEntity(ItemStack p_111207_1_, EntityPlayer p_111207_2_, EntityLivingBase p_111207_3_)
    {
    	EntityLiving entityliving = (EntityLiving)p_111207_3_;
        if (!p_111207_1_.hasDisplayName())
        {
			p_111207_2_.addChatMessage(new ChatComponentText("Rename this Specimen,please!"));
            return false;
        }
        else if (p_111207_3_ instanceof EntityLiving)
        {
        	if(!p_111207_3_.isClientWorld())
        	{
            return false;
        	} else {
        		if((entityliving.getCustomNameTag()!=p_111207_1_.getDisplayName())||(entityliving.getCustomNameTag()=="")){
        			entityliving.setCustomNameTag(p_111207_1_.getDisplayName());
        			entityliving.func_110163_bv();
        			if(p_111207_3_.isRiding() == false){
        				//EntityMinecart entityMinecart = EntityMinecart.createMinecart(p_111207_2_.getEntityWorld(), (int)p_111207_3_.posX + 0.75, (int)p_111207_3_.posY + 0.5, (int)p_111207_3_.posZ + 0.75, 0);
        				//p_111207_2_.getEntityWorld().spawnEntityInWorld(entityMinecart);
        				//NBTTagCompound nbtTagCompound = new NBTTagCompound();
        				World world = p_111207_3_.worldObj;
        				double x = p_111207_3_.posX;
        				double y = p_111207_3_.posY;
        				double z = p_111207_3_.posZ;
        				EntityMinecartEmpty entityMinecartEmpty = new EntityMinecartEmpty(world, x, y, z);
        				//p_111207_3_.writeToNBT(nbtTagCompound);
        				
        				entityMinecartEmpty.isDead = false;
        				entityMinecartEmpty.riddenByEntity = (Entity)p_111207_3_;
        				p_111207_3_.ridingEntity = entityMinecartEmpty;
        				p_111207_3_.posX = x;
        				p_111207_3_.posY = y + 1;
        				p_111207_3_.posZ = z;
        				p_111207_3_.onUpdate();
        				p_111207_3_.updateRidden();
        				
        			}else{
        				p_111207_2_.addChatMessage(new ChatComponentText("Specimen:This entity is riding something.Cannot let it ride minecart.#@!@#"));
        				EntityItem entityitem = new EntityItem(p_111207_2_.worldObj, p_111207_2_.posX, p_111207_2_.posY, p_111207_2_.posZ, new ItemStack(Items.minecart));
        				entityitem.delayBeforeCanPickup = 10;
        				p_111207_2_.worldObj.spawnEntityInWorld(entityitem);	
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
