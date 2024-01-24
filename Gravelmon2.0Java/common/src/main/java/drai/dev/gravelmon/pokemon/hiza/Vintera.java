package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Vintera extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vintera() {
        super("Vintera",
                Type.ICE,
                new Stats(100,
                        120,
                        95,
                        145,
                        120,
                        90),
                List.of(Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                8, 165,
                new Stats(0,0,0,3,0,0), 3,
                0.0,
                302, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The Pokemon that caused a 100 years of winter in a distant past. The gases spewing out of its body instantly freeze anything that touches it."),
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
           setLangFileName("Vintera");

    }


}
