package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Piluma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Piluma() {
        super("Piluma",
                Type.ROCK, Type.PSYCHIC,
                new Stats(40,
                        20,
                        75,
                        55,
                        75,
                        20),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                57, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("killarumi", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,13),
                        new MoveLearnSetEntry(Move.MOONLIGHT,16),
                        new MoveLearnSetEntry(Move.SWIFT,19),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,23),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,26),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,29),
                        new MoveLearnSetEntry(Move.CROPCIRCLE,32),
                        new MoveLearnSetEntry(Move.PSYCHIC,35),
                        new MoveLearnSetEntry(Move.EARTH_POWER,38),
                        new MoveLearnSetEntry(Move.POWER_GEM,41),
                        new MoveLearnSetEntry(Move.STARSTREAM,45),
                        new MoveLearnSetEntry(Move.STONE_EDGE,49),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 31, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Piluma");

    }


}
