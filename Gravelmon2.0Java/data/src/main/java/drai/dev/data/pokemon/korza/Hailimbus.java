package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hailimbus extends drai.dev.data.pokemon.Pokemon {
    public Hailimbus() {
        super("Hailimbus",
                Type.FLYING,Type.ICE,
                new Stats(136,
                        70,
                        56,
                        97,
                        123,
                        53),
                List.of(Ability.SNOW_WARNING), Ability.REFRIGERATE,
                19, 236,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Hailimbus are usually seen in front of powerful storms, attracted to the high winds and humidity. A Hailimbus and Iridellus are the mascots of the Korza Weather Station."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,7),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,13),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,18),
                        new MoveLearnSetEntry(Move.DEFOG,22),
                        new MoveLearnSetEntry(Move.TAILWIND,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.MIST,36),
                        new MoveLearnSetEntry(Move.FREEZEDRY,41),
                        new MoveLearnSetEntry(Move.HAZE,45),
                        new MoveLearnSetEntry(Move.HURRICANE,49),
                        new MoveLearnSetEntry(Move.BLIZZARD,53),
                        new MoveLearnSetEntry(Move.COLDSNAP,57),
                        new MoveLearnSetEntry(Move.SHEER_COLD,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hailimbus");

    }


}
