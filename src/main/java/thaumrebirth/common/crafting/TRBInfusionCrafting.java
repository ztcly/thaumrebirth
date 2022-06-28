package thaumrebirth.common.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumrebirth.ThaumRebirthMOD;
import thaumrebirth.api.TRBItems;

/**
 * @Author ztcly
 * @Date 2022-02-08 19:07
 * @Description
 **/
public class TRBInfusionCrafting {
    static Logger logger = ThaumRebirthMOD.logger;
    private static ResourceLocation getItemName(String itemname){
        return new ResourceLocation("thaumrebirth:"+itemname);
    }
    /**
    * @Param
    * @Author ztcly
    * @Date 2022/6/24
    * @Description 添加注魔合成配方
    */
    public static void initInfusionCrafting(){
        logger.info("Start InitInfusionCrafting");

        ///注魔//////////////////
        ThaumcraftApi.addInfusionCraftingRecipe(getItemName("warp_ward_amulet"),
                new InfusionRecipe("WARPWARDAMULET",new ItemStack(TRBItems.warpWardAmulet),4,
                        new AspectList().add(Aspect.METAL, 35).add(Aspect.PROTECT, 35).add(Aspect.ENERGY, 25).add(Aspect.ORDER,50),new ItemStack(ItemsTC.baubles, 1, 0),new Object[]{new ItemStack(ItemsTC.amber),new ItemStack(ItemsTC.brain),new ItemStack(TRBItems.ingotOrderMetal)}));
        logger.info("InfusionCraftingRecipe:"+getItemName("warp_ward_amulet"));

        logger.info("End InitInfusionCrafting");
    }
}
