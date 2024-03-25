package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Yamaki extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yamaki() {
        super("Yamaki",
                Type.ROCK,Type.PSYCHIC,
                new Stats(70,
                        200,
                        70,
                        40,
                        70,
                        90),
                List.of(Ability.ROUNDRECORD), Ability.ROUNDRECORD,
                17, 1632,
                new Stats(0,4,0,0,0,0), 45,
                0.0,
                230, ExperienceGroup.FAST,
                70,
                50, List.of(),
                List.of("Although fast and powerful, Yamaki is constantly confused. No one can get close enough to help it stop spinning, so it will probably spin the rest of its life."),
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
           setLangFileName("Yamaki");

    }


}
