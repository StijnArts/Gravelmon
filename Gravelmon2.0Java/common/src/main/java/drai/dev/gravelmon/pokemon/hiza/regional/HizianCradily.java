package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianCradily extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianCradily() {
        super("Cradily",
                Type.GRASS,Type.GHOST,
                new Stats(86,
                        81,
                        97,
                        107,
                        81,
                        43),
                List.of(Ability.PERISH_BODY), Ability.PERISH_BODY,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                173, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its tentacles rotate in a vortex motion attracting anything that sets eyes on them, it then suffocates its prey by wrapping them with its tentacles."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cradily");

    }


}
