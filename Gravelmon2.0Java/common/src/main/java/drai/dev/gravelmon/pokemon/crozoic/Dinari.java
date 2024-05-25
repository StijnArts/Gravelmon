package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dinari extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dinari() {
        super("Dinari",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                6, 60,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Based on: Hypsilophodon"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LAST_RESORT,1),
                        new MoveLearnSetEntry(Move.ENDEAVOR,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,1),
                        new MoveLearnSetEntry(Move.RUSHDOWN,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.DETECT,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dinari");

    }


}
