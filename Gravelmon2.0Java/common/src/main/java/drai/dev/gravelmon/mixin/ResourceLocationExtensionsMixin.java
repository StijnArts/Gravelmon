package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.pokeball.*;
import com.cobblemon.mod.common.util.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ResourceLocationExtensionsKt.class)
public class ResourceLocationExtensionsMixin {

    @Inject(method = "asIdentifierDefaultingNamespace", at =@At("HEAD"), remap = false, cancellable = true)
    private static void injectPokeballs(String name, String name2, CallbackInfoReturnable<PokeBall> cir){
    }
}
