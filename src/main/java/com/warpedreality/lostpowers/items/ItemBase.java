package com.warpedreality.lostpowers.items;

import com.warpedreality.lostpowers.Main;
import com.warpedreality.lostpowers.utils.IHasModel;
import com.warpedreality.lostpowers.utils.RegistryHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        RegistryHelper.registerItem(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
