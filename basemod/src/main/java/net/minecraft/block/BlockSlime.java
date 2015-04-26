package net.minecraft.block;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlime extends BlockBreakable
{
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00002063";

    public BlockSlime()
    {
        super("BlockSlime", Material.clay, false);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.slipperiness = 0.8F;
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }

    /**
     * Block's chance to react to a living entity falling on it.
     *  
     * @param fallDistance The distance the entity has fallen before landing
     */
    public void onFallenUpon(World worldIn, int p_149746_2_, int p_149746_3_, int p_149746_4_, Entity entityIn, float fallDistance)
    {
        if (entityIn.isSneaking())
        {
            super.onFallenUpon(worldIn, p_149746_2_, p_149746_3_, p_149746_4_, entityIn, fallDistance);
        }
        else
        {
        	//Mistakes
            //entityIn.fall(fallDistance);
        }
    }

    /**
     * Called when an Entity lands on this Block. This method *must* update motionY because the entity will not do that
     * on its own
     */
    public void onLanded(World worldIn, Entity entityIn)
    {
        if (entityIn.isSneaking())
        {
            onLanded(worldIn, entityIn);
        }
        else if (entityIn.motionY < 0.0D)
        {
            entityIn.motionY = -entityIn.motionY;
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block)
     */
    public void onEntityCollidedWithBlock(World worldIn, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity entityIn)
    {
        if (Math.abs(entityIn.motionY) < 0.1D && !entityIn.isSneaking())
        {
            double d0 = 0.4D + Math.abs(entityIn.motionY) * 0.2D;
            entityIn.motionX *= d0;
            entityIn.motionZ *= d0;
        }

        super.onEntityCollidedWithBlock(worldIn, p_149670_2_, p_149670_3_, p_149670_4_, entityIn);
    }    
}