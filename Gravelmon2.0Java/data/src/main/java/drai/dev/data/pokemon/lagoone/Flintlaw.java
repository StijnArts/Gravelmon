package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flintlaw extends drai.dev.data.pokemon.Pokemon {
    public Flintlaw() {
        super("Flintlaw",
                Type.FIRE, Type.WATER,
                new Stats(40,
                        70,
                        60,
                        95,
                        55,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 357,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("burnslinger", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.SINGE,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,13),
                        new MoveLearnSetEntry(Move.STOMP,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.FLAME_BURST,22),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,24),
                        new MoveLearnSetEntry(Move.SOFTBOILED,28),
                        new MoveLearnSetEntry(Move.SCALD,33),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,37),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,41),
                        new MoveLearnSetEntry(Move.EARTH_POWER,46),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,52),
                        new MoveLearnSetEntry(Move.BURN_UP,59)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 31, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Flintlaw");

    }


}
