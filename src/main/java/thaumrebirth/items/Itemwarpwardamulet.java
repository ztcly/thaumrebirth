package thaumrebirth.items;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import thaumcraft.common.lib.potions.PotionWarpWard;

import java.util.Collection;

public class Itemwarpwardamulet extends Item implements IBauble{
    public static PotionWarpWard potionWarpWard;

    public Itemwarpwardamulet(){
                //this.setCreativeTab(TRBCreativeTab.thaumTab);
                //this.setUnlocalizedName("itemwarpwardamulet");
                this.setMaxStackSize(1);
                //this.setRegistryName("warp_ward_amulet");

    }



    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.AMULET;
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        boolean playerhaswarpward=false;
       Collection<PotionEffect> potioneffect = player.getActivePotionEffects();
       if(!potioneffect.isEmpty()){
           //player.sendMessage(new TextComponentTranslation("thaumrebirth.amulet.noeffect"));
           for(PotionEffect p : potioneffect){
               if(p.getEffectName().equals("potion.warpward")){
                   playerhaswarpward=true;
               }
           }
       }
        if(!playerhaswarpward) {
            player.addPotionEffect(new PotionEffect(PotionWarpWard.instance, 200, 0));
        }
    }


}
