package drai.dev.gravelmon.pokemon.goetia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Caulderon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caulderon() {
        super("Caulderon",
                Type.FIRE,Type.WATER,
                new Stats(95,
                        80,
                        130,
                        120,
                        80,
                        65),
                List.of(Ability.SOULABSORB), Ability.POWER_OF_ALCHEMY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A mythical being said to reside within a dimension at the bottom of a chasm. It captures lost souls and pulls them into its pot to be purified."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caulderon");

    }


}
