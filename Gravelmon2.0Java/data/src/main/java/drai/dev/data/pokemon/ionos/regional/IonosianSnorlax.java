package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianSnorlax extends drai.dev.data.pokemon.Pokemon {
    public IonosianSnorlax(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Snorlax",
                Type.GRASS, Type.NORMAL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,14),
                        new MoveLearnSetEntry(Move.SEED_BOMB,19),
                        new MoveLearnSetEntry(Move.BANANARANG,25),
                        new MoveLearnSetEntry(Move.RETALIATE,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.POWER_WHIP,45)               ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 41, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WINTER ,Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snorlax");

    }


}
