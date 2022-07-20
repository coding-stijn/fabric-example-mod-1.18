package net.stijnnn.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.stijnnn.tutorialmod.block.ModBlocks;
import net.stijnnn.tutorialmod.item.ModItem;
import net.stijnnn.tutorialmod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod  implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItem.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

	}
}
