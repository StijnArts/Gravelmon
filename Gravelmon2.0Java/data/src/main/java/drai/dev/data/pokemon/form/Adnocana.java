package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Adnocana extends drai.dev.data.pokemon.Pokemon {
    public Adnocana() {
        super("Adnocana",
                Type.WATER,Type.DRAGON,
                new Stats(64,
                        97,
                        67,
                        34,
                        67,
                        115),
                List.of(Ability.SWIFT_SWIM), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 24, 46, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MANGROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Adnocana");

    }


}
