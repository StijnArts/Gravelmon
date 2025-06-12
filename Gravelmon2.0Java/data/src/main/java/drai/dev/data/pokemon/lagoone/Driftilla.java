package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Driftilla extends drai.dev.data.pokemon.Pokemon {
    public Driftilla() {
        super("Driftilla",
                Type.ELECTRIC,Type.GROUND,
                new Stats(52,
                        60,
                        57,
                        81,
                        59,
                        126),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 39,
                new Stats(0,0,0,2,0,0), 180,
                0.5,
                146, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 32, 2.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Driftilla");

    }


}
