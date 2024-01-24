package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Lilabaa extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lilabaa() {
        super("Lilabaa",
                Type.NORMAL,Type.FAIRY,
                new Stats(70,
                        25,
                        50,
                        50,
                        85,
                        40),
                List.of(Ability.CUTE_CHARM,Ability.MAGIC_GUARD,Ability.CACOPHONY), Ability.CACOPHONY,
                8, 165,
                new Stats(0,0,0,0,1,0), 185,
                0.5,
                104, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Listening to its soothing lullaby is said to bring instant calmness and positivity."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.ROUND,3),
                        new MoveLearnSetEntry(Move.PLAY_NICE,7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.CAPTIVATE,14),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,16),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,25),
                        new MoveLearnSetEntry(Move.REST,29),
                        new MoveLearnSetEntry(Move.HEAL_BELL,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,37),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,40),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,44),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,49),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lilabaa");

    }


}
