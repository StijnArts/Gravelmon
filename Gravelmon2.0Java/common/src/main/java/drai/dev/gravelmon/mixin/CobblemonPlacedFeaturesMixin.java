package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.world.feature.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.world.level.levelgen.placement.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(CobblemonPlacedFeatures.class)
public class CobblemonPlacedFeaturesMixin {

    /*@Inject(method = "of", at =@At("HEAD"), remap = false, cancellable = true)
    private void ofReplacement(String id, CallbackInfoReturnable<ResourceKey<PlacedFeature>> cir){
        System.out.println("this mixin is active");
        if(id.equals("apricorn_trees")){
            System.out.println("Im trying to replace the apricorn placed features");
            cir.setReturnValue(ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("gravelmon",id)));
            cir.cancel();
        }
    }*/
}
