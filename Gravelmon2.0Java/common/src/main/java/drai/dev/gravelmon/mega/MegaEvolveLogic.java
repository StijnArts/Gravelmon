package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.api.pokemon.feature.*;
import com.cobblemon.mod.common.entity.pokemon.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.yajatkaul.mega_showdown.config.*;
import com.cobblemon.yajatkaul.mega_showdown.datamanage.*;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.*;
import dev.architectury.injectables.annotations.*;
import net.minecraft.network.chat.*;
import net.minecraft.server.level.*;
import net.minecraft.world.entity.player.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import java.util.*;

import static com.cobblemon.yajatkaul.mega_showdown.megaevo.MegaLogic.playEvolveAnimation;
import static com.cobblemon.yajatkaul.mega_showdown.utility.Utils.setTradable;

public class MegaEvolveLogic {
//    public static void EvoLogic(ServerPlayer player){
//        if(ShowdownConfig.battleModeOnly.get()){
//            return;
//        }
//
//        double range = 5.0;
//
//        Vec3 startPos = player.getEyePosition();
//        Vec3 lookVec = player.getLookAngle();
//        Vec3 endPos = startPos.add(lookVec.scale(range));
//
//        EntityHitResult entityHit = ProjectileUtil.getEntityHitResult(
//                player,
//                startPos,
//                endPos,
//                player.getBoundingBox().expandTowards(lookVec.scale(range)).inflate(1.0),
//                entity -> !entity.isSpectator() && entity.isPickable(),
//                range * range
//        );
//
//        if(entityHit == null){
//            return;
//        }
//
//        if(entityHit.getEntity() instanceof PokemonEntity pokemonEntity) {
//            if(pokemonEntity.level().isClientSide){
//                return;
//            }
//            var gravelmonMega = GravelmonMegas.getMegas(pokemonEntity.getPokemon().getSpecies().getName(), pokemonEntity.getAspects());
//            boolean isRegisteredMega = Utils.MEGA_POKEMONS.contains(pokemonEntity.getPokemon().getSpecies().getName()) || !gravelmonMega.isEmpty();
//            if(!ShowdownConfig.mega.get() || pokemonEntity.getPokemon().getOwnerPlayer() != player ||
//                    (
//                            !isRegisteredMega
//                            && !pokemonEntity.getPokemon().getSpecies().getName().equals("Rayquaza")
//                    )
//                    || !Possible(player, false)){
//                return;
//            }
//
//            if(pokemonEntity.getAspects().stream().anyMatch(aspect->aspect.equalsIgnoreCase("mega")||aspect.toLowerCase().contains("mega_")||aspect.toLowerCase().contains("_mega"))) {
//                MegaLogic.Devolve(pokemonEntity.getPokemon(), false);
//            }else {
//                evolve(pokemonEntity, player, false);
//            }
//        }
//    }
//
//    public static void evolve(PokemonEntity pokemonEntity, Player player, Boolean fromBattle) {
//        System.out.println("IM OVERWRITING THE MEGA EVOLVE METHOD");
//        if(pokemonEntity instanceof PokemonEntity pk){
//            if(pk.getPokemon().getOwnerPlayer() != player){
//                return;
//            }
//        }
//
//        Boolean hasMegaEvolved = getMegaData(player);
//        if(hasMegaEvolved == null){
//            hasMegaEvolved = false;
//        }
//
//        Pokemon pokemon = (pokemonEntity).getPokemon();
//
//        boolean speciesMatchesStone = false;
//        String species = null;
//        var megaAspect = "mega";
//        if(Utils.MEGA_STONE_IDS.containsKey(pokemon.heldItem().getItem())){
//            species = Utils.MEGA_STONE_IDS.get(pokemon.heldItem().getItem());
//            speciesMatchesStone = species.equals(pokemon.getSpecies().getName());
//        } else if(GravelmonMegas.MEGA_STONE_IDS.containsKey(pokemon.heldItem().getItem())){
//            species = GravelmonMegas.MEGA_STONE_IDS.get(pokemon.heldItem().getItem());
//            var aspect = species.split(" ")[1];
//            species = species.split(" ")[0];
//            speciesMatchesStone = species.equalsIgnoreCase(pokemon.getSpecies().getName()) &&
//                    pokemonEntity.getAspects().stream().anyMatch(entityAspect->entityAspect.equalsIgnoreCase(aspect));
//            if(speciesMatchesStone) {
//                megaAspect = aspect;
//
//            }
//        }
//
//        if(pokemonEntity instanceof PokemonEntity pk && (pk.isBattling() && !fromBattle)){
//            player.sendSystemMessage(
//                    Component.translatable("message.mega_showdown.battle_not_allowed")
//                            .setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//            );
//            return;
//        }
//
//        if (rayquazaMegaLogic(pokemonEntity, player, pokemon, hasMegaEvolved)) return;
//
//        if (species == null) {
//            player.sendSystemMessage(
//                    Component.translatable("message.mega_showdown.incorrect_mega_stone")
//                            .setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//            );
//            return;
//        }
//
//        if(ShowdownConfig.friendshipMode.get() && pokemon.getFriendship() < 200 && !pokemon.getEntity().isBattling()){
//            player.sendSystemMessage(
//                    Component.translatable("message.mega_showdown.bond_not_close_mega").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//            );
//            return;
//        }
//
//        //Multiple megas
//        if(speciesMatchesStone && (!hasMegaEvolved || ShowdownConfig.multipleMegas.get())){
//            if(species.equals("Charizard")){
//                if(pokemon.heldItem().is(MegaStones.CHARIZARDITE_X)){
//                    setMegaData(player, true);
//                    setMegaPokemon(player, new PokeHandler(pokemon));
//
//                    playEvolveAnimation(pokemonEntity);
//
//                    new StringSpeciesFeature("mega_evolution", "mega_x").apply(pokemon);
//                    setTradable(pokemon, false);
//
//                }else if(pokemon.heldItem().is(MegaStones.CHARIZARDITE_Y)){
//                    setMegaData(player, true);
//                    setMegaPokemon(player, new PokeHandler(pokemon));
//
//                    playEvolveAnimation(pokemonEntity);
//
//                    new StringSpeciesFeature("mega_evolution", "mega_y").apply(pokemon);
//                    setTradable(pokemon, false);
//
//                }
//            }
//            else if(species.equals("Mewtwo")){
//                if(pokemon.heldItem().is(MegaStones.MEWTWONITE_X)){
//                    setMegaData(player, true);
//                    setMegaPokemon(player, new PokeHandler(pokemon));
//
//                    playEvolveAnimation(pokemonEntity);
//
//                    new StringSpeciesFeature("mega_evolution", "mega_x").apply(pokemon);
//
//                    setTradable(pokemon, false);
//
//                }else if(pokemon.heldItem().is(MegaStones.MEWTWONITE_Y)){
//                    setMegaData(player, true);
//                    setMegaPokemon(player, new PokeHandler(pokemon));
//
//                    playEvolveAnimation(pokemonEntity);
//
//                    new StringSpeciesFeature("mega_evolution", "mega_y").apply(pokemon);
//
//                    setTradable(pokemon, false);
//
//                }
//            }
//            else{
//                setMegaData(player, true);
//                setMegaPokemon(player, new PokeHandler(pokemon));
//
//                playEvolveAnimation(pokemonEntity);
//
//                new StringSpeciesFeature("mega_evolution", megaAspect).apply(pokemon);
//
//                setTradable(pokemon, false);
//
//            }
//        } else if(speciesMatchesStone && hasMegaEvolved){
//            player.sendSystemMessage(
//                    Component.translatable("message.mega_showdown.mega_limit").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//            );
//        }else{
//            player.sendSystemMessage(
//                    Component.translatable("message.mega_showdown.incorrect_mega_stone").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//            );
//        }
//    }
//
//    private static boolean rayquazaMegaLogic(PokemonEntity pokemonEntity, Player player, Pokemon pokemon, Boolean playerData) {
//        if(pokemon.getSpecies().getName().equals("Rayquaza") && (!playerData || ShowdownConfig.multipleMegas.get())){
//            if(ShowdownConfig.friendshipMode.get() && pokemon.getFriendship() < 200 && !pokemon.getEntity().isBattling()){
//                player.sendSystemMessage(
//                        Component.translatable("message.mega_showdown.bond_not_close_mega").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//                );
//                return true;
//            }
//
//            boolean found = false;
//            for (int i = 0; i < 4; i++){
//                if(pokemon.getMoveSet().getMoves().get(i).getName().equals("dragonascent")){
//                    setMegaPokemon(player, new PokeHandler(pokemon));
//                    setMegaData(player, true);
//
//                    new StringSpeciesFeature("mega_evolution", "mega").apply(pokemon);
//                    setTradable(pokemon, false);
//
//                    playEvolveAnimation(pokemonEntity);
//
//                    found = true;
//                }
//            }
//            if(!found){
//                player.sendSystemMessage(
//                        Component.translatable("message.mega_showdown.rayquaza_no_dragonascent").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//                );
//            }
//            return true;
//        } else if (pokemon.getSpecies().getName().equals("Rayquaza") && playerData) {
//            player.sendSystemMessage(
//                    Component.translatable("message.mega_showdown.mega_limit").setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)))
//            );
//            return true;
//        }
//        return false;
//    }

    public static void gravelmonEvoLogic(ServerPlayer player, CallbackInfo ci, PokemonEntity pokemonEntity) {
        if(
                pokemonEntity.getAspects().stream().anyMatch(aspect->aspect.equalsIgnoreCase("mega")
                        ||aspect.toLowerCase().contains("mega_")
                        ||aspect.toLowerCase().contains("_mega")))
        {
            MegaLogic.Devolve(pokemonEntity.getPokemon(), false);
        } else {
            MegaLogic.Evolve(pokemonEntity, player, false);
        }
        ci.cancel();
    }

    public static void doGravelmonMegaLogic(PokemonEntity pokemonEntity, Player player, Boolean fromBattle, CallbackInfo ci) {
        Pokemon pokemon = pokemonEntity.getPokemon();
        if(GravelmonMegas.MEGA_STONE_IDS.containsKey(pokemon.heldItem().getItem())){
            if(pokemonEntity instanceof PokemonEntity pk){
                if(pk.getPokemon().getOwnerPlayer() != player) return;
                if(pk.isBattling() && !fromBattle) {
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
            if(species.contains(" ")){
                aspect = species.split(" ")[1];
                species = species.split(" ")[0];
            } else {
                aspect = null;
            }
            boolean speciesMatchesStone = species.equalsIgnoreCase(pokemon.getSpecies().getName()) &&
                    (aspect == null || pokemonEntity.getAspects().stream().anyMatch(entityAspect -> entityAspect.equalsIgnoreCase(aspect)));
            if(speciesMatchesStone) {
                megaAspect = megaSet.component2();
                Boolean hasMegaEvolved = MegaEvolveLogic.getMegaData(player);
                if(hasMegaEvolved == null){
                    hasMegaEvolved = false;
                }
                if(speciesMatchesStone && (!hasMegaEvolved || ShowdownConfig.multipleMegas.get())){
                    MegaEvolveLogic.setMegaData(player, true);
                    MegaEvolveLogic.setMegaPokemon(player, new PokeHandler(pokemon));

                    playEvolveAnimation(pokemonEntity);

                    new StringSpeciesFeature("mega_evolution", megaAspect).apply(pokemon);
                    var scale = pokemonEntity.getForm().getBaseScale();
                    var exposedAspects = pokemonEntity.getExposedAspects();
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
    public static void setMegaPokemon(Player player, PokeHandler handler){
        throw new AssertionError("not implemented");
    }
}
