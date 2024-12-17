package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dubdol extends drai.dev.data.pokemon.Pokemon {
    public Dubdol(Stats stats) {
        super("Dubdol",
                Type.GHOST,Type.NORMAL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Happy Hour (N) Normal - Fake Tears Dark - Double Hit (N)STAB Normal - Double Slap (N)STAB Normal - Destiny Bond (N) Ghost - Night ShadeSTAB Ghost - Flatter Dark - Light Screen (N) Psychic - Tearful Look Normal - Substitute (N) Normal - Pain Split Normal - Flash Normal - Shadow SneakSTAB Ghost - Shadow BallSTAB Ghost - Twin Beam (N) Psychic - Spotlight (N) Normal - Moonlight Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.TWIN_BEAM,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.FLATTER,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,1),
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.HAPPY_HOUR,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,1),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,1),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,1),
                        new MoveLearnSetEntry(Move.FLASH,1)                        ),
                List.of(Label.SORIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dubdol");

    }


}
