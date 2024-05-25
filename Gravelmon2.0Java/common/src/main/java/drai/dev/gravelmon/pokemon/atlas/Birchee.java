package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Birchee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Birchee() {
        super("Birchee",
                Type.GRASS,
                new Stats(52,
                        50,
                        65,
                        35,
                        40,
                        38),
                List.of(Ability.SYMBIOSIS,Ability.HARVEST,Ability.LEAF_GUARD), Ability.LEAF_GUARD,
                3, 165,
                new Stats(0,0,1,0,0,0), 235,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Often referred to as 'grove-tender's miracle', for its incredible effects on surrounding flora. Forests populated by them exhibit rapid growth that far exceeds neighboring woods."),
                List.of(new EvolutionEntry("birchop", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,5),
                        new MoveLearnSetEntry(Move.LEAFTURN,10),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,13),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,17),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,20),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,28),
                        new MoveLearnSetEntry(Move.INGRAIN,32),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,37),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,41),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,51),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,57),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 19, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Birchee");

    }


}
