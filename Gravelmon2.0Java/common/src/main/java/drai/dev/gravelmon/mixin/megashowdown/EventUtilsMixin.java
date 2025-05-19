package drai.dev.gravelmon.mixin.megashowdown;

import com.cobblemon.mod.common.api.pokemon.feature.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.yajatkaul.mega_showdown.config.*;
import com.cobblemon.yajatkaul.mega_showdown.event.cobbleEvents.*;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(EventUtils.class)
public class EventUtilsMixin {

    @Inject(
            method = "revertFormesEnd",
            at = @At(value = "HEAD"),
            remap = false,
            cancellable = true
    )
    private static void afterGetPokemon(Pokemon pokemon, boolean joinedEvent, CallbackInfo ci) {
        if(joinedEvent) return;
        if(!(pokemon.getAspects().stream().anyMatch(aspect->aspect.equalsIgnoreCase("mega")
                ||aspect.toLowerCase().contains("mega_")
                ||aspect.toLowerCase().contains("_mega")))) return;
        if(ShowdownConfig.revertMegas.get() && !ShowdownConfig.multipleMegas.get()) {
            MegaLogic.Devolve(pokemon, true);
        } else {
            new StringSpeciesFeature("mega_evolution", "none").apply(pokemon);
        }

        ci.cancel();
    }
}
