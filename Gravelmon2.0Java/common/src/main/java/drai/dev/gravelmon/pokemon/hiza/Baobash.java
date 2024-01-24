package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Baobash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Baobash() {
        super("Baobash",
                Type.GRASS,Type.FIGHTING,
                new Stats(95,
                        100,
                        85,
                        84,
                        75,
                        51),
                List.of(Ability.IRON_FIST), Ability.NO_GUARD,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                161, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its huge fists are almost indestructible, it is capable of punching through a steel beam without feeling a thing."),
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
           setLangFileName("Baobash");

    }


}
