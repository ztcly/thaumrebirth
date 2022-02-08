package thaumrebirth;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import thaumrebirth.research.TRBResearch;

@Mod(modid = ThaumRebirthMOD.MODID, name = ThaumRebirthMOD.NAME, version = ThaumRebirthMOD.VERSION,dependencies = ThaumRebirthMOD.DEPENDENCIES)
public class ThaumRebirthMOD
{
    public static final String MODID = "thaumrebirth";
    public static final String NAME = "ThaumRebirth";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "required-after:baubles;required-after:thaumcraft";


    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        TRBResearch.initResearch();

    }
}
