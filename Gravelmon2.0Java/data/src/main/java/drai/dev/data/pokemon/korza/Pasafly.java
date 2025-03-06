package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pasafly extends drai.dev.data.pokemon.Pokemon {
    public Pasafly() {
        super("Pasafly",
                Type.BUG,Type.FAIRY,
                new Stats(50,
                        60,
                        110,
                        85,
                        80,
                        90),
                List.of(Ability.FLUFFY), Ability.FLUFFY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                166, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("On warm, sunny days, this mon lazily flies around looking for food. As their wings flap, dust is scattered which causes dizziness. Because of Pasafly's poor eyesight, they've been known to mistake small things for food and carry them away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,4),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,10),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.BUG_BITE,19),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,23),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,28),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,41),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,45),
                        new MoveLearnSetEntry(Move.MOONBLAST,50),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,54)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pasafly");

    }


}
