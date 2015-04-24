package eNTeR.fxz.SpawnEggCraft.gui;

import org.lwjgl.opengl.GL11;

import eNTeR.fxz.SpawnEggCraft.container.SpawnEggCraftContainerCopyingMachine;
import eNTeR.fxz.SpawnEggCraft.tileentity.SpawnEggCraftTileEntityCopyingMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class SpawnEggCraftGUIOfSpawnEggCopyingMachine extends GuiContainer{

	public SpawnEggCraftGUIOfSpawnEggCopyingMachine(SpawnEggCraftTileEntityCopyingMachine tile, InventoryPlayer inv) {
        //为该Container GUI制定正确的Container，也就是BlockExample的Container。
        super(new SpawnEggCraftContainerCopyingMachine(tile, inv));
    }

    /**
     * 这里是GUI背景的绘制，先空着。
     */  
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2,int var3) {
           // TODO Auto-generated method stub
           ResourceLocation var4 = (ResourceLocation)this.mc.renderEngine.getTexture(new ResourceLocation("fxz","/gui/back.png"));
     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
     this.mc.renderEngine.bindTexture(var4);
     int var5 = (this.width - this.xSize) / 2;
     int var6 = (this.height - this.ySize) / 2;
     this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }


}
