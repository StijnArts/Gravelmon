package drai.dev.gravelmon.forge;

import dev.architectury.platform.forge.EventBuses;
import drai.dev.gravelmon.Gravelmon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gravelmon.MOD_ID)
public class GravelmonForge {
    public static boolean ICON_MIXIN_INIT = false;
    public static boolean ICON_WIDGET_INIT = false;
    public static int TYPE_COUNT = 18;
    public GravelmonForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Gravelmon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            Gravelmon.init();
    }
}