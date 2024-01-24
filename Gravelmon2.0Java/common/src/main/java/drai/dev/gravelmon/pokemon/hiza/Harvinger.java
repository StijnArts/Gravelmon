package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Harvinger extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harvinger() {
        super("Harvinger",
                Type.GHOST,
                new Stats(140,
                        135,
                        95,
                        115,
                        115,
                        70),
                List.of(Ability.SOULABSORB), Ability.SOULABSORB,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                302, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A gloomy fog accompanies Harvinger wherever it wanders. It preys on other ghost type Pokemon and is said to be sighted during near-death experiences."),
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
           setLangFileName("Harvinger");

    }


}
