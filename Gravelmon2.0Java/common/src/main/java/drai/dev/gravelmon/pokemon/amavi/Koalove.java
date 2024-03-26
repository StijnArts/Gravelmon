package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Koalove extends drai.dev.gravelmon.pokemon.Pokemon {
    public Koalove() {
        super("Koalove",
                Type.NORMAL,Type.FAIRY,
                new Stats(120,
                        129,
                        70,
                        50,
                        70,
                        68),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.SING,1),
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
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,49)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 24, 47, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Koalove");

    }


}
