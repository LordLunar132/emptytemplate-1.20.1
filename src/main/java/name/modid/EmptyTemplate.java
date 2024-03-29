package name.modid;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmptyTemplate implements ModInitializer {
	public static final String MOD_ID = "emptytemplate";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		LOGGER.info("Empty template. DON'T FORGET TO RENAME EVERYTHING: FOLDERS MOD ID etc.");
	}
}