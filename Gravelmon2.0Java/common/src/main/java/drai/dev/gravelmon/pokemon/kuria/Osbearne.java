package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Osbearne extends drai.dev.gravelmon.pokemon.Pokemon {
    public Osbearne() {
        super("Osbearne",
                Type.SOUND,Type.STEEL,
                new Stats(100,
                        130,
                        100,
                        70,
                        90,
                        50),
                List.of(Ability.MOLD_BREAKER,Ability.DEFIANT), Ability.HEAVY_METAL,
                21, 2959,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Osbearne amplifies its physical power by blasting loud sounds out of its speakers. By combining these two strengths, it can reduce an entire building to dust in one punch."),
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
           setLangFileName("Osbearne");

    }


}
