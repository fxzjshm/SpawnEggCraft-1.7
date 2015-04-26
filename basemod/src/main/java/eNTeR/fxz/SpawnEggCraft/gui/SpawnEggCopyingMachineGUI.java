package eNTeR.fxz.SpawnEggCraft.gui;

import org.lwjgl.opengl.GL11;

import eNTeR.fxz.SpawnEggCraft.container.SpawnEggCraftContainerCopyingMachine;
import eNTeR.fxz.SpawnEggCraft.tileentity.SpawnEggCraftTileEntityCopyingMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class SpawnEggCopyingMachineGUI extends GuiContainer{

	public SpawnEggCopyingMachineGUI(SpawnEggCraftTileEntityCopyingMachine tile, InventoryPlayer inv) {
        //为该Container GUI制定正确的Container，也就是BlockExample的Container。
        super(new SpawnEggCraftContainerCopyingMachine(tile, inv));
    }

	 @Override
     protected void drawGuiContainerForegroundLayer(int par1, int par2) {
                 // TODO Auto-generated method stub
                 super.drawGuiContainerForegroundLayer(par1, par2);
      this.fontRendererObj.drawString(StatCollector.translateToLocal("Spawn Egg Copying Machine"), 65, 6, 4210752);
      this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
     }

     @Override
     protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
            // TODO Auto-generated method stub
            ITextureObject var4 = this.mc.renderEngine.getTexture(new ResourceLocation("fxz","/gui/RepairTable.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.renderEngine.bindTexture((ResourceLocation)var4);
      int var5 = (this.width - this.xSize) / 2;
      int var6 = (this.height - this.ySize) / 2;
      this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
     }


}
