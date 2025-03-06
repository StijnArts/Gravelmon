package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ohvni extends drai.dev.data.pokemon.Pokemon {
    public Ohvni() {
        super("Ohvni",
                Type.POISON, Type.STEEL,
                new Stats(51,
                        70,
                        90,
                        70,
                        151,
                        90),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Cosmic Power Psychic - Steel WingSTAB Steel - Meteor MashSTAB Steel - Meteor Shower Rock - Starstream Psychic - Swift Normal - Crop Circle Psychic - Bolt InSTAB Steel - Flash CannonSTAB Steel - Glow Signal Psychic - Signal Beam Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ohvni");

    }


}
