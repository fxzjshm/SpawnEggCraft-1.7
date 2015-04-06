package eNTeR.fxz.SpawnEggCraft;

import net.minecraft.client.gui.GuiScreen;

public class SpawnEggCraftGUIOfSpawnEggCopyingMachine extends GuiScreen{
    private GuiScreen parentScreen;
    
    public SpawnEggCraftGUIOfSpawnEggCopyingMachine(GuiScreen parent)
    {
         parentScreen = parent; //记下是哪个界面打开了它,以便以后返回那个界面
        //在这里初始化与界面无关的数据,或者是只需初始化一次的数据.
    }
 
    public void initGui()
    {
        //每当界面被打开时调用
        //这里部署控件
    }
 
    public void drawScreen(int par1, int par2, float par3)
    {
        drawDefaultBackground();
        //在这里绘制文本或纹理等非控件内容,这里绘制的东西会被控件(即按键)盖住.
        super.drawScreen(par1,par2,par3);
        //在这里绘制文本或纹理等非控件内容,这里绘制的东西会盖在控件(即按键)之上.
    }
}
