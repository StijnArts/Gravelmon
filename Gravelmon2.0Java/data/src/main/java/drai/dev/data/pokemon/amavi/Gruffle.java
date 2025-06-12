package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gruffle extends drai.dev.data.pokemon.Pokemon {
    public Gruffle() {
        super("Gruffle",
                Type.GROUND, Type.GRASS,
                new Stats(89,
                        69,
                        53,
                        50,
                        70,
                        25),
                List.of(Ability.GLUTTONY,Ability.ADAPTABILITY), Ability.WATER_ABSORB,
                5, 0,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("trufftroff", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(             new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.MAGNITUDE,14),
                        new MoveLearnSetEntry(Move.BULLDOZE,21),
                        new MoveLearnSetEntry(Move.ROTOTILLER,24),
                        new MoveLearnSetEntry(Move.SEED_BOMB,30),
                        new MoveLearnSetEntry(Move.MORNING_SUN,34),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,39),
                        new MoveLearnSetEntry(Move.POWER_WHIP,44),
                        new MoveLearnSetEntry(Move.FISSURE,50)           ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST, Biome.IS_MUSHROOM))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gruffle");

    }


}
