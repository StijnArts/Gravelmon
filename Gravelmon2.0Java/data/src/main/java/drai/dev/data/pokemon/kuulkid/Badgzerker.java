package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Badgzerker extends drai.dev.data.pokemon.Pokemon {
    public Badgzerker() {
        super("Badgzerker",
                Type.NORMAL,
                new Stats(75,
                        106,
                        95,
                        50,
                        98,
                        62),
                List.of(Ability.NO_GUARD), Ability.NO_GUARD,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 34, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Badgzerker");

    }


}
