package drai.dev.gravelmon.fabric.mixin;

import drai.dev.gravelmon.fabric.paleontologistcompat.*;
import net.hana.cobblemon_paleontologist.*;
import net.minecraft.world.entity.npc.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(CobblemonPaleontologist.class)
public class CobblemonPaleontologistMixin {
    @Shadow @Final public static VillagerProfession PALEONTOLOGIST;

    @Inject(
            method = "registerCustomTrades",
            at = @At(value = "HEAD"), // First return in the method
            cancellable = true,
            remap = false
    )
    private static void afterGetPokemon(CallbackInfo ci) {
        PaleontologistOverride.addGravelmonFossils(PALEONTOLOGIST, ci);
    }
}
