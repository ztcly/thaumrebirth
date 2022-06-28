package thaumrebirth.common.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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
import thaumrebirth.api.TRBAspects;
import thaumrebirth.api.TRBItems;
import thaumrebirth.common.creativetab.TRBCreativeTab;


@Mod.EventBusSubscriber(modid = "thaumrebirth")
public class TRBItemInitializer {
    ///存在行为的物品///////////
    public static final Itemwarpwardamulet itemWarpWarpAmulet =new Itemwarpwardamulet();    //here to announce the implements of itemclass
    public static final Item ordermetalHelmet = new ItemOrderMetalArmor.Helmet();
    public static final Item ordermetalChestplate = new ItemOrderMetalArmor.Chestplate();
    public static final Item ordermetalLeggings = new ItemOrderMetalArmor.Leggings();
    public static final Item ordermetalBoots = new ItemOrderMetalArmor.Boots();
    ///不存在行为的物品/////////
    public static final Item ingotOrderMetal = new Item().setMaxStackSize(64);
    public static final Item ingotChaosMetal = new Item().setMaxStackSize(64);




    ///注册物品///////////////
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(TRBItems.warpWardAmulet = setupItem(itemWarpWarpAmulet,"warp_ward_amulet"));
        registry.register(TRBItems.ingotOrderMetal = setupItem(ingotOrderMetal,"ingot_ordermetal"));
        registry.register(TRBItems.ingotChaosMetal=setupItem(ingotChaosMetal,"ingot_chaosmetal"));
        registry.register(TRBItems.ordermetalHelmet=setupItem(ordermetalHelmet,"ordermetal_helmet"));
        registry.register(TRBItems.ordermetalChestplate = setupItem(ordermetalChestplate,"ordermetal_chsetplate"));
        registry.register(TRBItems.ordermetalLeggings=setupItem(ordermetalLeggings,"ordermetal_leggings"));
        registry.register(TRBItems.ordermetalBoots=setupItem(ordermetalBoots,"ordermetal_boots"));
    }

    /**
    * @Author: ztcly
    * @Date: 2022/2/7
    * @Description: 给物品设定要素
    */
    ///注册物品的要素///////////
    @SubscribeEvent
    public static void aspectReg(AspectRegistryEvent event){
        event.register.registerObjectTag(new ItemStack(TRBItems.warpWardAmulet), (new AspectList()).add(Aspect.PROTECT, 10).add(Aspect.ORDER, 10).add(Aspect.CRYSTAL,10).add(TRBAspects.GATHER,1));
    }
    /**
    * @Param
    * @Author ztcly
    * @Date 2022/6/28
    * @Description 为物品设定模型
    */
    ///注册物品的模型////////////
    @SideOnly(Side.CLIENT)
    public static void registryModels()
    {
        registerModel(itemWarpWarpAmulet);
        registerModel(ingotOrderMetal);
        registerModel(ingotChaosMetal);
        registerModel(ordermetalHelmet);
        registerModel(ordermetalChestplate);
        registerModel(ordermetalLeggings);
        registerModel(ordermetalBoots);
    }


    //----------------------------------------------

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
        return item.setCreativeTab(TRBCreativeTab.thaumTab)
                .setRegistryName(name)
                .setUnlocalizedName(name)
                .setNoRepair();
    }

}

