package thaumrebirth.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "thaumrebirth")
public class ItemInitializer {
    public static Item warpwardamulet;

    public static final CreativeTabs THAUMREBIRTH = new CreativeTabs("thaumrebirth") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.COMPASS);
        }


    };

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(
                warpwardamulet = new Itemwarpwardamulet().setRegistryName("thaumrebirth:itemwarpwardamulet")
                        .setCreativeTab(THAUMREBIRTH)
                        .setUnlocalizedName("itemwarpwardamulet")
                        .setMaxStackSize(1)



        );
    }
}
