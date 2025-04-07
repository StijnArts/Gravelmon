package drai.dev.data.pokemon.ultraspace;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kabrookie extends drai.dev.data.pokemon.Pokemon {
    public Kabrookie() {
        super("Kabrookie",
                Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kabrookie acts on stage, fighting and performing art. They start young to master their skills early."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,4),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,8),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,13),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,26),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,29),
                        new MoveLearnSetEntry(Move.DARK_PULSE,36)                        ),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kabrookie");

    }


}
