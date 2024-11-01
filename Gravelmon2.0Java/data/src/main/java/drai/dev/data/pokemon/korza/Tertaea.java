package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tertaea extends drai.dev.data.pokemon.Pokemon {
    public Tertaea() {
        super("Tertaea",
                Type.ROCK,Type.DRAGON,
                new Stats(114,
                        164,
                        114,
                        107,
                        107,
                        74),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                72, 3266,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Said to once have devastating destructive power, Tertaea burrowed deep into the earth to save the world from herself. Because of this, she's seen as a symbol of resolve and self-control."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tertaea");

    }


}
