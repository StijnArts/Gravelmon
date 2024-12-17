package drai.dev.data.pokemon.avalos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jodoge extends drai.dev.data.pokemon.Pokemon {
    public Jodoge() {
        super("Jodoge",
                Type.FAIRY, Type.NORMAL,
                new Stats(140,
                        60,
                        50,
                        100,
                        90,
                        60),
                List.of(Ability.UNAWARE, Ability.FRIEND_GUARD), Ability.SLOW_START,
                13, 0,
                new Stats(0,0,0,0,1,0), 90,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());

    }
}
