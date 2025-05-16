package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;

import java.util.function.*;

import static drai.dev.gravelmon.forge.GravelmonForge.POKEBALL_INIT;

public class GravelmonImpl {
    public static void platformInit() {
        CobblemonEvents.THROWN_POKEBALL_HIT.subscribe(Priority.HIGHEST, thrownPokeballHitEvent -> {
            if(!POKEBALL_INIT){
                GravelmonItems.POKE_BALLS.stream().map(Supplier::get).forEach(pokeBallItem -> {
                    var gravelmonPokeball= (GravelmonPokeBall)pokeBallItem.getPokeBall();
                    gravelmonPokeball.registerItem();
                });
                POKEBALL_INIT = true;
            }
            return Unit.INSTANCE;
        });
    }
}
