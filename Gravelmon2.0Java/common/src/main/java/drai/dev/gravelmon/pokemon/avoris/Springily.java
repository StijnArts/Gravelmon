package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Springily extends drai.dev.gravelmon.pokemon.Pokemon {
    public Springily() {
        super("Springily",
                Type.WATER, Type.GRASS,
                new Stats(60,
                        40,
                        40,
                        60,
                        70,
                        30),
                List.of(Ability.LEAF_GUARD,Ability.RAIN_DISH,Ability.HYDRATION), Ability.HYDRATION,
                6, 165,
                new Stats(0,0,0,0,1,0), 220,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Floating at the water's surface, they absorb sunlight for energy. The leaf on top senses changes in the weather. During the spring season, large groups of them can be found in ponds or lakes."),
                List.of(new EvolutionEntry("Faelily", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.LIFE_DEW,8),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.SWEET_KISS,19),
                        new MoveLearnSetEntry(Move.GROWTH,23),
                        new MoveLearnSetEntry(Move.WATER_PULSE,26),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,34),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
