package thaumrebirth.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;
import thaumrebirth.api.TRBItems;
import thaumrebirth.aspect.TRBAspects;
import thaumrebirth.creativetab.TRBCreativeTab;


@Mod.EventBusSubscriber(modid = "thaumrebirth")
public class TRBItemInitializer {
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

    /**
    * @Param: [item, name]
    * @Author: ztcly
    * @Date: 2022/2/7
    * @Description: a method to set CreativeTab,RegistryName and UnlocalizedName
    */
    private static Item setupItem(Item item,String name){
        return item.setCreativeTab(TRBCreativeTab.thaumTab).setRegistryName(name).setUnlocalizedName(name);
    }

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(setupItem(ITEMWARPWARDAMULET,"warp_ward_amulet"));
    }

    /**
    * @Author: ztcly
    * @Date: 2022/2/7
    * @Description: 给物品设定要素
    */
    @SubscribeEvent
    public static void aspectReg(AspectRegistryEvent event){
        event.register.registerObjectTag(new ItemStack(TRBItems.warp_ward_amulet), (new AspectList()).add(Aspect.PROTECT, 10).add(Aspect.ORDER, 10).add(Aspect.CRYSTAL,10).add(TRBAspects.GATHER,1));
    }
    /**
    * @Param [event],[net.minecraftforge.client.event.ModelRegistryEvent]
    * @Author ztcly
    * @Date 2022/6/25
    * @Description 为物品设置模型
     * SIDEONLY
    */
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        registerModel(ITEMWARPWARDAMULET);
    }

    };

