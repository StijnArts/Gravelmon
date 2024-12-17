package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marshnap extends drai.dev.data.pokemon.Pokemon {
    public Marshnap() {
        super("Marshnap",
                Type.WATER,Type.GROUND,
                new Stats(120,
                        89,
                        100,
                        73,
                        58,
                        60),
                List.of(Ability.STRONG_JAW), Ability.SWIFT_SWIM,
                17, 0,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 56, .65, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Marshnap");

    }


}
