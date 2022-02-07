package thaumrebirth.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.Thaumcraft;
import thaumcraft.common.items.IThaumcraftItems;
import thaumrebirth.ThaumRebirthMOD;

public class Thaumrebirthtab extends CreativeTabs {
    public  static  final  Thaumrebirthtab thaumTab = new Thaumrebirthtab();

    public  Thaumrebirthtab(){
        super(ThaumRebirthMOD.MODID);
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.COMPASS);
    }
}
