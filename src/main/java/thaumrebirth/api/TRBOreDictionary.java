package thaumrebirth.api;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

/**
 * @Author ztcly
 * @Date 2022-06-26 10:44
 * @Description
 **/
public class TRBOreDictionary {
    public TRBOreDictionary (FMLPreInitializationEvent event) {
        OreDictionary.registerOre("ingotOrderMetal",TRBItems.ingotOrderMetal);


    }

}
