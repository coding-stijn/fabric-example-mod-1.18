package net.stijnnn.tutorialmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.stijnnn.tutorialmod.TutorialMod;
import net.stijnnn.tutorialmod.item.ModItem;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        TutorialMod.LOGGER.info("Registring Fuels for " + TutorialMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItem.LILAC_FLOWER_BULB, 200);

    }


}
