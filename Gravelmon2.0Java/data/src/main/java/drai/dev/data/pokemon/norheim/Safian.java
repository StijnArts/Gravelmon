package drai.dev.data.pokemon.norheim;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Safian extends drai.dev.data.pokemon.Pokemon {
    public Safian() {
        super("Safian",
                Type.GHOST, Type.FAIRY,
                new Stats(140,
                        50,
                        80,
                        50,
                        100,
                        50),
                List.of(Ability.HEALER,Ability.NATURAL_CURE), Ability.WONDER_GUARD,
                7, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.TACKLE,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.METAL_SOUND,19),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,32),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42)             ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 43, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Safian");

    }


}
