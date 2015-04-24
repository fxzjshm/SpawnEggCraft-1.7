package eNTeR.fxz.SpawnEggCraft.config;
import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;
public class SpawnEggCraftConfig {

    private static SpawnEggCraftConfig instance;
    private Configuration config;
    public static void InitliazeConfig(File ConfigFile)
    {
        if(SpawnEggCraftConfig.instance != null)
        {
            return;
        }
        SpawnEggCraftConfig.instance = new SpawnEggCraftConfig(ConfigFile);
    }
    private SpawnEggCraftConfig(File configFile)
    {
        if(!configFile.exists())
        {
            try
            {
                configFile.createNewFile();
            }
            catch(IOException e)
            {
                System.out.println(e);
                return;
            }
        }
        config = new Configuration(configFile);
        config.load();
    }
    public static void SaveConfig()
    {
    	SpawnEggCraftConfig.instance.config.save();
    }
    public static String GetGeneralProperties(String PropertyName, String DefaultValue) throws Exception
    {
        if(SpawnEggCraftConfig.instance == null)
        {
            throw new Exception("没有初始化配置文件！");
        }
        return SpawnEggCraftConfig.instance.config.get("general", PropertyName, DefaultValue).getString();
    }
}
