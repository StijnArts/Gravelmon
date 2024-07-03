package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.api.pokeball.*;
import com.cobblemon.mod.common.api.pokeball.catching.*;
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.*;
import com.cobblemon.mod.common.api.pokemon.egg.*;
import com.cobblemon.mod.common.pokeball.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.mod.common.pokemon.status.statuses.persistent.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import kotlin.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;
import org.jetbrains.annotations.*;
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
        BattleModifier bModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            for (var battlePokemon: playerPokemon) {
                if(battlePokemon.getBattlePokemon().getOriginalPokemon().getSpecies().equals(pokemon.getSpecies())){
                    return 2.5F;
                }
            }
            return 1F;
        });
        BattleModifier pModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            for (var battlePokemon: playerPokemon) {
                if(!battlePokemon.getBattlePokemon().getOriginalPokemon().getSpecies().equals(pokemon.getSpecies())){
                    return 2F;
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
            if(pokemon.getAspects().contains("baby") && pokemon.getForm().getEggGroups().contains(EggGroup.UNDISCOVERED)){
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
        WorldStateModifier lakeModifier = new WorldStateModifier((x, entity) -> {
            if(x.isUnderWater()){
                return 3F;
            }
            return 1F;
        });
        WorldStateModifier fishingModifier = new WorldStateModifier((x, entity) -> {
            if(x.isUnderWater()){
                return 1.5F;
            }
            return 1F;
        });
        WorldStateModifier safariModifier = new WorldStateModifier((x, entity) -> {
            if(!entity.isBattling()){
                return 1.5F;
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
        DynamicMultiplierModifier typingModifier = new DynamicMultiplierModifier((x, pokemon) -> {
            var nameLength = pokemon.getForm().getName().length();
            if(nameLength > 10){
                return 4F;
            } else if (nameLength > 8){
                return 2.5F;
            } else if (nameLength > 6){
                return 1.5F;
            } else return 1F;
        }, (x, pokemon)-> pokemon.getForm().getName().length()>6F);
        BattleModifier nuclearModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isNuclearType = false;
            for (var type :
                    pokemon.getTypes()) {
                if(type.getName().equals("nuclear")){
                    isNuclearType = true;
                    break;
                }
            }
            if(isNuclearType){
                return 3F;
            }
            return 1F;
        });
        BattleModifier atomModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isNuclearType = false;
            for (var type :
                    pokemon.getTypes()) {
                if(type.getName().equals("nuclear")){
                    isNuclearType = true;
                    break;
                }
            }
            if(isNuclearType){
                return 5F;
            }
            return 1F;
        });
        BattleModifier sunModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isNuclearType = false;
            for (var type : pokemon.getTypes()) {
                if(type.getName().equals("fire") || type.getName().equals("light") || type.getName().equals("cosmic")){
                    isNuclearType = true;
                    break;
                }
            }
            if(isNuclearType){
                return 5F;
            }
            return 1F;
        });
        BattleModifier xenoverseModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isOriginalPokemon = false;
            boolean isXenoversePokemon = false;
            var originalLabels = new ArrayList<>(List.of("gen1", "gen2", "gen3", "gen4", "gen5",
                    "gen6", "gen7", "gen8", "gen9"));
            for (var label : pokemon.getForm().getLabels()) {
                if(originalLabels.contains(label)){
                    isOriginalPokemon = true;
                }
                if(label.equals(Label.XENOVERSE.getName())){
                    isXenoversePokemon = true;
                }
                if(isOriginalPokemon && isXenoversePokemon){
                    break;
                }
            }
            if(isOriginalPokemon && isXenoversePokemon){
                return 2F;
            }
            return 1F;
        });
        BattleModifier deltaModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isOriginalPokemon = false;
            boolean isInsurgencePokemon = false;
            var originalLabels = new ArrayList<>(List.of("gen1", "gen2", "gen3", "gen4", "gen5",
                    "gen6", "gen7", "gen8", "gen9"));
            for (var label : pokemon.getForm().getLabels()) {
                if(originalLabels.contains(label)){
                    isOriginalPokemon = true;
                }
                if(label.equals(Label.INSURGENCE.getName())){
                    isInsurgencePokemon = true;
                }
                if(isOriginalPokemon && isInsurgencePokemon){
                    break;
                }
            }
            if(isOriginalPokemon && isInsurgencePokemon){
                return 4F;
            }
            return 1F;
        });
        BattleModifier ancientModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isLegendaryOrMythical = false;
            var originalLabels = new ArrayList<>(List.of("legendary", "mythical"));
            for (var label : pokemon.getForm().getLabels()) {
                if(originalLabels.contains(label)){
                    isLegendaryOrMythical = true;
                    break;
                }
            }
            if(isLegendaryOrMythical){
                return 8F;
            }
            return 1F;
        });
        BattleModifier snoreModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isAsleep = false;
            if(pokemon.getStatus()==null){
                return 1f;
            }
            if(pokemon.getStatus().getStatus() instanceof SleepStatus){
                    isAsleep = true;
            }
            if(isAsleep){
                return 5F;
            }
            return 1F;
        });
        BattleModifier lureModifier = new BattleModifier((x, playerPokemon, pokemon) -> {
            boolean isWaterType = false;
            for (var type :
                    pokemon.getTypes()) {
                if(type.getName().equals("water")){
                    isWaterType = true;
                    break;
                }
            }
            if(isWaterType){
                return 2F;
            }
            return 1F;
        });
        CORAL_BALL = createFromDefaults("coral_ball");
        MAUVE_BALL = createFromDefaults("mauve_ball");
        LUSTER_BALL = createFromDefaults("luster_ball", List.of(new CaptureEffect() {
            @Override
            public void apply(@NotNull LivingEntity livingEntity, @NotNull Pokemon pokemon) {
                pokemon.setShiny(true);
            }
        }));
        DAWN_BALL = createFromDefaults("dawn_ball", dawnModifier);
        SUN_BALL = createFromDefaults("sun_ball", sunModifier);
        FEATHER_BALL = createFromDefaults("feather_ball", featherModifier);
        NUCLEAR_BALL = createFromDefaults("nuclear_ball", nuclearModifier);
        ATOM_BALL = createFromDefaults("atom_ball",atomModifier);
        DELTA_BALL = createFromDefaults("delta_ball", deltaModifier);
        ANCIENT_BALL = createFromDefaults("ancient_ball",ancientModifier);
        SHINY_BALL = createFromDefaults("shiny_ball", new ShinyBallBattleModifier());
        NUZLOCKE_BALL = createFromDefaults("nuzlocke_ball", List.of(new NuzlockeCaptureEffect()));
        SNORE_BALL = createFromDefaults("snore_ball", snoreModifier);
        ARK_BALL = createFromDefaults("ark_ball", 255f);
        LIME_BALL = createFromDefaults("lime_ball", 1.5F);
        XENO_BALL = createFromDefaults("xeno_ball", xenoverseModifier);

        //Ancient Pokeballs
        ANCIENT_CORAL_BALL = createFromDefaults("ancient_coral_ball");
        ANCIENT_MAUVE_BALL = createFromDefaults("ancient_mauve_ball");

        //Official Game Poke balls
        TYPING_BALL = createFromDefaults("typing_ball", typingModifier);
        GS_BALL = createFromDefaults("gs_ball");
        GEN2_LURE_BALL = createFromDefaults("gen2_lure_ball", lureModifier);

        //Anime Poke balls
        ROCKET_BALL = createFromDefaults("rocket_ball");
        ULTRA_ROCKET_BALL = createFromDefaults("ultra_rocket_ball",2F);
        LAKE_BALL = createFromDefaults("lake_ball", lakeModifier);
        ANIME_SAFARI_BALL = createFromDefaults("anime_safari_ball", safariModifier);
        ANNIE_BALL = createFromDefaults("annie_ball");
        OAKLEY_BALL = createFromDefaults("oakley_ball");
        FISHING_BALL = createFromDefaults("fishing_ball", fishingModifier);
        ANIME_GS_BALL = createFromDefaults("anime_gs_ball");

        //Manga Poke balls
        MANGA_SAFARI_BALL = createFromDefaults("manga_safari_ball", safariModifier);

        //TCG Poke balls
        GREAT_ROCKET_BALL = createFromDefaults("great_rocket_ball",1.5F);

        //LGBTQ+ balls
        GAY_BALL = createFromDefaults("gay_ball", gLModifier);
        LESBIAN_BALL = createFromDefaults("lesbian_ball", gLModifier);
        BI_BALL = createFromDefaults("bi_ball", bModifier);
        PAN_BALL = createFromDefaults("pan_ball", pModifier);
        TRANS_BALL = createFromDefaults("trans_ball", 2F);
        NON_BINARY_BALL = createFromDefaults("non_binary_ball", nBModifier);
        ACE_BALL = createFromDefaults("ace_ball", aAModifier);
        ARO_BALL = createFromDefaults("aro_ball", aAModifier);

        CobblemonEvents.POKEMON_FAINTED.subscribe(Priority.HIGHEST, pokemonFaintedEvent -> {
            var pokemon = pokemonFaintedEvent.getPokemon();
            boolean isNuzlockePokemon = pokemon.getCaughtBall().getEffects().stream().anyMatch(captureEffect -> captureEffect instanceof NuzlockeCaptureEffect);
            if(isNuzlockePokemon){
                if(pokemonFaintedEvent.getPokemon().isPlayerOwned()){
                    pokemon.removeHeldItem();
                    var ownerPlayer = pokemonFaintedEvent.getPokemon().getOwnerPlayer();
                    var party = Cobblemon.INSTANCE.getStorage().getParty(Objects.requireNonNull(ownerPlayer));
                    party.remove(pokemon);
                    var language = Language.getInstance();
                    var name = pokemon.getDisplayName();
                    var translatedName = language.getOrDefault(name.toString(),pokemon.getSpecies().getName());
                    ownerPlayer.sendSystemMessage(Component.translatable(translatedName +" has died and was removed from your party. Rest in Peace " + translatedName));
                }
            }
            return Unit.INSTANCE;
        });
    }

    private GravelmonPokeBall createFromDefaults(String name){
        return createDefault(name,
                new MultiplierModifier(1F , (condition1, condition2) -> true),
                List.of(),0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private GravelmonPokeBall createFromDefaults(String name, List<CaptureEffect> effects){
        return createDefault(name,
                new MultiplierModifier(1F , (condition1, condition2) -> true),
                effects,0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private GravelmonPokeBall createFromDefaults(String name, float multiplier){
        return createDefault(name,
                new MultiplierModifier(multiplier , (condition1, condition2) -> true),
                List.of(),0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private GravelmonPokeBall createFromDefaults(String name, CatchRateModifier multiplierModifier){
        return createDefault(name,
                multiplierModifier,
                List.of(),0.8F,new ResourceLocation("gravelmon",name),
                new ResourceLocation("gravelmon",name+"_model"));
    }

    private GravelmonPokeBall createDefault(String name, CatchRateModifier multiplierModifier,
                                   List<CaptureEffect> effects, float waterDragValue, ResourceLocation model2d, ResourceLocation model3d){
        var identifier = new ResourceLocation("cobblemon", name);
        var pokeball = new GravelmonPokeBall(identifier, multiplierModifier,
                effects, waterDragValue, model2d, model3d, 1, false);
        defaults.put(identifier, pokeball);
        return pokeball;
    }

}
