package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Blasfur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blasfur() {
        super("Blasfur",
                Type.FIRE,
                new Stats(80,
                        70,
                        90,
                        110,
                        65,
                        65),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                12, 600,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Loyal and smart, these Pokémon can smell the faintest smell of burning from miles away, making them useful for firefighters. They can detect when a person is ill by their temperature, and will try their best to help them."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Blasfur");

    }


}
