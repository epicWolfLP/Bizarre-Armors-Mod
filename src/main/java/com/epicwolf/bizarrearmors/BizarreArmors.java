package com.epicwolf.bizarrearmors;

import com.epicwolf.bizarrearmors.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BizarreArmors.MOD_ID)
public class BizarreArmors {
    public static final String MOD_ID = "data/recepies/bizarrearmors";

    public BizarreArmors() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registrierung Ihrer Gegenstände und anderen Inhalte
        ModItems.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Initialisierungscode hier
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Clientseitige Initialisierungscodes hier
    }
}
//es macht sachen