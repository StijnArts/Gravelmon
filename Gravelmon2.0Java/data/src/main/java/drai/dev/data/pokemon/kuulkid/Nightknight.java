package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nightknight extends drai.dev.data.pokemon.Pokemon {
    public Nightknight() {
        super("Nightknight",
                Type.PSYCHIC,Type.NORMAL,
                new Stats(70,
                        120,
                        89,
                        110,
                        85,
                        106),
                List.of(Ability.NIGHTGUARD), Ability.NIGHTGUARD,
                8, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nightknight");

    }


}
