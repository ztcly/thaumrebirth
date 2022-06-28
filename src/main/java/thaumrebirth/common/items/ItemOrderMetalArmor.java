package thaumrebirth.common.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import thaumrebirth.api.TRBMaterials;

/**
 * @Author ztcly
 * @Date 2022-06-28 11:21
 * @Description
 **/
public class ItemOrderMetalArmor extends ItemArmor {
    public ItemOrderMetalArmor(EntityEquipmentSlot equipmentSlot){
        super(TRBMaterials.ORDERMETAL,TRBMaterials.ORDERMETAL.ordinal(),equipmentSlot);
    }
    public static class Helmet extends ItemOrderMetalArmor{
        public Helmet(){
            super(EntityEquipmentSlot.HEAD);
        }
    }
    public static class Chestplate extends ItemOrderMetalArmor{
        public Chestplate(){
            super(EntityEquipmentSlot.CHEST);
        }
    }
    public static class Leggings extends ItemOrderMetalArmor{
        public Leggings(){
            super(EntityEquipmentSlot.LEGS);
        }
    }
    public static class Boots extends ItemOrderMetalArmor{
        public Boots(){
            super(EntityEquipmentSlot.FEET);
        }
    }
}
