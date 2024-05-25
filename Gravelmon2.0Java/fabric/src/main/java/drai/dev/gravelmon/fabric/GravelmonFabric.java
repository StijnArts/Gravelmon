package drai.dev.gravelmon.fabric;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.api.moves.*;
import com.cobblemon.mod.common.api.pokemon.*;
import com.cobblemon.mod.common.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.blockrenderlayer.v1.*;
import net.minecraft.client.renderer.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;

import java.util.*;

import static drai.dev.gravelmon.fabric.CreativeTabsInit.*;

public class GravelmonFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Gravelmon.init();
        GravelmonFeatures.registerFeatures();
        initCreativeTabs();
    }
}