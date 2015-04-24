package eNTeR.fxz.SpawnEggCraft.eventhandler;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class SpawnEggCraftEventHandler {
	
	public static Random ran1=new Random();
	
	public static void LivingDeathEvent(LivingDeathEvent event){
		String EntityName = event.entity.getClass().getName();
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
    			
            {
    			if((Math.abs(ran1.nextLong())%(Math.abs(ran1.nextLong()%400)+100)==127)){
				EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.nether_star));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
    			}
            }else if(event.entity.isBurning()==true&&
            		(EntityName=="net.minecraft.entity.moster.EntityWitch"||EntityName=="yp")
            		)
            {
            	if((Math.abs(ran1.nextLong())%50)==25){
            	EntityItem entityitem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.experience_bottle,(int)(ran1.nextInt()%9)));
				entityitem.delayBeforeCanPickup = 10;
				event.entity.worldObj.spawnEntityInWorld(entityitem);
            	}
            }
			System.out.println("------------------------Did it kill an entity?------------------------");
			System.out.println(event.source.getSourceOfDamage().getClass().getName());
		}
	}
	public static void LivingFallEvent_BlockSlime(LivingFallEvent event){
		
	}
	
}
