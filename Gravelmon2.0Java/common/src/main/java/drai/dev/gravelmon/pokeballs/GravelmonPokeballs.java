package drai.dev.gravelmon.pokeballs;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.api.pokeball.*;
import com.cobblemon.mod.common.api.pokeball.catching.*;
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.*;
import com.cobblemon.mod.common.api.pokemon.egg.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.mod.common.pokemon.status.statuses.persistent.*;
import drai.dev.gravelmon.mixin.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;
import org.jetbrains.annotations.*;

import java.util.*;

import static drai.dev.gravelmon.registries.GravelmonItems.*;
import static drai.dev.gravelmon.registries.GravelmonItems.ARO_BALL;

public class GravelmonPokeballs {

    public static GravelmonPokeBall CORAL_BALL;
    public static GravelmonPokeBall MAUVE_BALL;
    public static GravelmonPokeBall LUSTER_BALL;
    public static GravelmonPokeBall SUN_BALL;
    public static GravelmonPokeBall DAWN_BALL;
    public static GravelmonPokeBall FEATHER_BALL;
    public static GravelmonPokeBall NUCLEAR_BALL;
    public static GravelmonPokeBall ATOM_BALL;
    public static GravelmonPokeBall DELTA_BALL;
    public static GravelmonPokeBall ANCIENT_BALL;
    public static GravelmonPokeBall SHINY_BALL;
    public static GravelmonPokeBall NUZLOCKE_BALL;
    public static GravelmonPokeBall SNORE_BALL;
    public static GravelmonPokeBall ARK_BALL;
    public static GravelmonPokeBall LIME_BALL;
    public static GravelmonPokeBall XENO_BALL;

    //Ancient Pokeballs
    public static GravelmonPokeBall ANCIENT_CORAL_BALL;
    public static GravelmonPokeBall ANCIENT_MAUVE_BALL;

    //Official Game Poke balls
    public static GravelmonPokeBall TYPING_BALL;
    public static GravelmonPokeBall GS_BALL;
    public static GravelmonPokeBall GEN2_LURE_BALL;

    //Anime Poke balls
    public static GravelmonPokeBall ROCKET_BALL;
    public static GravelmonPokeBall ULTRA_ROCKET_BALL;
    public static GravelmonPokeBall LAKE_BALL;
    public static GravelmonPokeBall ANIME_SAFARI_BALL;
    public static GravelmonPokeBall ANNIE_BALL;
    public static GravelmonPokeBall OAKLEY_BALL;
    public static GravelmonPokeBall FISHING_BALL;
    public static GravelmonPokeBall ANIME_GS_BALL;

    //Manga Poke balls
    public static GravelmonPokeBall MANGA_SAFARI_BALL;

    //TCG Poke balls
    public static GravelmonPokeBall GREAT_ROCKET_BALL;

    //LGBTQ balls
    public static GravelmonPokeBall GAY_BALL;
    public static GravelmonPokeBall LESBIAN_BALL;
    public static GravelmonPokeBall BI_BALL;
    public static GravelmonPokeBall PAN_BALL;
    public static GravelmonPokeBall TRANS_BALL;
    public static GravelmonPokeBall NON_BINARY_BALL;
    public static GravelmonPokeBall ACE_BALL;
    public static GravelmonPokeBall ARO_BALL;

    static  {
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

        GravelmonItems.MAUVE_BALL = pokeballItem("mauve_ball", GravelmonPokeballs.MAUVE_BALL);
        GravelmonPokeballs.MAUVE_BALL.setPokeBallItem(GravelmonItems.MAUVE_BALL);
        GravelmonItems.CORAL_BALL = pokeballItem("coral_ball",GravelmonPokeballs.CORAL_BALL);
        GravelmonPokeballs.CORAL_BALL.setPokeBallItem(GravelmonItems.CORAL_BALL);
        GravelmonItems.LUSTER_BALL = pokeballItem("luster_ball",GravelmonPokeballs.LUSTER_BALL);
        GravelmonPokeballs.LUSTER_BALL.setPokeBallItem(GravelmonItems.LUSTER_BALL);
        GravelmonItems.SUN_BALL = pokeballItem("sun_ball",GravelmonPokeballs.SUN_BALL);
        GravelmonPokeballs.SUN_BALL.setPokeBallItem(GravelmonItems.SUN_BALL);
        GravelmonItems.DAWN_BALL = pokeballItem("dawn_ball",GravelmonPokeballs.DAWN_BALL);
        GravelmonPokeballs.DAWN_BALL.setPokeBallItem(GravelmonItems.DAWN_BALL);
        GravelmonItems.FEATHER_BALL = pokeballItem("feather_ball",GravelmonPokeballs.FEATHER_BALL);
        GravelmonPokeballs.FEATHER_BALL.setPokeBallItem(GravelmonItems.FEATHER_BALL);
        GravelmonItems.NUCLEAR_BALL = pokeballItem("nuclear_ball",GravelmonPokeballs.NUCLEAR_BALL);
        GravelmonPokeballs.NUCLEAR_BALL.setPokeBallItem(GravelmonItems.NUCLEAR_BALL);
        GravelmonItems.ATOM_BALL = pokeballItem("atom_ball",GravelmonPokeballs.ATOM_BALL);
        GravelmonPokeballs.ATOM_BALL.setPokeBallItem(GravelmonItems.ATOM_BALL);
        GravelmonItems.DELTA_BALL = pokeballItem("delta_ball",GravelmonPokeballs.DELTA_BALL);
        GravelmonPokeballs.DELTA_BALL.setPokeBallItem(GravelmonItems.DELTA_BALL);
        GravelmonItems.XENO_BALL = pokeballItem("xeno_ball",GravelmonPokeballs.XENO_BALL);
        GravelmonPokeballs.XENO_BALL.setPokeBallItem(GravelmonItems.XENO_BALL);
        GravelmonItems.ANCIENT_BALL = pokeballItem("ancient_ball",GravelmonPokeballs.ANCIENT_BALL);
        GravelmonPokeballs.ANCIENT_BALL.setPokeBallItem(GravelmonItems.ANCIENT_BALL);
        GravelmonItems.SHINY_BALL = pokeballItem("shiny_ball",GravelmonPokeballs.SHINY_BALL);
        GravelmonPokeballs.SHINY_BALL.setPokeBallItem(GravelmonItems.SHINY_BALL);
        GravelmonItems.NUZLOCKE_BALL = pokeballItem("nuzlocke_ball",GravelmonPokeballs.NUZLOCKE_BALL);
        GravelmonPokeballs.NUZLOCKE_BALL.setPokeBallItem(GravelmonItems.NUZLOCKE_BALL);
        GravelmonItems.SNORE_BALL = pokeballItem("snore_ball",GravelmonPokeballs.SNORE_BALL);
        GravelmonPokeballs.SNORE_BALL.setPokeBallItem(GravelmonItems.SNORE_BALL);
        GravelmonItems.ARK_BALL = pokeballItem("ark_ball",GravelmonPokeballs.ARK_BALL);
        GravelmonPokeballs.ARK_BALL.setPokeBallItem(GravelmonItems.ARK_BALL);
        GravelmonItems.LIME_BALL = pokeballItem("lime_ball",GravelmonPokeballs.LIME_BALL);
        GravelmonPokeballs.LIME_BALL.setPokeBallItem(GravelmonItems.LIME_BALL);
        //Ancient Pokeballs
        GravelmonItems.ANCIENT_MAUVE_BALL = pokeballItem("ancient_mauve_ball", GravelmonPokeballs.ANCIENT_MAUVE_BALL);
        GravelmonPokeballs.ANCIENT_MAUVE_BALL.setPokeBallItem(GravelmonItems.ANCIENT_MAUVE_BALL);
        GravelmonItems.ANCIENT_CORAL_BALL = pokeballItem("ancient_coral_ball",GravelmonPokeballs.ANCIENT_CORAL_BALL);
        GravelmonPokeballs.ANCIENT_CORAL_BALL.setPokeBallItem(GravelmonItems.ANCIENT_CORAL_BALL);
        //Team Rocket Poke balls
        GravelmonItems.ROCKET_BALL = pokeballItem("rocket_ball",GravelmonPokeballs.ROCKET_BALL);
        GravelmonPokeballs.ROCKET_BALL.setPokeBallItem(GravelmonItems.ROCKET_BALL);
        GravelmonItems.GREAT_ROCKET_BALL = pokeballItem("great_rocket_ball",GravelmonPokeballs.GREAT_ROCKET_BALL);
        GravelmonPokeballs.GREAT_ROCKET_BALL.setPokeBallItem(GravelmonItems.GREAT_ROCKET_BALL);
        GravelmonItems.ULTRA_ROCKET_BALL = pokeballItem("ultra_rocket_ball",GravelmonPokeballs.ULTRA_ROCKET_BALL);
        GravelmonPokeballs.ULTRA_ROCKET_BALL.setPokeBallItem(GravelmonItems.ULTRA_ROCKET_BALL);
        //Official Game Poke balls
        GravelmonItems.TYPING_BALL = pokeballItem("typing_ball",GravelmonPokeballs.TYPING_BALL);
        GravelmonPokeballs.TYPING_BALL.setPokeBallItem(GravelmonItems.TYPING_BALL);
        GravelmonItems.GS_BALL = pokeballItem("gs_ball",GravelmonPokeballs.GS_BALL);
        GravelmonPokeballs.GS_BALL.setPokeBallItem(GravelmonItems.GS_BALL);
        GravelmonItems.GEN2_LURE_BALL = pokeballItem("gen2_lure_ball",GravelmonPokeballs.GEN2_LURE_BALL);
        GravelmonPokeballs.GEN2_LURE_BALL.setPokeBallItem(GravelmonItems.GEN2_LURE_BALL);
        //Anime Poke balls
        GravelmonItems.LAKE_BALL = pokeballItem("lake_ball",GravelmonPokeballs.LAKE_BALL);
        GravelmonPokeballs.LAKE_BALL.setPokeBallItem(GravelmonItems.LAKE_BALL);
        GravelmonItems.ANIME_SAFARI_BALL = pokeballItem("anime_safari_ball",GravelmonPokeballs.ANIME_SAFARI_BALL);
        GravelmonPokeballs.ANIME_SAFARI_BALL.setPokeBallItem(GravelmonItems.ANIME_SAFARI_BALL);
        GravelmonItems.ANNIE_BALL = pokeballItem("annie_ball",GravelmonPokeballs.ANNIE_BALL);
        GravelmonPokeballs.ANNIE_BALL.setPokeBallItem(GravelmonItems.ANNIE_BALL);
        GravelmonItems.OAKLEY_BALL = pokeballItem("oakley_ball",GravelmonPokeballs.OAKLEY_BALL);
        GravelmonPokeballs.OAKLEY_BALL.setPokeBallItem(GravelmonItems.OAKLEY_BALL);
        GravelmonItems.FISHING_BALL = pokeballItem("fishing_ball",GravelmonPokeballs.FISHING_BALL);
        GravelmonPokeballs.FISHING_BALL.setPokeBallItem(GravelmonItems.FISHING_BALL);
        GravelmonItems.ANIME_GS_BALL = pokeballItem("anime_gs_ball",GravelmonPokeballs.ANIME_GS_BALL);
        GravelmonPokeballs.ANIME_GS_BALL.setPokeBallItem(GravelmonItems.ANIME_GS_BALL);
        //Manga Poke balls
        GravelmonItems.MANGA_SAFARI_BALL = pokeballItem("manga_safari_ball",GravelmonPokeballs.MANGA_SAFARI_BALL);
        GravelmonPokeballs.MANGA_SAFARI_BALL.setPokeBallItem(GravelmonItems.MANGA_SAFARI_BALL);
        //LGBTQ+ balls
        GravelmonItems.GAY_BALL = pokeballItem("gay_ball",GravelmonPokeballs.GAY_BALL);
        GravelmonPokeballs.GAY_BALL.setPokeBallItem(GravelmonItems.GAY_BALL);
        GravelmonItems.LESBIAN_BALL = pokeballItem("lesbian_ball",GravelmonPokeballs.LESBIAN_BALL);
        GravelmonPokeballs.LESBIAN_BALL.setPokeBallItem(GravelmonItems.LESBIAN_BALL);
        GravelmonItems.BI_BALL = pokeballItem("bi_ball",GravelmonPokeballs.BI_BALL);
        GravelmonPokeballs.BI_BALL.setPokeBallItem(GravelmonItems.BI_BALL);
        GravelmonItems.PAN_BALL = pokeballItem("pan_ball",GravelmonPokeballs.PAN_BALL);
        GravelmonPokeballs.PAN_BALL.setPokeBallItem(GravelmonItems.PAN_BALL);
        GravelmonItems.TRANS_BALL = pokeballItem("trans_ball",GravelmonPokeballs.TRANS_BALL);
        GravelmonPokeballs.TRANS_BALL.setPokeBallItem(GravelmonItems.TRANS_BALL);
        GravelmonItems.NON_BINARY_BALL = pokeballItem("non_binary_ball",GravelmonPokeballs.NON_BINARY_BALL);
        GravelmonPokeballs.NON_BINARY_BALL.setPokeBallItem(GravelmonItems.NON_BINARY_BALL);
        GravelmonItems.ACE_BALL = pokeballItem("ace_ball",GravelmonPokeballs.ACE_BALL);
        GravelmonPokeballs.ACE_BALL.setPokeBallItem(GravelmonItems.ACE_BALL);
        GravelmonItems.ARO_BALL = pokeballItem("aro_ball",GravelmonPokeballs.ARO_BALL);
        GravelmonPokeballs.ARO_BALL.setPokeBallItem(GravelmonItems.ARO_BALL);
    }

    private static GravelmonPokeBall createFromDefaults(String name){
        return createDefault(name,
                new MultiplierModifier(1F , (condition1, condition2) -> true),
                List.of(),0.8F, ResourceLocation.fromNamespaceAndPath("gravelmon",name),
                ResourceLocation.fromNamespaceAndPath("gravelmon",name+"_model"));
    }

    private static GravelmonPokeBall createFromDefaults(String name, List<CaptureEffect> effects){
        return createDefault(name,
                new MultiplierModifier(1F , (condition1, condition2) -> true),
                effects,0.8F,ResourceLocation.fromNamespaceAndPath("gravelmon",name),
                ResourceLocation.fromNamespaceAndPath("gravelmon",name+"_model"));
    }

    private static GravelmonPokeBall createFromDefaults(String name, float multiplier){
        return createDefault(name,
                new MultiplierModifier(multiplier , (condition1, condition2) -> true),
                List.of(),0.8F,ResourceLocation.fromNamespaceAndPath("gravelmon",name),
                ResourceLocation.fromNamespaceAndPath("gravelmon",name+"_model"));
    }

    private static GravelmonPokeBall createFromDefaults(String name, CatchRateModifier multiplierModifier){
        return createDefault(name,
                multiplierModifier,
                List.of(),0.8F,ResourceLocation.fromNamespaceAndPath("gravelmon",name),
                ResourceLocation.fromNamespaceAndPath("gravelmon",name+"_model"));
    }

    public static GravelmonPokeBall createDefault(String name, CatchRateModifier multiplierModifier,
                                           List<CaptureEffect> effects, float waterDragValue, ResourceLocation model2d, ResourceLocation model3d){
        var identifier = ResourceLocation.fromNamespaceAndPath("cobblemon", name);
        var pokeball = new GravelmonPokeBall(identifier, multiplierModifier,
                effects, waterDragValue, model2d, model3d, 1, false);
        ((PokeBallsAccessor)(Object)PokeBalls.INSTANCE).getDefaults().put(identifier, pokeball);
        return pokeball;
    }

    public static void touch() {

    }
}
