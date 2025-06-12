package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coaleo extends drai.dev.data.pokemon.Pokemon {
    public Coaleo() {
        super("Coaleo",
                Type.ROCK, Type.FIRE,
                new Stats(75,
                        118,
                        130,
                        118,
                        60,
                        68),
                List.of(Ability.FLAME_BODY,Ability.FLASH_FIRE), Ability.FILTER,
                18, 1724,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.EMBER,22),
                        new MoveLearnSetEntry(Move.YAWN,29),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,36),
                        new MoveLearnSetEntry(Move.INCINERATE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,50),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,57),
                        new MoveLearnSetEntry(Move.EXPLOSION,64)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 65, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coaleo");

    }


}
