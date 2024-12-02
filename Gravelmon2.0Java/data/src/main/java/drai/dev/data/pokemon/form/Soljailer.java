package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Soljailer extends drai.dev.data.pokemon.Pokemon {
    public Soljailer() {
        super("Soljailer",
                Type.ROCK,Type.GHOST,
                new Stats(116,
                        41,
                        138,
                        116,
                        98,
                        23),
                List.of(Ability.ROUGHDIAMOND,Ability.ENERGYJAIL), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))),
                List.of(SpawnPreset.GEMSTONES, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Soljailer");

    }


}
