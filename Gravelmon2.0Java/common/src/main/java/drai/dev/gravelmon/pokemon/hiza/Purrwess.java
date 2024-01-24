package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Purrwess extends drai.dev.gravelmon.pokemon.Pokemon {
    public Purrwess() {
        super("Purrwess",
                Type.FAIRY,
                new Stats(90,
                        75,
                        75,
                        70,
                        70,
                        120),
                List.of(Ability.FUR_COAT), Ability.FUR_COAT,
                8, 165,
                new Stats(0,0,0,0,0,3), 30,
                0.25,
                241, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("With their regal look and attitude, most Pokémon respect Purrwess, they will never attempt to confront and keep their distance from it."),
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
           setLangFileName("Purrwess");

    }


}
