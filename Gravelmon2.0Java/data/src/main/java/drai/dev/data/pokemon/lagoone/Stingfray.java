package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stingfray extends drai.dev.data.pokemon.Pokemon {
    public Stingfray() {
        super("Stingfray",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(79,
                        72,
                        68,
                        103,
                        73,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 277,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 27, 45, 2.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stingfray");

    }


}
