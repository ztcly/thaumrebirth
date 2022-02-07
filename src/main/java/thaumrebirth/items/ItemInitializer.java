package thaumrebirth.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;


@Mod.EventBusSubscriber(modid = "thaumrebirth")
public class ItemInitializer {
    public static final Itemwarpwardamulet ITEMWARPWARDAMULET =new Itemwarpwardamulet();    //here to announce the implements of itemclass





    @SideOnly(Side.CLIENT)                                                     //a method to register model
    private static void registerModel(Item item){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
    }

    private static ItemBlock withRegistryName(ItemBlock item)                   // a method to register Block
    {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(ITEMWARPWARDAMULET);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        registerModel(ITEMWARPWARDAMULET);
    }

    };

