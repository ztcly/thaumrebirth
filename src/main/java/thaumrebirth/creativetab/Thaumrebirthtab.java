package thaumrebirth.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thaumrebirth.ThaumRebirthMOD;
import thaumrebirth.api.TRBItems;

public class Thaumrebirthtab extends CreativeTabs {
    public static final Thaumrebirthtab thaumTab = new Thaumrebirthtab();

    public Thaumrebirthtab(){
        super(ThaumRebirthMOD.MODID);
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(TRBItems.warp_ward_amulet);
    }
}
