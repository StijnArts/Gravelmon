package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Kvadract extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kvadract() {
        super("Kvadract",
                Type.FAIRY, Type.DARK,
                new Stats(67,
                        59,
                        41,
                        157,
                        157,
                        89),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                15, 165,
                new Stats(0,0,0,0,0,0), 15,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("One of the mysterious Ultra Beasts. It rapidly spins its four-eyed head to hypnotize its prey while tangling it with tentacles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.TORMENT,7),
                        new MoveLearnSetEntry(Move.ASTONISH,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.FAIRY_LOCK,23),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,29),
                        new MoveLearnSetEntry(Move.QUASH,31),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,37),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,53),
                        new MoveLearnSetEntry(Move.MEMENTO,59),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,67),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,73)                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 56, 67, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kvadract");

    }


}
