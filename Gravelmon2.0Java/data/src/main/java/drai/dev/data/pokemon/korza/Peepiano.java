package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peepiano extends drai.dev.data.pokemon.Pokemon {
    public Peepiano() {
        super("Peepiano",
                Type.NORMAL,
                new Stats(40,
                        30,
                        40,
                        40,
                        40,
                        55),
                List.of(Ability.TANGLED_FEET), Ability.CUTE_CHARM,
                4, 36,
                new Stats(0,0,0,0,0,1), 220,
                0.5,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokémon is adored by children and adults alike for its endearingly cute behavior and looks. Because its wings aren't developed enough for flight, it waddles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,14),
                        new MoveLearnSetEntry(Move.SING,18),
                        new MoveLearnSetEntry(Move.SCREECH,22),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,32),
                        new MoveLearnSetEntry(Move.RETURN,36),
                        new MoveLearnSetEntry(Move.AGILITY,39)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Peepiano");

    }


}
