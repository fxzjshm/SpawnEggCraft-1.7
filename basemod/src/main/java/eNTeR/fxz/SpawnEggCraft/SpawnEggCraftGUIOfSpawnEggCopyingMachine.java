package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;

public class SpawnEggCraftGUIOfSpawnEggCopyingMachine extends GuiScreen{
	
	private GuiScreen parentScreen;
    private ResourceLocation texture = new ResourceLocation("fxz", "textures/gui/back.png");
    

    public SpawnEggCraftGUIOfSpawnEggCopyingMachine(GuiScreen parent)
    {
         parentScreen = parent; //记下是哪个界面打开了它,以便以后返回那个界面
        //在这里初始化与界面无关的数据,或者是只需初始化一次的数据.
    }
 
    @Override
    public void initGui()
    {
        //每当界面被打开时调用
        //这里部署控件
    }
 
    @Override
    public void drawScreen(int par1, int par2, float par3)
    {
        drawDefaultBackground();
        //在这里绘制文本或纹理等非控件内容,这里绘制的东西会被控件(即按键)盖住.
        mc.renderEngine.bindTexture(texture); //绑定纹理
        //drawTexturedModalRect((int)(width*0.5)-128, (int)(height*0.5)-128,0,0,256,256); //绘制一个256x256的纹理
        drawScaledCustomSizeModalRect((width-175)/2, (height-165)/2, 0, 0, 350, 350, width, height, 256, 256); //参数分别为x,y,u,v,u宽度,v高度(即纹理中欲绘制区域的宽高),实际宽,实际高,纹理总宽,纹理总高.
        super.drawScreen(par1,par2,par3);
        //在这里绘制文本或纹理等非控件内容,这里绘制的东西会盖在控件(即按键)之上.
        drawCenteredString(fontRendererObj, "Your PROUD first screen", width/2, (int)(height*0.2), 0xFFFF00);
        drawString(fontRendererObj, String.format("You are pointing to: (%d,%d)", par1, par2),(int)(width*0.05), (int)(height*0.9), 0xFFFFFF);
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    /*@Override
    protected void keyTyped(char p_73869_1_, int p_73869_2_)
    {
        if (p_73869_2_ == 1 && p_73869_2_ == 97)
        {
            this.mc.displayGuiScreen(parentScreen);
            this.mc.setIngameFocus();
        }
    }*/
  
    public static void drawScaledCustomSizeModalRect(int x, int y, float u, float v, int uWidth, int vHeight, int width, int height, float tileWidth, float tileHeight) {
        float f4 = 1.0F / tileWidth;
        float f5 = 1.0F / tileHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)x, (double)(y + height), 0.0D, (double)(u * f4), (double)((v + (float)vHeight) * f5));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + height), 0.0D, (double)((u + (float)uWidth) * f4), (double)((v + (float)vHeight) * f5));
        tessellator.addVertexWithUV((double)(x + width), (double)y, 0.0D, (double)((u + (float)uWidth) * f4), (double)(v * f5));
        tessellator.addVertexWithUV((double)x, (double)y, 0.0D, (double)(u * f4), (double)(v * f5));
        tessellator.draw();
    }
}
