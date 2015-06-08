package eNTeR.fxz.spawneggcraft.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
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
	public ItemStack lastItemStack;
	
    @Override
    public void updateEntity() {
    	if((stack[0] != null && stack[0].getItem().equals(Items.spawn_egg)) && (stack[1] == null || (stack[1].getItem().equals(Items.spawn_egg) && stack[1].getItemDamage() == stack[0].getItemDamage())))
    	{
    		maxCopyTime = getItemNeedTime(stack[0]);
    		if(stack[2] != null){
    			maxBurnTime = getItemFeedTime(stack[2]);
    			lastItemStack = stack[2].copy();
    		}
    		
    		if(tableBurnTime <= 0){
    			if(stack[2] != null){
    				maxBurnTime = getItemFeedTime(stack[2]);
    				if(maxBurnTime == 0)return;
    				tableBurnTime = tableBurnTime + maxBurnTime;
    				if(stack[2].stackSize > 1){
    				stack[2].stackSize = stack[2].stackSize - 1;
    				}else{
    					stack[2] = null;
    				}
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
    	if(id == 93)  time = 56.00541248;
    	
    	//Pig
    	if(id == 90)  time = 24.03247487;
    	
    	//Cow
    	if(id == 92)  time = 62.01623744;
    	
    	//Sheep
    	if(id == 91)  time = 44;
    	
    	//Villager
    	if(id == 120) time = 4424.438411;
    	
    	//Wolf
    	if(id == 95)  time = 34.8010825;
    	
    	//Cat
    	if(id == 98)  time = 185;
    	
    	//MushroomCow
    	if(id == 96)  time = 96.01623744;
    	
    	//Squid
    	if(id == 94)  time = 74.21348847;
    	
    	//Bat
    	if(id == 65)  time = 15.33033721;
    	
    	//Witch
    	if(id == 66)  time = 4622.438411;
    	
    	//Silverfish
    	if(id == 60)  time = 80.10824957;
    	
    	//CaveSpider
    	if(id == 59)  time = 200;
    	
    	//ZombiePigman
    	if(id == 57)  time = 57.46774916;
    	
    	//MagmaCube
    	if(id == 62)  time = 651.7725224;
    	
    	//Blaze
    	if(id == 61)  time = 214.9303099;
    	
    	//Enderman
    	if(id == 58)  time = 125.4837232;
    	
    	//Ghast
    	if(id == 56)  time = 1786;
    	
    	//Slime
    	if(id == 55)  time = 609.294443;
    	
    	//Zombie
    	if(id == 54)  time = 10.8010825;
    	
    	//Spider
    	if(id == 52)  time = 160;
    	
    	//Skeleton
    	if(id == 51)  time = 23.5;
    	
    	//Creeper
    	if(id == 50)  time = 433.3213488;
    	
    	return ((int)time);
    }
    
    public static int getItemFeedTime(ItemStack foodstack)
    {
    	double time = 0;
    	if(foodstack != null){
    	Item item = foodstack.getItem();
    	
    	//Potato
    	if(item.equals(Items.potato))time = 10.24437944;
    	
    	//Bread
    	if(item.equals(Items.bread))time = 51.16255801;
    	
    	//Melon
    	if(item.equals(Items.melon))time = 11.28794814;
    	
    	//Cake
    	if(item.equals(Items.cake))time = 453.8849789;
    	
    	//Moshroom Soup
    	if(item.equals(Items.mushroom_stew))time = 22.99851533;
    	
    	//Apple
    	if(item.equals(Items.apple))time = 33.25566271;
    	
    	//Rotten Flesh
    	if(item.equals(Items.rotten_flesh))time = 1.786218442;
    	
    	//Carrot
    	if(item.equals(Items.carrot))time = 14.44504016;
    	
    	//Raw Chicken
    	if(item.equals(Items.chicken))time = 7.892076674;
    	
    	//Raw Fish
    	if(item.equals(Items.fish))time = 15.89693767;
    	
    	//Raw Porkchop
    	if(item.equals(Items.porkchop))time = 19.02301556;
    	
    	//Raw Beef
    	if(item.equals(Items.beef))time = 26.34184229;
    	
    	//Cooked Beef
    	if(item.equals(Items.cooked_beef))time = 48.27854273;
    	
    	//Cooked Chicken
    	if(item.equals(Items.cooked_chicken))time = 34.01622599;
    	
    	//Cooked Fish
    	if(item.equals(Items.cooked_fished))time = 30.14936454;
    	
    	//Cooked Porkchop
    	if(item.equals(Items.cooked_porkchop))time = 40.95971601;
    	
    	//Cookie
    	if(item.equals(Items.cookie))time = 20.48974787;
    	
    	//Pumpkin Pie
    	if(item.equals(Items.pumpkin_pie))time = 55.60725932;
    	
    	//Bone meal
    	if(item.equals(Items.dye) && foodstack.getItemDamage() == 15)time = 5.82430906;
    	
    	//Bone
    	if(item.equals(Items.bone))time = 23.29723624;
    	
    	//Golden Apple
    	if(item.equals(Items.golden_apple)&& foodstack.getItemDamage() == 0)time = 2415.481816;
    	
    	//Golden Apple *
    	if(item.equals(Items.golden_apple)&& foodstack.getItemDamage() == 1)time = 15727.27897;
    	}

    	
		return ((int)time);
    	
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
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items", 10);
        this.stack = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.stack.length)
            {
                this.stack[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
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
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.stack.length; ++i)
        {
            if (this.stack[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.stack[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);
    }
    
}
