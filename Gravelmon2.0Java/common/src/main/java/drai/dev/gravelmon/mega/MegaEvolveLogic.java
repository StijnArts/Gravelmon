package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.api.battles.model.*;
import com.cobblemon.mod.common.api.pokemon.feature.*;
import com.cobblemon.mod.common.battles.pokemon.*;
import com.cobblemon.mod.common.entity.pokemon.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.yajatkaul.mega_showdown.*;
import com.cobblemon.yajatkaul.mega_showdown.config.*;
import com.cobblemon.yajatkaul.mega_showdown.datamanage.*;
import com.cobblemon.yajatkaul.mega_showdown.datapack.data.*;
import com.cobblemon.yajatkaul.mega_showdown.item.*;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.*;
import com.cobblemon.yajatkaul.mega_showdown.utility.*;
import dev.architectury.injectables.annotations.*;
import net.minecraft.core.registries.*;
import net.minecraft.network.chat.*;
import net.minecraft.server.level.*;
import net.minecraft.world.entity.player.*;
import org.intellij.lang.annotations.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import static com.cobblemon.yajatkaul.mega_showdown.event.cobbleEvents.EventUtils.playEvolveAnimation;
import static com.cobblemon.yajatkaul.mega_showdown.utility.Utils.setTradable;

public class MegaEvolveLogic {

    public static void gravelmonEvoLogic(ServerPlayer player, CallbackInfo ci, PokemonEntity pokemonEntity) {
        if (
                pokemonEntity.getAspects().stream().anyMatch(aspect -> aspect.equalsIgnoreCase("mega")
                        || aspect.toLowerCase().contains("mega_")
                        || aspect.toLowerCase().contains("_mega"))) {
            MegaLogic.Devolve(pokemonEntity.getPokemon(), false);
        } else {
            MegaLogic.Evolve(pokemonEntity, player);
        }
        ci.cancel();
    }

    //Out of battle
    public static void doGravelmonMegaLogic(PokemonEntity pokemonEntity, Player player, CallbackInfo ci) {
        if (pokemonEntity.getPokemon().getOwnerPlayer() != player || player.level().isClientSide) return;
        Boolean hasMegaEvolved = MegaEvolveLogic.getMegaData(player);
        if (hasMegaEvolved == null) {
            hasMegaEvolved = false;
        }
        Pokemon pokemon = pokemonEntity.getPokemon();
        if (GravelmonMegas.MEGA_STONE_IDS.containsKey(pokemon.heldItem().getItem())) {
            if (pokemonEntity instanceof PokemonEntity pk) {
                if (pk.getPokemon().getOwnerPlayer() != player) return;
                if (pk.isBattling()) {
                    player.sendSystemMessage(
                            Component.translatable("message.mega_showdown.battle_not_allowed").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
                    );
                    return;
                }
            }
            var megaAspect = "mega";
            var megaSet = GravelmonMegas.MEGA_STONE_IDS.get(pokemon.heldItem().getItem());
            String species = megaSet.component1();
            String aspect;
            if (species.contains(" ")) {
                aspect = species.split(" ")[1];
                species = species.split(" ")[0];
            } else {
                aspect = null;
            }
            boolean speciesMatchesStone = species.equalsIgnoreCase(pokemon.getSpecies().getName()) &&
                    (aspect == null || pokemonEntity.getAspects().stream().anyMatch(entityAspect -> entityAspect.equalsIgnoreCase(aspect)));
            if (speciesMatchesStone) {
                megaAspect = megaSet.component2();

                if (speciesMatchesStone && (!hasMegaEvolved || MegaShowdownConfig.multipleMegas.get())) {
                    MegaEvolveLogic.setMegaData(player, true);
                    MegaEvolveLogic.setMegaPokemon(player, new PokeHandler(pokemon));

                    MegaLogic.megaEvolve(pokemonEntity, megaAspect);
                    setTradable(pokemon, false);
                    ci.cancel();
                }
            }
        }
    }

    public static void doGravelmonMegaLogic(PokemonEntity pokemonEntity, Player player,
                                            BattlePokemon battlePokemon, PokemonBattle pokemonBattle, CallbackInfo ci) {
        Pokemon pokemon = pokemonEntity.getPokemon();
        if (GravelmonMegas.MEGA_STONE_IDS.containsKey(pokemon.heldItem().getItem())) {
            if (pokemonEntity instanceof PokemonEntity pk) {
                if (pk.getPokemon().getOwnerPlayer() != player) return;
            }
            var megaAspect = "mega";
            var megaSet = GravelmonMegas.MEGA_STONE_IDS.get(pokemon.heldItem().getItem());
            String species = megaSet.component1();
            String aspect;
            if (species.contains(" ")) {
                aspect = species.split(" ")[1];
                species = species.split(" ")[0];
            } else {
                aspect = null;
            }
            boolean speciesMatchesStone = species.equalsIgnoreCase(pokemon.getSpecies().getName()) &&
                    (aspect == null || pokemonEntity.getAspects().stream().anyMatch(entityAspect -> entityAspect.equalsIgnoreCase(aspect)));
            if (speciesMatchesStone) {
                megaAspect = megaSet.component2();
                Boolean hasMegaEvolved = MegaEvolveLogic.getMegaData(player);
                if (hasMegaEvolved == null) {
                    hasMegaEvolved = false;
                }
                if (speciesMatchesStone && (!hasMegaEvolved || MegaShowdownConfig.multipleMegas.get())) {
                    MegaEvolveLogic.setMegaData(player, true);
                    MegaEvolveLogic.setMegaPokemon(player, new PokeHandler(pokemon));

                    MegaLogic.megaEvolve(pokemonEntity, megaAspect, battlePokemon, pokemonBattle);

                    new StringSpeciesFeature("mega_evolution", megaAspect).apply(pokemon);
                    setTradable(pokemon, false);
                }
                ci.cancel();
            }
        }
    }

    @ExpectPlatform
    public static Boolean getMegaData(Player player) {
        throw new AssertionError("not implemented");
    }

    @ExpectPlatform
    public static void setMegaData(Player player, boolean data) {
        throw new AssertionError("not implemented");
    }

    @ExpectPlatform
    public static void setMegaPokemon(Player player, PokeHandler handler) {
        throw new AssertionError("not implemented");
    }
}
