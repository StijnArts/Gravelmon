package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tabooves extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tabooves() {
        super("Tabooves",
                Type.PSYCHIC,
                new Stats(82,
                        64,
                        72,
                        93,
                        121,
                        63),
                List.of(Ability.LEVITATE), Ability.MAGICIAN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                223, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
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
           setLangFileName("Tabooves");

    }


}
