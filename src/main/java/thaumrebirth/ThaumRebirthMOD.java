package thaumrebirth;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import thaumrebirth.proxies.CommonProxy;

@Mod(modid = ThaumRebirthMOD.MODID, name = ThaumRebirthMOD.NAME, version = ThaumRebirthMOD.VERSION,dependencies = ThaumRebirthMOD.DEPENDENCIES)
public class ThaumRebirthMOD
{
    public static final String MODID = "thaumrebirth";
    public static final String NAME = "ThaumRebirth";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "required-after:baubles;required-after:thaumcraft";


    public static Logger logger;

    @SidedProxy(clientSide = "thaumrebirth.proxies.ClientProxy",serverSide = "thaumrebirth.proxies.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
