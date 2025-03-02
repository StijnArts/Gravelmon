package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quink extends drai.dev.data.pokemon.Pokemon {
    public Quink() {
        super("Quink",
                Type.FAIRY,Type.GRASS,
                new Stats(65,
                        50,
                        60,
                        70,
                        65,
                        80),
                List.of(Ability.QUICK_DRAW), Ability.FILTER,
                5, 23,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                71, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("- Scratch Normal 3 Leer Normal 5 Copycat  Normal 8 Role Play  Psychic 8 Fairy WindSTAB Fairy 11 Charm Fairy 13 Magical LeafSTAB Grass 16 Mimic  Normal 23 Metronome  Normal 27 Giga DrainSTAB Grass 32 Acrobatics Flying 35 Pin Missile  Bug 38 Feather Dance Flying 40 Sketch  Normal 45 Energy BallSTAB Grass 47 Dazzling GleamSTAB Fairy 50 Sketch  Normal 55 Sketch  Normal 60 Sketch  Normal 65 Sketch  Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.COPYCAT,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,8),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,13),
                        new MoveLearnSetEntry(Move.MIMIC,16),
                        new MoveLearnSetEntry(Move.METRONOME,23),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.ACROBATICS,32),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,35),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,47),
                        new MoveLearnSetEntry(Move.SKETCH,65)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Quink");

    }


}
