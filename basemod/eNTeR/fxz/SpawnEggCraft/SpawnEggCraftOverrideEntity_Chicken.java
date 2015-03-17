package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnEggCraftOverrideEntity_Chicken extends EntityChicken{

	public SpawnEggCraftOverrideEntity_Chicken(World p_i1682_1_) {
		super(p_i1682_1_);
	}
	{System.out.println("It looks like that Override loaded.");}
	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Items.experience_bottle, 1);
            EntityItem entityitem = new EntityItem(this.worldObj, this.posX, this.posY + (double)0.0F, this.posZ, new ItemStack(Items.experience_bottle));
            entityitem.delayBeforeCanPickup = 10;
            this.worldObj.spawnEntityInWorld(entityitem);
            //entityDropItem(new ItemStack(Items.experience_bottle, 1, 0), 1);
        }

        if (this.isBurning())
        {
            this.dropItem(Items.cooked_chicken, 1);
        }
        else
        {
            this.dropItem(Items.chicken, 1);
        }
    }
}
