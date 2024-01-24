package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Folicero extends drai.dev.gravelmon.pokemon.Pokemon {
    public Folicero() {
        super("Folicero",
                Type.GRASS,
                new Stats(68,
                        53,
                        60,
                        40,
                        60,
                        39),
                List.of(Ability.OVERGROW), Ability.GRASS_PELT,
                8, 165,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The playful Folicero is more than often unnaware of its size and ends up scaring smaller creatures. When the wind blows through its wooden horn it produces a calming sound."),
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
           setLangFileName("Folicero");

    }


}
