package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Burrolar extends drai.dev.data.pokemon.Pokemon {
    public Burrolar() {
        super("Burrolar",
                Type.ICE,
                new Stats(115,
                        98,
                        136,
                        40,
                        89,
                        49),
                List.of(), null,
                14, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 61, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Burrolar");

    }


}
