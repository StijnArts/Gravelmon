package drai.dev.gravelmon.mixin.megashowdown;

import com.cobblemon.mod.common.api.events.battles.*;
import com.cobblemon.yajatkaul.mega_showdown.event.cobbleEvents.*;
import drai.dev.gravelmon.mega.*;
import kotlin.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(RevertEvents.class)
public class RevertEventsMixin {

    @Inject(
            method = "devolveFainted",
            at = @At(value = "HEAD"),
            remap = false,
            cancellable = true
    )
    private static void afterGetPokemon(BattleFaintedEvent battleFaintedEvent, CallbackInfoReturnable<Unit> cir) {
        cir.setReturnValue(GravelmonRevertEvents.devolveFainted(battleFaintedEvent));
        cir.cancel();
    }

    @Inject(
            method = "deVolveFlee",
            at = @At(value = "HEAD"),
            remap = false,
            cancellable = true
    )
    private static void afterGetPokemon(BattleFledEvent battleFledEvent, CallbackInfoReturnable<Unit> cir) {
        cir.setReturnValue(GravelmonRevertEvents.deVolveFlee(battleFledEvent));
        cir.cancel();
    }
}

