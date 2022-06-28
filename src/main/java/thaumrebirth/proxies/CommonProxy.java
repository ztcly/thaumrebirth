package thaumrebirth.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumrebirth.api.TRBOreDictionary;
import thaumrebirth.common.crafting.TRBInfusionCrafting;
import thaumrebirth.common.research.TRBResearch;

/**
 * @Author ztcly
 * @Date 2022-06-28 09:32
 * @Description
 **/
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new TRBOreDictionary(event);
    }

    public void init(FMLInitializationEvent event){
        TRBResearch.initResearch();
        TRBInfusionCrafting.initInfusionCrafting();
    }

    public void postInit(FMLPostInitializationEvent event){

    }
}
