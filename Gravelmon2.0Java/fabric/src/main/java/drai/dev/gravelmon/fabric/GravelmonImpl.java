package drai.dev.gravelmon.fabric;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.impl.content.registry.*;

import java.util.function.*;

import static drai.dev.gravelmon.fabric.CreativeTabsInit.initCreativeTabs;

public class GravelmonImpl {
    public static void platformInit() {
//        boolean isNotDataGen = System.getProperty("fabric-api.datagen") == null;
//        Gravelmon.init(isNotDataGen);
        GravelmonFeatures.registerFeatures();
        initCreativeTabs();
        var orangeApp = GravelmonItems.ORANGE_APRICORN.get();
        CompostingChanceRegistryImpl.INSTANCE.add(orangeApp, .65f);
        CompostingChanceRegistryImpl.INSTANCE.add(GravelmonItems.PURPLE_APRICORN.get(), .65f);
        GravelmonItems.POKE_BALLS.stream().map(Supplier::get).forEach(pokeBallItem -> {
            var gravelmonPokeball= (GravelmonPokeBall)pokeBallItem.getPokeBall();
            gravelmonPokeball.registerItem();
        });
    }
}
