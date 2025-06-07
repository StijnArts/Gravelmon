package drai.dev.data.pokemon.solarlightlunardark;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Merkid extends drai.dev.data.pokemon.Pokemon {
    public Merkid() {
        super("Merkid",
                Type.WATER,
                new Stats(45,
                        40,
                        40,
                        70,
                        65,
                        60),
                List.of(Ability.SWIFT_SWIM,Ability.RAIN_DISH), Ability.FRIEND_GUARD,
                9, 344,
                new Stats(0,0,0,1,0,0), 140,
                0.0,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.HUMAN_LIKE),
                List.of("They were once believed to be myths until their discovery in Rainbow Reef. Moving in schools, they would hypnotize people with their voices and make them leave them be."),
                List.of(new EvolutionEntry("mermarine", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"),
new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")), List.of(), "cobblemon:shiny_stone"),
new EvolutionEntry("mersidon", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")), List.of(), "cobblemon:shiny_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,15),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,36),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.FLAIL,50),
                        new MoveLearnSetEntry(Move.HAZE,22),
                        new MoveLearnSetEntry(Move.CAPTIVATE,33),
                        new MoveLearnSetEntry(Move.SING,19),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,39),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,43),
                        new MoveLearnSetEntry(Move.TICKLE,29),
                        new MoveLearnSetEntry(Move.PLAYFIGHT,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,8),
                        new MoveLearnSetEntry(Move.NUZZLE,12),
                        new MoveLearnSetEntry(Move.DIVE,26),
                        new MoveLearnSetEntry(Move.PLAY_NICE,5),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.LIFE_DEW,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.RIPPLE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm")),
                List.of(Label.SOLARLIGHTLUNARDARK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Merkid");

    }


}
