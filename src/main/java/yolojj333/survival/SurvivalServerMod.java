package yolojj333.survival;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurvivalServerMod implements ModInitializer {
	public static final String modid = "survival-server-mod";
	public static final Logger log = LoggerFactory.getLogger(modid);

	@Override
	public void onInitialize() {
		log.info("survival server mod starting");
	}
}