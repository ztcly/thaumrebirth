package thaumrebirth.client;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumrebirth.common.items.TRBItemInitializer;

/**
 * @Author ztcly
 * @Date 2022-06-28 09:14
 * @Description
 **/
@Mod.EventBusSubscriber(modid = "thaumrebirth")
public class ItemRenderInitializer {
    /**
    * @Param [event],[net.minecraftforge.client.event.ModelRegistryEvent]
    * @Author ztcly
    * @Date 2022/6/28
    * @Description 注册物品的模型。需要在TRBItemInitializer.registryModels()中指定。
    */
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event){
        TRBItemInitializer.registryModels();
    }

}
