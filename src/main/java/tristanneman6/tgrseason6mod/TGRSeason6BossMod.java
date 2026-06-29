package tristanneman6.tgrseason6mod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tristanneman6.tgrseason6mod.item.ModItems;

public class TGRSeason6BossMod implements ModInitializer {
	public static final String MOD_ID = "tgr-season-6-boss-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
