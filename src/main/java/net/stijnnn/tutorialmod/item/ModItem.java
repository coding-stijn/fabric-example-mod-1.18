package net.stijnnn.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.stijnnn.tutorialmod.TutorialMod;
import net.minecraft.util.registry.Registry;
import net.stijnnn.tutorialmod.item.custom.DowsingRodItem;
import net.stijnnn.tutorialmod.item.custom.ModAxeItem;
import net.stijnnn.tutorialmod.item.custom.ModHoeItem;
import net.stijnnn.tutorialmod.item.custom.ModPickaxeItem;

import javax.annotation.Nullable;

public class ModItem {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item PP = registerItem("pp",
            new Item(new FabricItemSettings().group(ModItemGroup.MEME)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.CUSTOM).maxDamage(16)));

    public static final Item LILAC_FLOWER_BULB = registerItem("lilac_flower_bulb",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM).food(ModFoodComponents.GRAPE)));

    public static final Item PANCAKE = registerItem("pancake",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM).food(ModFoodComponents.PANCAKE)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new SwordItem(ModToolMaterials.MYTHRIL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModAxeItem(ModToolMaterials.MYTHRIL, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoeItem(ModToolMaterials.MYTHRIL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MYTHRIL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
