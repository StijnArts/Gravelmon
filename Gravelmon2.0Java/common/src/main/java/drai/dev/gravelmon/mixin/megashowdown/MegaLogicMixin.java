package drai.dev.gravelmon.mixin.megashowdown;

import com.cobblemon.mod.common.api.battles.model.*;
import com.cobblemon.mod.common.battles.pokemon.*;
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
            method = "Evolve(Lcom/cobblemon/mod/common/entity/pokemon/PokemonEntity;Lnet/minecraft/world/entity/player/Player;)V",
            at = @At(value = "HEAD"), // First return in the method
            cancellable = true
    )
    private static void afterGetPokemon(PokemonEntity context, Player player, CallbackInfo ci) {
        doGravelmonMegaLogic(context, player, ci);
    }

    @Inject(
            method = "Evolve(Lcom/cobblemon/mod/common/entity/pokemon/PokemonEntity;Lnet/minecraft/world/entity/player/Player;Lcom/cobblemon/mod/common/battles/pokemon/BattlePokemon;Lcom/cobblemon/mod/common/api/battles/model/PokemonBattle;)V",
            at = @At(value = "HEAD"), // First return in the method
            cancellable = true
    )
    private static void afterGetPokemon(PokemonEntity context, Player player, BattlePokemon battlePokemon, PokemonBattle pokemonBattle, CallbackInfo ci) {
        doGravelmonMegaLogic(context, player, battlePokemon, pokemonBattle, ci);
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
}
