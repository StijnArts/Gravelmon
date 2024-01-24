package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Faeleaf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Faeleaf() {
        super("Faeleaf",
                Type.GRASS,Type.FAIRY,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.LEVITATE,Ability.PIXILATE,Ability.SERENE_GRACE), Ability.SERENE_GRACE,
                8, 165,
                new Stats(3,0,0,0,0,0), 45,
                0.0,
                270, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Faeleaf can fly by rotating their ears. Upon reaching a great height, Faeleaf then drift slowly downwards in a motion akin to dancing. Seeing one means that Autumn's arrival is imminent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Faeleaf");

    }


}
