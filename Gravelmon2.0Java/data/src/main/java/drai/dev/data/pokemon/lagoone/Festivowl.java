package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Festivowl extends drai.dev.data.pokemon.Pokemon {
    public Festivowl() {
        super("Festivowl",
                Type.ICE,Type.GRASS,
                new Stats(95,
                        85,
                        80,
                        85,
                        70,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 834,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                180, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Festivowl");

    }


}
