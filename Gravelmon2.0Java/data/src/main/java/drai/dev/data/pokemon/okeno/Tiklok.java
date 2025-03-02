package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tiklok extends drai.dev.data.pokemon.Pokemon {
    public Tiklok() {
        super("Tiklok",
                Type.STEEL, Type.GHOST,
                new Stats(32,
                        62,
                        60,
                        62,
                        60,
                        40),
                List.of(Ability.TIMETWIST), Ability.TIMETWIST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Titok are often found in abandoned houses, waiting for curious souls to pass by. If anyone comes near, this Pokemon will startle them with screeching sounds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,10),
                        new MoveLearnSetEntry(Move.NIGHTMARE,20),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.METAL_SOUND,28),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,32),
                        new MoveLearnSetEntry(Move.MEMENTO,38),
                        new MoveLearnSetEntry(Move.PERISH_SONG,40),
                        new MoveLearnSetEntry(Move.POLTERGEIST,45),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,55),
                        new MoveLearnSetEntry(Move.HAPPY_HOUR,"tm"),
                        new MoveLearnSetEntry(Move.TEATIME,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tiklok");

    }


}
