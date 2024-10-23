package com.epicwolf.bizarrearmors.items;

import com.epicwolf.bizarrearmors.BizarreArmors;
import com.epicwolf.bizarrearmors.BizarreArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = BizarreArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BizarreArmors.MOD_ID);

    // Registrierung der bereits vorhandenen Rüstungsteile
    public static final RegistryObject<Item> JOTARO_CAP = ITEMS.register("jotaro_cap",
            () -> new ModArmorItem(BizarreArmorMaterial.JOTARO_ARMOR_MATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> JOTARO_CHESTPLATE = ITEMS.register("jotaro_chestplate",
            () -> new ModArmorItem(BizarreArmorMaterial.JOTARO_ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> JOTRO_LEGGINGS = ITEMS.register("jotaro_leggings",
            () -> new ModArmorItem(BizarreArmorMaterial.JOTARO_ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> JOTARO_BOOTS = ITEMS.register("jotaro_boots",
            () -> new ModArmorItem(BizarreArmorMaterial.JOTARO_ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));

    // Registrierung der neuen Old Joseph Rüstungsteile
    public static final RegistryObject<Item> OLD_JOSEPH_HAT = ITEMS.register("old_joseph_hat",
            () -> new ModArmorItem(BizarreArmorMaterial.OLD_JOSEPH_ARMOR_MATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> OLD_JOSEPH_CHESTPLATE = ITEMS.register("old_joseph_chestplate",
            () -> new ModArmorItem(BizarreArmorMaterial.OLD_JOSEPH_ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> OLD_JOSEPH_LEGGINGS = ITEMS.register("old_joseph_leggings",
            () -> new ModArmorItem(BizarreArmorMaterial.OLD_JOSEPH_ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> OLD_JOSEPH_BOOTS = ITEMS.register("old_joseph_boots",
            () -> new ModArmorItem(BizarreArmorMaterial.OLD_JOSEPH_ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));

    public static final RegistryObject<Item> DIO_HELMET = ITEMS.register("dio_helmet",
            () -> new ModArmorItem(BizarreArmorMaterial.DIO_ARMOR_MATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> DIO_CHESTPLATE = ITEMS.register("dio_chestplate",
            () -> new ModArmorItem(BizarreArmorMaterial.DIO_ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> DIO_LEGGINGS = ITEMS.register("dio_leggings",
            () -> new ModArmorItem(BizarreArmorMaterial.DIO_ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> DIO_BOOTS = ITEMS.register("dio_boots",
            () -> new ModArmorItem(BizarreArmorMaterial.DIO_ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));

    public static final RegistryObject<Item> POLNAREFF_HAIR = ITEMS.register("polnareff_hair",
            () -> new ModArmorItem(BizarreArmorMaterial.POLNAREFF_ARMOR_MATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> POLNAREFF_CHESTPLATE = ITEMS.register("polnareff_chestplate",
            () -> new ModArmorItem(BizarreArmorMaterial.POLNAREFF_ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> POLNAREFF_LEGGINGS = ITEMS.register("polnareff_leggings",
            () -> new ModArmorItem(BizarreArmorMaterial.POLNAREFF_ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> POLNAREFF_BOOTS = ITEMS.register("polnareff_boots",
            () -> new ModArmorItem(BizarreArmorMaterial.POLNAREFF_ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));

    public static final RegistryObject<Item> AVDOL_HEADBAND = ITEMS.register("avdol_headband",
            () -> new ModArmorItem(BizarreArmorMaterial.AVDOL_ARMOR_MATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> AVDOL_CHESTPLATE = ITEMS.register("avdol_chestplate",
            () -> new ModArmorItem(BizarreArmorMaterial.AVDOL_ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> AVDOL_LEGGINGS = ITEMS.register("avdol_leggings",
            () -> new ModArmorItem(BizarreArmorMaterial.AVDOL_ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> AVDOL_BOOTS = ITEMS.register("avdol_boots",
            () -> new ModArmorItem(BizarreArmorMaterial.AVDOL_ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));

    public static final RegistryObject<Item> KAKYOIN_CHESTPLATE = ITEMS.register("kakyoin_chestplate",
            () -> new ModArmorItem(BizarreArmorMaterial.KAKYOIN_ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> KAKYOIN_LEGGINGS = ITEMS.register("kakyoin_leggings",
            () -> new ModArmorItem(BizarreArmorMaterial.KAKYOIN_ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));
    public static final RegistryObject<Item> KAKYOIN_BOOTS = ITEMS.register("kakyoin_boots",
            () -> new ModArmorItem(BizarreArmorMaterial.KAKYOIN_ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroups.BIZARRE_ARMORS_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}