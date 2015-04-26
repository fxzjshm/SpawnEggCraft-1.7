package eNTeR.fxz.SpawnEggCraft.gui;

import org.lwjgl.opengl.GL11;

import eNTeR.fxz.SpawnEggCraft.container.SpawnEggCraftContainerCopyingMachine;
import eNTeR.fxz.SpawnEggCraft.tileentity.SpawnEggCraftTileEntityCopyingMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class SpawnEggCopyingMachineGUI extends GuiContainer{
	
	private SpawnEggCraftTileEntityCopyingMachine tile =new SpawnEggCraftTileEntityCopyingMachine();
	ResourceLocation back = new ResourceLocation("fxz","textures/gui/back.png");
	public SpawnEggCopyingMachineGUI(SpawnEggCraftTileEntityCopyingMachine tile, InventoryPlayer inv) {
        //为该Container GUI制定正确的Container，也就是BlockExample的Container。
        super(new SpawnEggCraftContainerCopyingMachine(tile, inv));
    }

	 @Override
     protected void drawGuiContainerForegroundLayer(int par1, int par2) {
                 // TODO Auto-generated method stub
                 super.drawGuiContainerForegroundLayer(par1, par2);
      this.fontRendererObj.drawString(StatCollector.translateToLocal("Spawn Egg Copying Machine"), 45, 6, 4210752);
      this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
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
     }

}
