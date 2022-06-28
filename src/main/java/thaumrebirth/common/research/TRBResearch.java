package thaumrebirth.common.research;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;

/**
 * @Author ztcly
 * @Date 2022-02-08 19:24
 * @Description 注册TRB自己的研究
 **/
public class TRBResearch {
    /**
    * @Param [research],[java.lang.String]:研究的json文件名称(不需要后缀)
    * @Author ztcly
    * @Date 2022/2/8
    * @Description 用于获取研究的json文件位置，json文件放置在/assets/thaumrebirth/research下
    */
    private static ResourceLocation getResearchJSON(String research){
        return new ResourceLocation("thaumrebirth","research/"+research.toLowerCase()+".json");
    }

    public static void initResearch(){
        //这里是用于创建自己的研究分页
        ResearchCategories.registerCategory("THAUMREBIRTH", "FIRSTSTEPS", new AspectList(),
                new ResourceLocation("thaumcraft", "textures/research/cat_infusion.png"),
                new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_over.png")
        );

        ///研究////////////////
        /**
         *创建新的研究，使用ThaumcraftApi.registerResearchLocation注册，getResearchJSON定位json文件位置
         */
        ThaumcraftApi.registerResearchLocation(getResearchJSON("base"));
        ThaumcraftApi.registerResearchLocation(getResearchJSON("warpwardamulet"));
    }



}
