package com.epicwolf.bizarrearmors.items;

import com.epicwolf.bizarrearmors.BizarreArmors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroups {

    public static final ItemGroup BIZARRE_ARMORS_TAB = new ItemGroup("bizarrearmors_tab") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JOTARO_CAP.get());
        }

        @Override
        public boolean hasSearchBar() {
            return false;
        }
    };
}
//Mod Item Tab