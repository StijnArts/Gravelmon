package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.entity.pokemon.*;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.*;
import com.llamalad7.mixinextras.sugar.*;
import net.minecraft.server.level.*;
import net.minecraft.world.entity.player.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import static drai.dev.gravelmon.mega.MegaEvolveLogic.doGravelmonMegaLogic;
import static drai.dev.gravelmon.mega.MegaEvolveLogic.gravelmonEvoLogic;

@Mixin(MegaLogic.class)
public class MegaLogicMixin {

    @Inject(
            method = "Evolve",
            at = @At(value = "HEAD"), // First return in the method
            cancellable = true
    )
    private static void afterGetPokemon(PokemonEntity context, Player player, Boolean fromBattle, CallbackInfo ci) {
        doGravelmonMegaLogic(context, player, fromBattle, ci);
    }

    @Inject(
            method = "EvoLogic",
            at = @At(value = "RETURN", ordinal = 2), // First return in the method
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private static void afterLastCheck(ServerPlayer player, CallbackInfo ci, @Local PokemonEntity pokemonEntity) {
        gravelmonEvoLogic(player, ci, pokemonEntity);
    }

//    /**
//     * @author drai
//     * @reason Replace mega evolution logic to allow for multiple mega features and integrate with gravelmon registration style
//     */
//    @Overwrite
//    public static void Evolve(PokemonEntity context, Player player, Boolean fromBattle) {
//        MegaEvolveLogic.evolve(context, player, fromBattle);
//    }
//    /**
//     * @author drai
//     * @reason Replace mega evolution logic to allow for multiple mega features and integrate with gravelmon registration style
//     */
//    @Overwrite
//    public static void EvoLogic(ServerPlayer player) {
//        MegaEvolveLogic.EvoLogic(player);
//    }
}
