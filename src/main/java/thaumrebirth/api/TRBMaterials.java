package thaumrebirth.api;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import thaumrebirth.ThaumRebirthMOD;

/**
 * @Author ztcly
 * @Date 2022-06-28 12:16
 * @Description
 **/
public class TRBMaterials {
    ///护甲材料///////////
    public static final ItemArmor.ArmorMaterial ORDERMETAL = EnumHelper.addArmorMaterial("ORDERMETAL",
            ThaumRebirthMOD.MODID + ":" + "ordermetal", 33, new int[]
                    { 2, 6, 5, 2 },10,SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F).setRepairItem(new ItemStack(TRBItems.ingotOrderMetal));
}
