package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Smilaho extends drai.dev.data.pokemon.Pokemon {
    public Smilaho() {
        super("Smilaho",
                Type.ROCK,Type.ICE,
                new Stats(75,
                        113,
                        52,
                        41,
                        73,
                        121),
                List.of(Ability.TOUGH_CLAWS), Ability.REFRIGERATE,
                19, 557,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In order to survive the increasing cold, this mon adapted to a new climate. Smilaho's most prominent feature was its large teeth, used to rip open the throats of prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_SHARD,17),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,28),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,37),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,41),
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,46),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,54)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Smilaho");

    }


}
