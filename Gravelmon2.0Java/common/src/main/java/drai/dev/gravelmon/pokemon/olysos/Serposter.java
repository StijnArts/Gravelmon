package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Serposter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Serposter() {
        super("Serposter",
                Type.GRASS,Type.DRAGON,
                new Stats(110,
                        155,
                        100,
                        70,
                        50,
                        70),
                List.of(Ability.STRONG_JAW,Ability.HUSTLE), Ability.RECKLESS,
                62, 2438,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                1250, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.DRAGON),
                List.of("It's head looks confusingly similar to a berry plant. Serposter uses this as a advantage to ambush prey or foes. Once caught, it is almost impossible to escape."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Serposter");

    }


}
