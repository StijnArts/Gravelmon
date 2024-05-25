package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hiveum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hiveum() {
        super("Hiveum",
                Type.BUG,
                new Stats(50,
                        75,
                        140,
                        50,
                        120,
                        50),
                List.of(Ability.HONEY_GATHER,Ability.HARVEST,Ability.GOOEY), Ability.GOOEY,
                6, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,4),
                        new MoveLearnSetEntry(Move.ENDURE,8),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,12),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,16),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.FLAIL,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.XSCISSOR,32),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,36),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,40),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,44),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, 3, List.of(
                ), List.of(),
                List.of(SpawnPreset.HONEY_TREE),
                0.28, 0.3,
                List.of());
           setLangFileName("Hiveum");

    }


}
