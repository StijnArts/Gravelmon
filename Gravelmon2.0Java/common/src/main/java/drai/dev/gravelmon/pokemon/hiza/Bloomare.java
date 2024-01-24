package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bloomare extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bloomare() {
        super("Bloomare",
                Type.GRASS,Type.DARK,
                new Stats(70,
                        75,
                        60,
                        100,
                        115,
                        95),
                List.of(Ability.MAGIC_BOUNCE), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,0,0,3,0), 45,
                0.0,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("It is easily startled so it isolates itself very deep into the woods. Bloomare's piercing scream is able shatter all windows of a house."),
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
           setLangFileName("Bloomare");

    }


}
