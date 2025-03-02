package drai.dev.data.pokemon.pastelisland.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class PastelianSmeargle extends drai.dev.data.pokemon.Pokemon {
    public PastelianSmeargle(String name, Aspect aspect) {
        super(name, aspect, "Smeargle",
                Type.DARK,
                new Stats(55,
                        25,
                        30,
                        25,
                        40,
                        75),
                List.of(Ability.OWN_TEMPO,Ability.INFILTRATOR), Ability.MOODY,
                12, 580,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Smeargle are reclusive creatures, spending hours spraying their paint-like fluid onto walls. People sometimes gather to try and decipher the meaning of a Smeargle's paintings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,1),
                        new MoveLearnSetEntry(Move.FLING,5),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,7),
                        new MoveLearnSetEntry(Move.TORMENT,10),
                        new MoveLearnSetEntry(Move.ACID,12),
                        new MoveLearnSetEntry(Move.RECYCLE,13),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,16),
                        new MoveLearnSetEntry(Move.MEMENTO,19),
                        new MoveLearnSetEntry(Move.FACADE,22),
                        new MoveLearnSetEntry(Move.COPYCAT,25),
                        new MoveLearnSetEntry(Move.IMPRISON,28),
                        new MoveLearnSetEntry(Move.EMBARGO,30),
                        new MoveLearnSetEntry(Move.DARK_PULSE,34)                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Smeargle");

    }


}
