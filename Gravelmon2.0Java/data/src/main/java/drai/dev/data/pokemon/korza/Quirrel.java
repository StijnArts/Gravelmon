package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quirrel extends drai.dev.data.pokemon.Pokemon {
    public Quirrel() {
        super("Quirrel",
                Type.NORMAL,
                new Stats(85,
                        85,
                        85,
                        85,
                        85,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 73,
                new Stats(0,1,0,1,0,1), 0,
                0.0,
                270, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A curious mon that changes color and typing from exposure to different elements. Quirrel love expressing themselves through art, often leaving messes and ink where they've been."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOLD_HANDS,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.SCREECH,12),
                        new MoveLearnSetEntry(Move.HEADBUTT,16),
                        new MoveLearnSetEntry(Move.AFTER_YOU,20),
                        new MoveLearnSetEntry(Move.FAKE_OUT,25),
                        new MoveLearnSetEntry(Move.PAINTFLING,29),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47),
                        new MoveLearnSetEntry(Move.DISABLE,52),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,54),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Quirrel");

    }


}
