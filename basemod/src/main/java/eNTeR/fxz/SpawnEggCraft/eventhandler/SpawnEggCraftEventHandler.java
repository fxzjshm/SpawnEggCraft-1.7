package eNTeR.fxz.SpawnEggCraft.eventhandler;

import java.util.Random;

import eNTeR.fxz.SpawnEggCraft.SpawnEggCraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class SpawnEggCraftEventHandler {
	
	public static Random ran1=new Random();
	
	public static void LivingDeathEvent(LivingDeathEvent event){
		String EntityName = event.entity.getClass().getName();
		String KillerName = null;
		try{
		KillerName = event.source.getEntity().getClass().getName();
		}
		catch(Exception error){
			System.out.println(error.getMessage());
			System.out.println(error.getStackTrace());
		}
		if(!event.entity.worldObj.isRemote){
			if(
					EntityName=="net.minecraft.entity.moster.EntityCreeper"||EntityName=="xz"
					||
					EntityName=="net.minecraft.entity.passive.EntityZombie"||EntityName=="yq"
					||
					EntityName=="net.minecraft.entity.passive.EntitySkeleton"||EntityName=="yl"
					||
					EntityName=="net.minecraft.entity.passive.EntitySpider"||EntityName=="yo"
					||
					EntityName=="net.minecraft.entity.passive.EntityCaveSpider"||EntityName=="xy"
					||
					EntityName=="net.minecraft.entity.passive.EntityPigZombie"||EntityName=="yh"
					||
					EntityName=="net.minecraft.entity.passive.EntityBlaze"||EntityName=="xx"
					||
					EntityName=="net.minecraft.entity.passive.EntityGhast"||EntityName=="yd"
					||
					EntityName=="net.minecraft.entity.passive.EntitySlime"||EntityName=="ym"
					||
					EntityName=="net.minecraft.entity.passive.EntityMagmaCube"||EntityName=="yf"
					||
					EntityName=="net.minecraft.entity.passive.EntityEnderman"||EntityName=="ya"
					
				)
			{
    			if((Math.abs(ran1.nextLong())%100)==50){
    				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY + (double)0.0F, event.entity.posZ, new ItemStack(Items.experience_bottle));
    				entityitem.delayBeforeCanPickup = 10;
    				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            } 
			else
            if(
            		(
            		EntityName=="net.minecraft.entity.passive.EntityCow"||EntityName=="wh"
            		||
            		EntityName=="net.minecraft.entity.passive.EntitySheep"||EntityName=="wp"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityPig"||EntityName=="wo"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityChicken"||EntityName=="wg"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityMooshroom"||EntityName=="wm"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityBat"||EntityName=="we"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityOcelot"||EntityName=="wn"
            		||
            		EntityName=="net.minecraft.entity.passive.EntityWolf"||EntityName=="wv"
            		)
    			&&
    				(
    						KillerName=="net.minecraft.entity.moster.EntityCreeper"||KillerName=="xz"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityZombie"||KillerName=="yq"
    						||
    						KillerName=="net.minecraft.entity.passive.EntitySkeleton"||KillerName=="yl"
    						||
    						KillerName=="net.minecraft.entity.passive.EntitySpider"||KillerName=="yo"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityCaveSpider"||KillerName=="xy"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityPigZombie"||KillerName=="yh"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityBlaze"||KillerName=="xx"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityGhast"||KillerName=="yd"
    						||
    						KillerName=="net.minecraft.entity.passive.EntitySlime"||KillerName=="ym"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityMagmaCube"||KillerName=="yf"
    						||
    						KillerName=="net.minecraft.entity.passive.EntityEnderman"||KillerName=="ya"
    				)
    			)
    			
            {
    			if((Math.abs(ran1.nextLong())%100==64)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            }else if(event.entity.isBurning()==true&&
            		(EntityName=="net.minecraft.entity.moster.EntityWitch"||EntityName=="yp")
            		)
            {
            	if((Math.abs(ran1.nextLong())%50)==25){
            	EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.experience_bottle,(int)((ran1.nextInt()%9)+1)));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
            	}
            }
		}
	}
	public static void LivingFallEvent_BlockSlime(LivingFallEvent event){
		System.out.println(event.entityLiving.worldObj.getBlock(event.entityLiving.serverPosX, (event.entityLiving.serverPosY)-1, event.entityLiving.serverPosZ).getClass().getName());
		if(event.entityLiving.worldObj.getBlock(event.entityLiving.serverPosX, (event.entityLiving.serverPosY)-1, event.entityLiving.serverPosZ)==SpawnEggCraft.BlockSlime){}
	}
	
}
