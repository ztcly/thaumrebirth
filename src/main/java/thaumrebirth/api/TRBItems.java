package thaumrebirth.api;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thaumrebirth.items.Itemwarpwardamulet;

/**
 * @author ztcly
 * @create 2022-02-07 16:50
 * @description 目前它就是个物品列表
 **/
@GameRegistry.ObjectHolder("thaumrebirth")
public class TRBItems {
    ///物品////////////////////
    public static final Item warp_ward_amulet=new Itemwarpwardamulet();
}
