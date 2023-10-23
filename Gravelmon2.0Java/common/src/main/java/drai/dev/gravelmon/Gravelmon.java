package drai.dev.gravelmon;

import com.google.common.base.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.registries.*;

public class Gravelmon
{
	public static final String MOD_ID = "gravelmon";
	public static String[] bannedLabels;
	public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
	public static void init() {
		GravelmonBlocks.BLOCKS.register();
		GravelmonItems.ITEMS.register();
	}
}
