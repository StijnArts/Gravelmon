package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tekagon extends drai.dev.data.pokemon.Pokemon {
    public Tekagon() {
        super("Tekagon",
                Type.ROCK, Type.DRAGON,
                new Stats(110,
                        98,
                        132,
                        68,
                        82,
                        55),
                List.of(Ability.SOLID_ROCK), Ability.ROCK_HEAD,
                29, 3104,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tekagon roam their territory in search of plants to eat. They are blind, but can feel vibrations through the ground from great distances. Tekagon recognize the vibrations their family gives off."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 43, 54, .2, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tekagon");

    }


}
