package drai.dev.gravelmon.fabric;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.impl.content.registry.*;
import net.minecraft.world.level.block.*;

import static drai.dev.gravelmon.fabric.CreativeTabsInit.*;

public class GravelmonFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Gravelmon.init();
        GravelmonFeatures.registerFeatures();
        initCreativeTabs();
        var orangeApp = GravelmonItems.ORANGE_APRICORN.get();
        CompostingChanceRegistryImpl.INSTANCE.add(orangeApp, .65f);
        CompostingChanceRegistryImpl.INSTANCE.add(GravelmonItems.PURPLE_APRICORN.get(), .65f);
    }
}