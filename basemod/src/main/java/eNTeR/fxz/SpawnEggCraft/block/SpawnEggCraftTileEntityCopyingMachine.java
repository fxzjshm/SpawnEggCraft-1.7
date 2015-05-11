package eNTeR.fxz.spawneggcraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class SpawnEggCraftTileEntityCopyingMachine extends TileEntity implements IInventory{

	public int tableBurnTime = 0;
	public int maxBurnTime = 0;
	private ItemStack stack[] = new ItemStack[3];
	
    @Override
    public void updateEntity() {
            // TODO Auto-generated method stub
            // 判断燃烧时间
            if(tableBurnTime > 0)
            {
                    // 取得修复的物品
                    ItemStack repairItem = getStackInSlot(0);
                    // 取得修复好的物品
                    ItemStack outputItem = getStackInSlot(1);
                    // 确定开始修复的条件之一：修复物品槽不为空，已修复物品槽为空
                    if(repairItem != null && outputItem == null)
                    {
                            // 判断被修复的物品是否为工具或武器
                            if(repairItem.getItem() instanceof ItemTool || repairItem.getItem() instanceof ItemArmor)
                            {
                                    // 判断物品是否要修理
                                    if(repairItem.getItemDamage() > 0)
                                    {
                                            // 修复物品
                                            repairItem.setItemDamage(repairItem.getItemDamage() - 1);
                                    }
                            }
                    }
                    // 减少燃烧时间
                    tableBurnTime -= 1;
            }
            else // 没有燃料的情况下
            {
                    // 如果有被修复的物品
                    if(getStackInSlot(0) != null)
                    {
                            // 取得燃料槽的物品
                            ItemStack burnItem = getStackInSlot(2);
                            // 取得物品的燃烧值
                        int getBurnTime = getItemBurnTime(burnItem);
                        // 判断物品是否能燃烧
                        if(getBurnTime > 0)
                        {
                                maxBurnTime = getBurnTime;
                                tableBurnTime = getBurnTime;
                                // 如果燃烧物品为岩浆桶
                                if(burnItem.getItem().shiftedIndex == Items.lava_bucket.shiftedIndex)
                                {
                                        // 取得空桶
                                        setInventorySlotContents(2, new ItemStack(Items.bucket, 1));
                                }
                                else
                                {
                                        // 其他物品就减少
                                        if(burnItem.stackSize - 1 > 0)
                                        {
                                                burnItem.stackSize--;
                                                setInventorySlotContents(2, burnItem);
                                        }
                                        else
                                        {
                                                setInventorySlotContents(2, null);
                                        }
                                }
                        }
                    }
            }
    }
    
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            int var1 = par0ItemStack.getItem().shiftedIndex;
            Item var2 = par0ItemStack.getItem();

            if (par0ItemStack.getItem() instanceof ItemBlock && Block.blocksList[var1] != null)
            {
                Block var3 = Block.blocksList[var1];

                if (var3 == Block.woodSingleSlab)
                {
                    return 150;
                }

                if (var3.blockMaterial == Material.wood)
                {
                    return 300;
                }
            }
            if (var2 instanceof ItemTool && ((ItemTool) var2).getToolMaterialName().equals("WOOD")) return 200;
            if (var2 instanceof ItemSword && ((ItemSword) var2).func_77825_f().equals("WOOD")) return 200;
            if (var2 instanceof ItemHoe && ((ItemHoe) var2).func_77842_f().equals("WOOD")) return 200;
            if (var1 == Item.stick.shiftedIndex) return 100;
            if (var1 == Item.coal.shiftedIndex) return 1600;
            if (var1 == Item.bucketLava.shiftedIndex) return 20000;
            if (var1 == Block.sapling.blockID) return 100;
            if (var1 == Item.blazeRod.shiftedIndex) return 2400;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return stack.length;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_) {
		// TODO Auto-generated method stub
		return stack[p_70301_1_];
	}

	@Override
    public ItemStack decrStackSize(int par1, int par2) {
            // TODO Auto-generated method stub
            if (this.stack[par1] != null)
    {
        ItemStack var3;

        if (this.stack[par1].stackSize <= par2)
        {
            var3 = this.stack[par1];
            this.stack[par1] = null;
            return var3;
        }
        else
        {
            var3 = this.stack[par1].splitStack(par2);

            if (this.stack[par1].stackSize == 0)
            {
                this.stack[par1] = null;
            }

            return var3;
        }
    }
    else
    {
        return null;
    }
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
		// TODO Auto-generated method stub
		return stack[p_70304_1_];
	}

	@Override
	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
		// TODO Auto-generated method stub
		this.stack[p_70299_1_] = p_70299_2_;
	    if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit())
	    {
	    	p_70299_2_.stackSize = this.getInventoryStackLimit();
	    }
	}

	@Override
	public String getInventoryName() {
		return "The Tile Entity of Copying Machine";
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO ?
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return false;
	}
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items",0);
        this.stack = new ItemStack[this.getSizeInventory()];
        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
        	//TODO
            NBTTagCompound var4 = (NBTTagCompound)var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
            if (var5 >= 0 && var5 < this.stack.length)
            {
                this.stack[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }
        this.tableBurnTime = par1NBTTagCompound.getShort("tableBurnTime");
        this.maxBurnTime = par1NBTTagCompound.getShort("maxBurnTime");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short)this.tableBurnTime);
        par1NBTTagCompound.setShort("maxBurnTime", (short)this.maxBurnTime);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3)
        {
            if (this.stack[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("Items", var2);
    }
    
}
