package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Volta extends drai.dev.data.pokemon.Pokemon {
    public Volta() {
        super("Volta",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(80,
                        60,
                        60,
                        145,
                        60,
                        60),
                List.of(Ability.VOLT_ABSORB), Ability.STATIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                163, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Volta's brain produces so much power, they must release some daily to keep from overloading. The globe's color changes with mood."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CONFUSION,4),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,9),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,14),
                        new MoveLearnSetEntry(Move.CHARGE,18),
                        new MoveLearnSetEntry(Move.PSYBEAM,23),
                        new MoveLearnSetEntry(Move.ION_DELUGE,29),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,33),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,37),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,43),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,48),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,52),
                        new MoveLearnSetEntry(Move.DISCHARGE,57),
                        new MoveLearnSetEntry(Move.PSYCHIC,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Volta");

    }


}
