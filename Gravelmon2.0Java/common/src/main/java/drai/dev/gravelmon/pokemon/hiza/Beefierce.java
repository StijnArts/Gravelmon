package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beefierce extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beefierce() {
        super("Beefierce",
                Type.FIGHTING,Type.GROUND,
                new Stats(104,
                        120,
                        88,
                        25,
                        78,
                        50),
                List.of(Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.75,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Beefierce are large and strong but are easily startled by loud noises. A stampede of Beefierce will completely destroy anything in its way."),
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
           setLangFileName("Beefierce");

    }


}
