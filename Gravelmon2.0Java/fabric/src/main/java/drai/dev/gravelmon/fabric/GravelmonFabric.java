package drai.dev.gravelmon.fabric;

import drai.dev.gravelmon.*;
import net.fabricmc.api.*;

import static drai.dev.gravelmon.fabric.CreativeTabsInit.*;

public class GravelmonFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Gravelmon.init();
        GravelmonFeatures.registerFeatures();
        initCreativeTabs();
    }
}