package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Taltael extends drai.dev.data.pokemon.Pokemon {
    public Taltael() {
        super("Taltael",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                10, 136,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It stores seeds and berries in its tail feathers. Though it prefers to run, it will stand its ground and fiercely attack with powerful tail swipes if cornered."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ENDEAVOR,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.RUSHDOWN,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LAST_RESORT,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Taltael");

    }


}