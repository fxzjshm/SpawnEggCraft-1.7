package eNTeR.fxz.spawneggcraft.item;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class SpawnEggWither extends Item{
    
	/*public static Thread spawn = new Thread(new Runnable(){
		@Override
		public void run(){
			if(!p_77648_2_.isClientWorld()){
				p_77648_2_.addChatMessage(new ChatComponentText("Warning! The Wither is coming!!!!!"));
			
				for(int i = 0; i < 5; i++){
					try {
						//Thread.currentThread();
						Thread.sleep(1000);
					} catch (Exception e) {
						p_77648_2_.addChatMessage(new ChatComponentText("There is a bug here! Report it to fxzjshm!"));
						e.printStackTrace();
					}
					p_77648_2_.addChatMessage(new ChatComponentText(String.valueOf(i)));
				}
			
				EntityWither entityWither = new EntityWither(p_77648_3_);
				entityWither.setPosition(p_77648_8_, p_77648_9_, p_77648_10_);
				entityWither.motionX = 0.0D;
				entityWither.motionY = 0.0D;
				entityWither.motionZ = 0.0D;
				entityWither.prevPosX = p_77648_8_;
				entityWither.prevPosY = p_77648_9_;
				entityWither.prevPosZ = p_77648_10_;
				p_77648_3_.spawnEntityInWorld(entityWither);
			}
		}
	});*/
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, final EntityPlayer p_77648_2_, final World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, final float p_77648_8_, final float p_77648_9_, final float p_77648_10_)
    {
		try{
			new Thread(new Runnable(){
				@Override
				public void run(){
					if(!p_77648_2_.isClientWorld()){
						p_77648_2_.addChatMessage(new ChatComponentText("Warning! The Wither is coming!!!!!"));
					
						for(int i = 0; i < 5; i++){
							try {
								//Thread.currentThread();
								Thread.sleep(1000);
							} catch (Exception e) {
								p_77648_2_.addChatMessage(new ChatComponentText("There is a bug here! Report it to fxzjshm!"));
								e.printStackTrace();
							}
							p_77648_2_.addChatMessage(new ChatComponentText(String.valueOf(i)));
						}
					
						EntityWither entityWither = new EntityWither(p_77648_3_);
						entityWither.setPosition(p_77648_8_, p_77648_9_, p_77648_10_);
						entityWither.motionX = 0.0D;
						entityWither.motionY = 0.0D;
						entityWither.motionZ = 0.0D;
						entityWither.prevPosX = p_77648_8_;
						entityWither.prevPosY = p_77648_9_;
						entityWither.prevPosZ = p_77648_10_;
						p_77648_3_.spawnEntityInWorld(entityWither);
					}
				}
			}).start();
		}catch(Exception e){
			p_77648_2_.addChatMessage(new ChatComponentText("There is a bug here! Report it to fxzjshm!"));
			e.printStackTrace();
			return false;
		}
		return true;
    }
}
