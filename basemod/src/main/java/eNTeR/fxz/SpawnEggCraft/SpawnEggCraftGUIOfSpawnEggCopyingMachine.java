package eNTeR.fxz.SpawnEggCraft;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

public class SpawnEggCraftGUIOfSpawnEggCopyingMachine extends GuiContainer{

	public SpawnEggCraftGUIOfSpawnEggCopyingMachine(SpawnEggCraftTileEntityCopyingMachine tile, InventoryPlayer inv) {
        //为该Container GUI制定正确的Container，也就是BlockExample的Container。
        super(new SpawnEggCraftContainerCopyingMachine(tile, inv));
    }

    /**
     * 这里是GUI背景的绘制，先空着。
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        GL11.glPushMatrix();
        GL11.glPopMatrix();
    }

}
