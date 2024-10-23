package com.epicwolf.bizarrearmors;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BizarreItemGroup {
    public static final ItemGroup BIZARRE_GROUP = new ItemGroup("bizarreTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };
}
//macht den helm als icon für den minecraft item tab