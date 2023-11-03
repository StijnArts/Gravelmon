package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.api.pokeball.*;
import com.cobblemon.mod.common.api.pokeball.catching.*;
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.*;
import com.cobblemon.mod.common.pokeball.*;
import com.cobblemon.mod.common.pokemon.*;
import drai.dev.gravelmon.pokeballs.*;
import kotlin.*;
import net.minecraft.resources.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import java.util.*;
import static drai.dev.gravelmon.pokeballs.GravelmonPokeballs.*;

@Mixin(PokeBalls.class)
public abstract class PokeBallsMixin {
    @Shadow
    static
    HashMap<ResourceLocation, PokeBall> defaults;

    @Shadow protected abstract PokeBall createDefault(String name, CatchRateModifier modifier, List<? extends CaptureEffect> effects, float waterDragValue, ResourceLocation model2d, ResourceLocation model3d);

    private static boolean init = false;
    @Inject(method = "byName", at =@At("HEAD"), remap = false, cancellable = true)
    private void injectPokeballs(String name, CallbackInfoReturnable<PokeBall> cir){
        if(!init){
            createPokeballsByDefault();
            init=true;
        }
    }

    private void createPokeballsByDefault() {
        BattleModifier gLModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean pokemonIsSameSpeciesAndSameGender = false;
            for (var battlePokemon: playerPokemon) {
                if(battlePokemon.getBattlePokemon().getOriginalPokemon().getGender() == pokemon.getGender() &&
                    battlePokemon.getBattlePokemon().getOriginalPokemon().getSpecies().equals(pokemon.getSpecies())){
                    pokemonIsSameSpeciesAndSameGender = true;
                    break;
                }
            }
            if(pokemon.getGender() != Gender.GENDERLESS && pokemonIsSameSpeciesAndSameGender){
                return 5F;
            }
            return 1F;
        });
        BattleModifier bpModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            for (var battlePokemon: playerPokemon) {
                if(battlePokemon.getBattlePokemon().getOriginalPokemon().getSpecies().equals(pokemon.getSpecies())){
                    return 5F;
                }
            }
            return 1F;
        });
        BattleModifier nBModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            if(pokemon.getGender() == Gender.GENDERLESS){
                return 3F;
            }
            return 1F;
        });
        BattleModifier aAModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            if(pokemon.getAspects().contains("baby") && pokemon.getGender() == Gender.GENDERLESS){
                return 2.5F;
            }
            return 1F;
        });
        WorldStateModifier dawnModifier = new WorldStateModifier((x, entity) -> {
            if(x.level().getGameTime() > 0 && x.level().getGameTime() < 6000){
                return 3F;
            }
            return 1F;
        });
        DynamicMultiplierModifier featherModifier = new DynamicMultiplierModifier((x, pokemon) -> {
            var weight = pokemon.getForm().getWeight();
            if(weight < 10){
                return 4F;
            } else if (weight < 50){
                return 2.5F;
            } else if (weight < 100){
                return 1.5F;
            } else return 1F;
        }, (x, pokemon)-> pokemon.getForm().getWeight()<100F);
        CORAL_BALL = createFromDefaults("coral_ball");
        MAUVE_BALL = createFromDefaults("mauve_ball");
        LUSTER_BALL = createFromDefaults("luster_ball", List.of(new ShinyChangeEffect()));
        DAWN_BALL = createFromDefaults("dawn_ball", dawnModifier);
        SUN_BALL = createFromDefaults("sun_ball");
        FEATHER_BALL = createFromDefaults("feather_ball", featherModifier);
        GAY_BALL = createFromDefaults("gay_ball", gLModifier);
        LESBIAN_BALL = createFromDefaults("lesbian_ball", gLModifier);
        BI_BALL = createFromDefaults("bi_ball", bpModifier);
        PAN_BALL = createFromDefaults("pan_ball", bpModifier);
        TRANS_BALL = createFromDefaults("trans_ball", 2F);
        NON_BINARY_BALL = createFromDefaults("non_binary_ball", nBModifier);
        ACE_BALL = createFromDefaults("ace_ball", aAModifier);
        ARO_BALL = createFromDefaults("aro_ball", aAModifier);
        /*CobblemonEvents.FRIENDSHIP_UPDATED.subscribe(Priority.LOWEST, pokemonCapturedEvent -> {
            for (Eff:
                 ) {

            }
            var pokeBall = pokemonCapturedEvent.getPokemon().getCaughtBall().getEffects().contains();
            System.out.println("caught a pokemon with a "+pokeBall);
            System.out.println("the luster ball path is: "+LUSTER_BALL.getName().getPath());
            if(pokeBall.equals(LUSTER_BALL.getName().getPath())){
                System.out.println("changing pokemon to a shiny pokemon");
                var aspects = pokemonCapturedEvent.getPokemon().getAspects();
                aspects.add("shiny");
                pokemonCapturedEvent.getPokemon().setAspects(aspects);
            }
           return Unit.INSTANCE;
        });*/
    }

    private PokeBall createFromDefaults(String name){
        return createDefault(name,
                new MultiplierModifier(1F , (condition1, condition2) -> true),
                List.of(),0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private PokeBall createFromDefaults(String name, List<CaptureEffect> effects){
        return createDefault(name,
                new MultiplierModifier(1F , (condition1, condition2) -> true),
                effects,0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private PokeBall createFromDefaults(String name, float multiplier){
        return createDefault(name,
                new MultiplierModifier(multiplier , (condition1, condition2) -> true),
                List.of(),0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private PokeBall createFromDefaults(String name, CatchRateModifier multiplierModifier){
        return createDefault(name,
                multiplierModifier,
                List.of(),0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

}
