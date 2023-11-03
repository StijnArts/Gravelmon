package drai.dev.gravelmon.fabric;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.api.moves.*;
import com.cobblemon.mod.common.api.pokemon.*;
import com.cobblemon.mod.common.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.blockrenderlayer.v1.*;
import net.minecraft.client.renderer.*;

import static drai.dev.gravelmon.fabric.CreativeTabsInit.*;

public class GravelmonFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Gravelmon.init();
        GravelmonFeatures.registerFeatures();
        initCreativeTabs();


    }
}