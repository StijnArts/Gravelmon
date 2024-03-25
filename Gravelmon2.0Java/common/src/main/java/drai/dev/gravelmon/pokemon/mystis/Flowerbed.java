package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Flowerbed extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flowerbed() {
        super("Flowerbed",
                Type.FAIRY,Type.GRASS,
                new Stats(90,
                        70,
                        100,
                        70,
                        130,
                        70),
                List.of(Ability.COTTON_DOWN), Ability.DREAMER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("(Name) is an incredibly great mon to sleep on. Not only does it carry its young on its back, it has a sweet aroma that leaves anyone who rests on it calmed."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flowerbed");

    }


}
