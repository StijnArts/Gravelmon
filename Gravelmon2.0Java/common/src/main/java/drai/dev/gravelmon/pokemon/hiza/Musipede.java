package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Musipede extends drai.dev.gravelmon.pokemon.Pokemon {
    public Musipede() {
        super("Musipede",
                Type.BUG,
                new Stats(65,
                        50,
                        100,
                        90,
                        75,
                        80),
                List.of(Ability.SWARM), Ability.SWARM,
                8, 165,
                new Stats(0,0,0,1,0,0), 100,
                0.5,
                151, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They emit sounds as the move which can be easily distinguished in the forest. With a great variation of pitch and volume, its rare to find two Musipedes that sound the same."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Musipede");

    }


}
