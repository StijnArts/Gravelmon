package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bazelgeuse extends drai.dev.data.pokemon.Pokemon {
    public Bazelgeuse() {
        super("Bazelgeuse",
                Type.FIRE, Type.FLYING,
                new Stats(120,
                        135,
                        90,
                        70,
                        80,
                        95),
                List.of(Ability.MOXIE), Ability.MOXIE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is extremely territorial and known to follow the sound of roars to pick up fights. The scales on its head and tail constantly drop as it moves and burst into violent explosions."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bazelgeuse");

    }


}
