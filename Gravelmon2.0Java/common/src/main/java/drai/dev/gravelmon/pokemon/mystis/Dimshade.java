package drai.dev.gravelmon.pokemon.mystis;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dimshade extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dimshade() {
        super("Dimwraith",
                Type.DARK, Type.GHOST,
                new Stats(60,
                        80,
                        60,
                        40,
                        10,
                        90),
                List.of(Ability.INTIMIDATE,Ability.UNNERVE), Ability.STAKEOUT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dimwraith like to play pranks to scare people. According to researchers, there are theoretically unlimited ways to evolve Dimwraith, although only a few have been discovered."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dimwraith");

    }


}
