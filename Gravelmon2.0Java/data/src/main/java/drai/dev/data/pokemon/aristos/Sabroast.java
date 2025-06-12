package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Sabroast extends drai.dev.data.pokemon.Pokemon {
    public Sabroast() {
        super("Sabroast",
                Type.GRASS, Type.FIRE,
                new Stats(67,
                        123,
                        67,
                        143,
                        100,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                33, 165,
                new Stats(0,0,0,0,0,0), 15,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("One kind of Ultra Beast, it absorbs solar energy and stores it in its body. If provoked it can heat up its body and shoot fire from its spines, according to witnesses."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 56, 67, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sabroast");

    }


}
