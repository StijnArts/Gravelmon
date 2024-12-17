package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Angeroid extends drai.dev.data.pokemon.Pokemon {
    public Angeroid(Stats stats) {
        super("Angeroid",
                Type.FIGHTING, Type.POISON,
                stats,
                List.of(Ability.ANGER_POINT), Ability.ANGER_POINT,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Added Oct 27 2021 Created by JaneJewel for the April 2020 Around The World Fakeathon Day 27 prompt, Olympics"),
                List.of(),
                List.of(
                                                ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 42, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Angeroid");

    }


}
