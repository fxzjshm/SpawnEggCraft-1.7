package eNTeR.fxz.spawneggcraft.gui;

import org.lwjgl.opengl.GL11;

import eNTeR.fxz.spawneggcraft.block.SpawnEggCraftTileEntityCopyingMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class SpawnEggCopyingMachineGUI extends GuiContainer{
	
	private SpawnEggCraftTileEntityCopyingMachine tile = new SpawnEggCraftTileEntityCopyingMachine();
	public ResourceLocation back = new ResourceLocation("fxz","textures/gui/back.png");
	public SpawnEggCopyingMachineGUI(SpawnEggCraftTileEntityCopyingMachine tile, InventoryPlayer inv) {
        //为该Container GUI制定正确的Container，也就是BlockExample的Container。
        super(new SpawnEggCraftContainerCopyingMachine(tile, inv));
        this.tile = tile;
    }

	 @Override
     protected void drawGuiContainerForegroundLayer(int par1, int par2) {
                 // TODO Auto-generated method stub
                 super.drawGuiContainerForegroundLayer(par1, par2);
                 drawCenteredString(fontRendererObj, StatCollector.translateToLocal("tile.SpawnEggCopyingMachine.name"), this.xSize / 2, 6, 4210752);
                 this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
                 /*drawCenteredString(fontRendererObj, String.valueOf(tile.hadCopyedTime), 15, 0, 4210752);
                 drawCenteredString(fontRendererObj, String.valueOf(tile.maxCopyTime), 15, 25, 4210752);
                 drawCenteredString(fontRendererObj, String.valueOf(tile.tableBurnTime), 15, 50, 4210752);
                 drawCenteredString(fontRendererObj, String.valueOf(tile.maxBurnTime), 15, 75, 4210752);*/
	 }

     @Override
     protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
            // TODO Auto-generated method stub
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.renderEngine.bindTexture((ResourceLocation)back);
      int var5 = (this.width - this.xSize) / 2;
      int var6 = (this.height - this.ySize) / 2;
      this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
      int b = tile.tableBurnTime; // 取得Tile内的燃料燃烧时间
      float maxBurnTime = tile.maxBurnTime*1.0F;// 取得最大燃料燃烧时间，用float，不用的话得不出百分比
      if (b > 0 && maxBurnTime > 0) // 确定描绘的时机
      {
              // 描绘火焰图像
          this.drawTexturedModalRect(this.guiLeft + 81, this.guiTop + 37 + (int)(14 - 14 * ((float)b / maxBurnTime)), 176, (int)(14 - 14 * ((float)b / maxBurnTime)), 14, (int)(14 * ((float)b / maxBurnTime)));
     }
      float hadCopyedTime = tile.hadCopyedTime*1.0F;
      float maxCopyTime = tile.maxCopyTime*1.0F;
    		  if(hadCopyedTime > 0 && maxCopyTime > 0){
    			  this.drawTexturedModalRect(this.guiLeft + 77, this.guiTop + 20, 176, 14, (int)(24*(hadCopyedTime / maxCopyTime)), 17);
    		  }
              /*drawCenteredString(fontRendererObj, String.valueOf(tile.hadCopyedTime), 15, 0, 4210752);
              drawCenteredString(fontRendererObj, String.valueOf(tile.maxCopyTime), 15, 25, 4210752);
              drawCenteredString(fontRendererObj, String.valueOf(tile.tableBurnTime), 15, 50, 4210752);
              drawCenteredString(fontRendererObj, String.valueOf(tile.maxBurnTime), 15, 75, 4210752);*/
     }

     @Override
     public void updateScreen()
     {
         super.updateScreen();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.renderEngine.bindTexture((ResourceLocation)back);
         int var5 = (this.width - this.xSize) / 2;
         int var6 = (this.height - this.ySize) / 2;
         this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
         int b = tile.tableBurnTime; // 取得Tile内的燃料燃烧时间
         float maxBurnTime = tile.maxBurnTime*1.0F;// 取得最大燃料燃烧时间，用float，不用的话得不出百分比
         if (b > 0 && maxBurnTime > 0) // 确定描绘的时机
         {
                 // 描绘火焰图像
             this.drawTexturedModalRect(this.guiLeft + 81, this.guiTop + 37 + (int)(14 - 14 * ((float)b / maxBurnTime)), 176, (int)(14 - 14 * ((float)b / maxBurnTime)), 14, (int)(14 * ((float)b / maxBurnTime)));
        }
         float hadCopyedTime = tile.hadCopyedTime*1.0F;
         float maxCopyTime = tile.maxCopyTime*1.0F;
         if(maxCopyTime == 0)maxCopyTime = SpawnEggCraftTileEntityCopyingMachine.getItemFeedTime(tile.lastItemStack);
       		  if(hadCopyedTime > 0 && maxCopyTime > 0){
       			  this.drawTexturedModalRect(this.guiLeft + 77, this.guiTop + 20, 176, 14, (int)(24*(hadCopyedTime / maxCopyTime)), 17);
       		  }
              /*drawCenteredString(fontRendererObj, String.valueOf(tile.hadCopyedTime), 15, 0, 4210752);
              drawCenteredString(fontRendererObj, String.valueOf(tile.maxCopyTime), 15, 25, 4210752);
              drawCenteredString(fontRendererObj, String.valueOf(tile.tableBurnTime), 15, 50, 4210752);
              drawCenteredString(fontRendererObj, String.valueOf(tile.maxBurnTime), 15, 75, 4210752);*/
     }
}
