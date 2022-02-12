package thaumrebirth.items;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumrebirth.api.TRBItems;

/**
 * @Author ztcly
 * @Date 2022-02-08 19:07
 * @Description
 **/
public class InfusionCrafting {
    private static ResourceLocation getItemName(String itemname){
        return new ResourceLocation("thaumrebirth:"+itemname);
    }
    public static void initInfusionCrafting(){
        ThaumcraftApi.addInfusionCraftingRecipe(getItemName("warp_ward_amulet"),
                new InfusionRecipe("WARPWARDAMULET",new ItemStack(TRBItems.warp_ward_amulet),4,
                        new AspectList().add(Aspect.METAL, 35).add(Aspect.PROTECT, 35).add(Aspect.ENERGY, 25).add(Aspect.ORDER,50),new ItemStack(ItemsTC.baubles, 1, 0),new Object[]{new ItemStack(ItemsTC.amber),new ItemStack(ItemsTC.brain)}));
    }
}
