package net.ethantianyu.jamsgalore;

import net.ethantianyu.jamsgalore.block.ModBlocks;
import net.ethantianyu.jamsgalore.effect.ModEffects;
import net.ethantianyu.jamsgalore.item.ModItemGroups;
import net.ethantianyu.jamsgalore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JamsGalore implements ModInitializer {
	public static final String MOD_ID =  "jamsgalore";
    public static final Logger LOGGER = LoggerFactory.getLogger("jamsgalore");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemgroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();
	}
}