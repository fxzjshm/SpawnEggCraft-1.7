package eNTeR.fxz.SpawnEggCraft.item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class Specimen extends Item{
    
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
        			}else{
        				p_111207_2_.addChatMessage(new ChatComponentText("Specimen:It is riding something.Cannot let it ride minecart.#@!@#"));
        			}
        			--p_111207_1_.stackSize;
        			p_111207_2_.dropItem(Items.minecart, 1);
        			return true;
        		} else {
        			p_111207_2_.addChatMessage(new ChatComponentText("Rename the Specimen,please!"));
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
