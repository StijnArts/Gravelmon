package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Florgae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Florgae() {
        super("Florgae",
                Type.FAIRY, Type.WATER,
                new Stats(80,
                        68,
                        76,
                        129,
                        125,
                        74),
                List.of(Ability.WATER_VEIL), Ability.HYDRATION,
                10, 118,
                new Stats(0,0,0,2,1,0), 45,
                0.0,
                248, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("- Petal Dance Grass - Wish Normal - Aromatherapy Grass - Magical Leaf Grass - Lucky Chant Normal - Grass Knot Grass - Disarming VoiceSTAB Fairy - Flower Shield Fairy - Grassy Terrain Grass - Misty Terrain Fairy - MoonblastSTAB Fairy - Petal Blizzard Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,1),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,1),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,1),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.COPYCAT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,"tm")                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Florgae");

    }


}
