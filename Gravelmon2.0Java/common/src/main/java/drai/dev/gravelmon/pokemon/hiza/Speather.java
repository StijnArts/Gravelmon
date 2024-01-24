package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Speather extends drai.dev.gravelmon.pokemon.Pokemon {
    public Speather() {
        super("Speather",
                Type.FLYING,Type.WATER,
                new Stats(80,
                        90,
                        70,
                        100,
                        70,
                        90),
                List.of(Ability.WATER_VEIL), Ability.GALE_WINGS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Being able to pierce the water, they can drop down from high altitudes and dive up to 15 meters deep to catch their prey."),
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
           setLangFileName("Speather");

    }


}
