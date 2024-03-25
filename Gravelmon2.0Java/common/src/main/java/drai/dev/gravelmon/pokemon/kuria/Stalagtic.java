package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Stalagtic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stalagtic() {
        super("Stalagtic",
                Type.ROCK,
                new Stats(70,
                        60,
                        70,
                        20,
                        40,
                        20),
                List.of(Ability.SOLID_ROCK,Ability.WEAK_ARMOR), Ability.ROCKYTRAP,
                2, 42,
                new Stats(1,0,1,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Stalagtic are often too small to see unless they're on the move. Because of this, many step on their spiked top and get seriously injured."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stalagtic");

    }


}
