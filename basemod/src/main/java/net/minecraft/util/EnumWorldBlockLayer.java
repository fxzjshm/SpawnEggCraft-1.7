package net.minecraft.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public enum EnumWorldBlockLayer
{
    SOLID("Solid"),
    CUTOUT_MIPPED("Mipped Cutout"),
    CUTOUT("Cutout"),
    TRANSLUCENT("Translucent");
    private final String layerName;

    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00002152";

    private EnumWorldBlockLayer(String layerNameIn)
    {
        this.layerName = layerNameIn;
    }

    public String toString()
    {
        return this.layerName;
    }
}