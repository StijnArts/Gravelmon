package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Terrobalt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terrobalt() {
        super("Terrobalt",
                Type.STEEL,Type.FLYING,
                new Stats(77,
                        96,
                        113,
                        40,
                        68,
                        101),
                List.of(Ability.UNNERVE), Ability.BIG_PECKS,
                8, 165,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("While being capable of short flights, it spends most of its time on the ground. Its powerful legs allow it to run several miles without taking a rest."),
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
           setLangFileName("Terrobalt");

    }


}
