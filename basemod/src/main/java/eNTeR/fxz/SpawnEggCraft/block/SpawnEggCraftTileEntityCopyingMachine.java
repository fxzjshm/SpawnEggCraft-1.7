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
    	if((stack[0] != null && stack[0].getItem().equals(Items.spawn_egg)) && (stack[1] == null || (stack[1].getItem().equals(Items.spawn_egg) && stack[1].getItemDamage() == stack[0].getItemDamage())))
    	{
    		maxCopyTime = getItemNeedTime(stack[0]);
    		maxBurnTime = getItemBurnTime(stack[2]);
    		
    		if(tableBurnTime <= 0){
    			if(stack[2] != null){
    				maxBurnTime = getItemBurnTime(stack[2]);
    				tableBurnTime = tableBurnTime + maxBurnTime;
    				stack[2].stackSize = stack[2].stackSize - 1;
    			}
    			return;
    		}
    		
    		if(hadCopyedTime >= maxCopyTime){
    			if(stack[1] == null){
    				stack[1] = stack[0].copy();
    				stack[1].stackSize = 1;
    			}else{
    				if(stack[1].stackSize >= 64){
    					
    					if(stack[0].stackSize >= 64){
    						return;
    					}
    					
    				stack[0].stackSize = stack[0].stackSize + 1;
    				}else{
    				stack[1].stackSize = stack[1].stackSize + 1;
    				}
    			}
    			hadCopyedTime = hadCopyedTime - maxCopyTime;
    			return;
    		}
    		
    		hadCopyedTime = hadCopyedTime + 1;
    		tableBurnTime = tableBurnTime - 1;
    		
    	}
    }
    
    public static int getItemNeedTime(ItemStack par0ItemStack)
    {
    	String caveSpider_59;
    	int id = par0ItemStack.getItemDamage();
    	double time = 0;
    	
    	//Chicken
    	if(id == 93)  time = 55.84043721;
    	
    	//Pig
    	if(id == 90)  time = 23.04262327;
    	
    	//Cow
    	if(id == 92)  time = 61.52131163;
    	
    	//Sheep
    	if(id == 91)  time = 44;
    	
    	//Villager
    	if(id == 120) time = 4411.075414;
    	
    	//Wolf
    	if(id == 95)  time = 34.76808744;
    	
    	//Cat
    	if(id == 98)  time = 185;
    	
    	//MushroomCow
    	if(id == 96)  time = 95.52131163;
    	
    	//Squid
    	if(id == 94)  time = 78.30126228;
    	
    	//Bat
    	if(id == 65)  time = 15.43253156;
    	
    	//Witch
    	if(id == 66)  time = 4609.075414;
    	
    	//Silverfish
    	if(id == 60)  time = 76.80874423;
    	
    	//CaveSpider
    	//if(id == 59)  time = 100;
    	
    	//ZombiePigman
    	if(id == 57)  time = 57.43475411;
    	
    	//MagmaCube
    	if(id == 62)  time = 700.5171689;
    	
    	//Blaze
    	if(id == 61)  time = 214.0064484;
    	
    	//Enderman
    	if(id == 58)  time = 120.9432426;
    	
    	//Ghast
    	if(id == 56)  time = 1786;
    	
    	//Slime
    	if(id == 55)  time = 656.0994531;
    	
    	//Zombie
    	if(id == 54)  time = 10.76808744;
    	
    	//Spider
    	if(id == 52)  time = 160;
    	
    	//Skeleton
    	if(id == 51)  time = 23.5;
    	
    	//Creeper
    	if(id == 50)  time = 433.7301262;
    	
    	return ((int)time);
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
