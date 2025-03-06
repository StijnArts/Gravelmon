package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Miragion extends drai.dev.data.pokemon.Pokemon {
    public Miragion() {
        super("Miragion",
                Type.WATER,Type.FLYING,
                new Stats(80,
                        55,
                        75,
                        80,
                        95,
                        100),
                List.of(Ability.AIR_LOCK), Ability.RAIN_DISH,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Capable of turning invisible at will. As it flies over a body of water, the surface creates an optical warping, giving its presence away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,3),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,9),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,14),
                        new MoveLearnSetEntry(Move.WHIRLWIND,19),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.ACROBATICS,28),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,32),
                        new MoveLearnSetEntry(Move.SCALD,37),
                        new MoveLearnSetEntry(Move.DEFOG,42),
                        new MoveLearnSetEntry(Move.ROOST,47),
                        new MoveLearnSetEntry(Move.HURRICANE,51),
                        new MoveLearnSetEntry(Move.YAWN,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,62),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,67),
                        new MoveLearnSetEntry(Move.HAZE,71),
                        new MoveLearnSetEntry(Move.ENDEAVOR,76)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Miragion");

    }


}
