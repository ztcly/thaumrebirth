package thaumrebirth.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thaumrebirth.ThaumRebirthMOD;
import thaumrebirth.api.TRBItems;

public class TRBCreativeTab extends CreativeTabs {
    public static final TRBCreativeTab thaumTab = new TRBCreativeTab();

    public TRBCreativeTab(){
        super(ThaumRebirthMOD.MODID);
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(TRBItems.warp_ward_amulet);
    }
}
