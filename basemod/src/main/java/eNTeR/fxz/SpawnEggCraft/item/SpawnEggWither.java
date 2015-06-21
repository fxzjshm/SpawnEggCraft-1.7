package eNTeR.fxz.spawneggcraft.item;

import java.util.Iterator;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class SpawnEggWither extends Item{
	
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
		try{
			
			if(!p_77648_2_.isClientWorld()){
			p_77648_2_.addChatMessage(new ChatComponentText("Warning! The Wither is coming!!!!!"));
		
            EntityWither entitywither;
            @SuppressWarnings("rawtypes")
			Iterator iterator;
            EntityPlayer entityplayer;
            int i1;
			
                    if (!p_77648_3_.isRemote)
                    {
                        entitywither = new EntityWither(p_77648_3_);
                        entitywither.setLocationAndAngles((double)p_77648_4_, (double)p_77648_5_ + 1, (double)p_77648_6_, 90.0F, 0.0F);
                        entitywither.renderYawOffset = 90.0F;
                        entitywither.func_82206_m();

                        if (!p_77648_3_.isRemote)
                        {
                            iterator = p_77648_3_.getEntitiesWithinAABB(EntityPlayer.class, entitywither.boundingBox.expand(50.0D, 50.0D, 50.0D)).iterator();

                            while (iterator.hasNext())
                            {
                                entityplayer = (EntityPlayer)iterator.next();
                                entityplayer.triggerAchievement(AchievementList.field_150963_I);
                            }
                        }

                        p_77648_3_.spawnEntityInWorld(entitywither);
                        p_77648_2_.addChatMessage(new ChatComponentText("Location: p_77648_4_:" + String.valueOf(entitywither.posX) + ", p_77648_5_:" + String.valueOf(entitywither.posY) + ", p_77648_6_:" + String.valueOf(entitywither.posZ)));
                        p_77648_2_.addChatMessage(new ChatComponentText("Value: p_77648_4_:" + String.valueOf(p_77648_4_) + ", p_77648_5_:" + String.valueOf(p_77648_5_) + ", p_77648_6_:" + String.valueOf(p_77648_6_)));
                    }

                    for (i1 = 0; i1 < 120; ++i1)
                    {
                    	p_77648_3_.spawnParticle("snowballpoof", (double)p_77648_4_ + p_77648_3_.rand.nextDouble(), (double)(p_77648_5_ - 2) + p_77648_3_.rand.nextDouble() * 3.9D, (double)(p_77648_6_ + 1) + p_77648_3_.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
                    }
			}
			
		}catch(Exception e){
			p_77648_2_.addChatMessage(new ChatComponentText("Here is a bug! Report it to fxzjshm!"));
			e.printStackTrace();
			return false;
		}
		return true;
    }
}
