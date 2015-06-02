package eNTeR.fxz.spawneggcraft.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class SpawnEggCraftTileEntityCopyingMachine extends TileEntity implements IInventory{

	public int tableBurnTime = 0;
	public int maxBurnTime = 0;
	private ItemStack stack[] = new ItemStack[3];
	public int hadCopyedTime = 0;
	public int maxCopyTime = 0;
	
    @Override
    public void updateEntity() {
    	ItemStack inputStack = getStackInSlot(0);
    	ItemStack outputStack = getStackInSlot(1);
    	ItemStack foodStack = getStackInSlot(2);
    	if((inputStack != null && inputStack.getItem().equals(Items.spawn_egg)) && (outputStack == null || (outputStack.getItem().equals(Items.spawn_egg) && outputStack.getItemDamage() == inputStack.getItemDamage())))
    	{
    		maxCopyTime = getItemNeedTime(foodStack);
    		maxBurnTime = getItemBurnTime(foodStack);
    		
    		if(tableBurnTime <= 0){
    			if(foodStack != null){
    				maxBurnTime = getItemBurnTime(stack[2]);
    				tableBurnTime = tableBurnTime + maxBurnTime;
    				stack[2].stackSize = stack[2].stackSize - 1;
    			}
    			return;
    		}
    		
    		if(hadCopyedTime >= maxCopyTime){
    			if(outputStack == null || outputStack.stackSize >= 64){
    				stack[1] = inputStack;
    				stack[1].stackSize = 1;
    			}else{
    				stack[1].stackSize = stack[1].stackSize + 1;
    			}
    			hadCopyedTime = hadCopyedTime - maxCopyTime;
    		}
    		
    		hadCopyedTime = hadCopyedTime + 1;
    		tableBurnTime = tableBurnTime - 1;
    		
    	}
    }
    
    public static int getItemNeedTime(ItemStack par0ItemStack)
    {
    	//TODO Add infomation
		return 100;
    	
    }
    
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
    	//TODO Add infomation
		return 100;
    	
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
        this.tableBurnTime = par1NBTTagCompound.getInteger("tableBurnTime");
        this.maxBurnTime = par1NBTTagCompound.getInteger("maxBurnTime");
        this.hadCopyedTime = par1NBTTagCompound.getInteger("hadCopyedTime");
        this.maxCopyTime = par1NBTTagCompound.getInteger("maxCopyTime");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("tableBurnTime", this.tableBurnTime);
        par1NBTTagCompound.setInteger("maxBurnTime", this.maxBurnTime);
        par1NBTTagCompound.setInteger("hadCopyedTime", this.hadCopyedTime);
        par1NBTTagCompound.setInteger("maxCopyTime", this.maxCopyTime);
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
