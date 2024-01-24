package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Burstich extends drai.dev.gravelmon.pokemon.Pokemon {
    public Burstich() {
        super("Burstich",
                Type.FIRE,
                new Stats(50,
                        55,
                        50,
                        55,
                        50,
                        60),
                List.of(Ability.BLAZE), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("A small bird Pokemon that can spark flames by hiting its flint-like beak on the floor. Their wings are too small to allow it to take flight."),
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
           setLangFileName("Burstich");

    }


}
