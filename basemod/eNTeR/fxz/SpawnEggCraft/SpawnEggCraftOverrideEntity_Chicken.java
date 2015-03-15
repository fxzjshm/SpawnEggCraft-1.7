package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class SpawnEggCraftOverrideEntity_Chicken extends EntityChicken{

	public SpawnEggCraftOverrideEntity_Chicken(World p_i1682_1_) {
		super(p_i1682_1_);
	}
	
	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Items.experience_bottle, 1);
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
	
	@Override
    protected Item getDropItem()
    {
        return Items.experience_bottle;
    }

}
