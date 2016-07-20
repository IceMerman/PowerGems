package com.IceMerman.PowerGems.init;

import com.IceMerman.PowerGems.item.PowerGemsItem;
import com.IceMerman.PowerGems.item.ItemUnshapedGem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    //def
    public static final PowerGemsItem UnshapedGem = new ItemUnshapedGem();

    //initialization
    public static void init(){
        GameRegistry.registerItem(UnshapedGem,"UnshapedGem");
    }
}
