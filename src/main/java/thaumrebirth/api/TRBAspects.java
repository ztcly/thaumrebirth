package thaumrebirth.api;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;

/**
 * @author ztcly
 * @create 2022-02-08 16:46
 * @description 注册TRB自己的要素
 **/
public class TRBAspects {
    /**
    * @Param [tag],[java.lang.String]:要素的tag
    * @Author ztcly
    * @Date 2022/2/8
    * @Description 用于获取要素的图标。图标文件应当与tag同名并放在assets\thaumrebirth\textures\aspects下并与tag同名。32*32透明背景的png格式文件.
    */
    public static ResourceLocation resourceLocation(String tag){
        return new ResourceLocation("thaumrebirth","textures/aspects/"+tag.toLowerCase()+".png");
    }


    /**
    * @Param tag:即要素的拉丁文名称，在游戏中显示
     * @param color :要素的颜色
     * @param components :要素的合成
    * @Author ztcly
    * @Date 2022/2/8
    * @Description
    */
    public static Aspect trbaspectReg(String tag,int color,Aspect[] components){
        return new Aspect(tag,color,components,resourceLocation(tag),1);
    }

    ///要素////////////////////
    /**
     *不更改默认设置可以使用trbaspectReg.如果需要更改设置直接使用Aspect构造方法
     */
    public static final Aspect GATHER = trbaspectReg("colligere",0x56c000,new Aspect[] {Aspect.MECHANISM,Aspect.VOID});
}
