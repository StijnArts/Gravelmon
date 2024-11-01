package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Funguru extends drai.dev.data.pokemon.Pokemon {
    public Funguru() {
        super("Funguru",
                Type.PSYCHIC,Type.FAIRY,
                new Stats(80,
                        60,
                        77,
                        80,
                        96,
                        70),
                List.of(Ability.CALMINGAURA), Ability.CALMINGAURA,
                13, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 1.12, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Funguru");

    }


}
