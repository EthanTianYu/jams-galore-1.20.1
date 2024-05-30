package net.ethantianyu.jamsgalore;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JamsGalore implements ModInitializer {
	public static final String MOD_ID =  "jamsgalore";
    public static final Logger LOGGER = LoggerFactory.getLogger("jamsgalore");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}