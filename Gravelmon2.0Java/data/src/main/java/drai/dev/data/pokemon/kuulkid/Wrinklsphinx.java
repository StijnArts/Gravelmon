package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wrinklsphinx extends drai.dev.data.pokemon.Pokemon {
    public Wrinklsphinx() {
        super("Wrinklsphinx",
                Type.GHOST,Type.NORMAL,
                new Stats(80,
                        52,
                        92,
                        68,
                        98,
                        95),
                List.of(Ability.CURSED_BODY), Ability.MUMMY,
                13, 0,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 38, 58, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Wrinklsphinx");

    }


}
