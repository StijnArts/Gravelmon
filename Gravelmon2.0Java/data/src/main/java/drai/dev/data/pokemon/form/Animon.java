package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Animon extends drai.dev.data.pokemon.Pokemon {
    public Animon() {
        super("Animon",
                Type.STEEL,Type.NUCLEAR,
                new Stats(65,
                        65,
                        65,
                        65,
                        65,
                        82),
                List.of(Ability.ACTIVE), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 57, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Animon");

    }


}
