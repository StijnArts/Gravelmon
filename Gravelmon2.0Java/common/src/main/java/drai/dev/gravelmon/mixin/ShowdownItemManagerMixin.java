package drai.dev.gravelmon.mixin;

import dev.architectury.platform.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelsextendedbattles.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;


@Mixin(GravelsExtendedBattles.class)
public class ShowdownItemManagerMixin {

    @Inject(
            method = "init",
            at = @At(value = "HEAD") , remap = false
    )
    private static void afterGetPokemon(String showdownFolder, CallbackInfo ci) {
        Gravelmon.init(false);
    }
}
