package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Monartide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Monartide() {
        super("Monartide",
                Type.WATER,
                new Stats(95,
                        100,
                        95,
                        75,
                        80,
                        95),
                List.of(Ability.MULTISCALE), Ability.SUPER_LUCK,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
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
           setLangFileName("Monartide");

    }


}
