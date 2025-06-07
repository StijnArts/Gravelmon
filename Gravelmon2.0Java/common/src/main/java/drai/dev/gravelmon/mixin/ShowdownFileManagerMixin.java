package drai.dev.gravelmon.mixin;

import drai.dev.gravelmon.*;
import drai.dev.gravelsextendedbattles.showdown.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;


@Mixin(ShowdownFileManager.class)
public class ShowdownFileManagerMixin {

    @Inject(
            method = "injectShowdown",
            at = @At(value = "HEAD") , remap = false
    )
    private static void afterGetPokemon(CallbackInfo ci) {
        Gravelmon.init(false);
    }
}
