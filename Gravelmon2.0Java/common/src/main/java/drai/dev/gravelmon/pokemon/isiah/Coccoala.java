package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Coccoala extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coccoala() {
        super("Coccoala",
                Type.NORMAL,
                new Stats(70,
                        50,
                        60,
                        50,
                        60,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                8, 165,
                new Stats(2,0,0,0,0,0), 165,
                0.5,
                116, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When a Coccoala becomes deeply fond of his trainer, it hugs them so tightly that they become out of breath."),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coccoala");

    }


}
