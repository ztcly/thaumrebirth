package thaumrebirth.api;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author ztcly
 * @create 2022-02-07 16:50
 * @description 目前它就是个物品列表
 **/
@GameRegistry.ObjectHolder("thaumrebirth")
public class TRBItems {
    ///物品////////////////////
    //注意：这里所有的Item需要是final 后面你写个null都行 TODO 0628:待确认，好像不是这么回事
    public static Item warpWardAmulet;
    public static Item ingotOrderMetal;
    public static Item ingotChaosMetal;
    public static Item ordermetalHelmet;
    public static Item ordermetalChestplate;
    public static Item ordermetalLeggings;
    public static Item ordermetalBoots;



}
