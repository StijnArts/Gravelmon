package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orcloud extends drai.dev.data.pokemon.Pokemon {
    public Orcloud() {
        super("Orcloud",
                Type.FLYING,
                new Stats(170,
                        45,
                        45,
                        90,
                        90,
                        60),
                List.of(Ability.CLOUD_NINE,Ability.OBLIVIOUS), Ability.WIND_RIDER,
                100, 2610,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                200, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("- Splash Normal - GustSTAB Flying - Minimize Normal - Astonish Ghost 5 Water Gun Water 15 Mist Ice 18 Air CutterSTAB Flying 20 Swallow Normal 20 Stockpile Normal 20 Spit Up Normal 24 Air SlashSTAB Flying 27 Defog Flying 31 Destiny Bond Ghost 35 Heat Wave Fire 39 Rest Psychic 44 Amnesia Psychic 49 HurricaneSTAB Flying 52 Water Spout Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,18),
                        new MoveLearnSetEntry(Move.SPIT_UP,20),
                        new MoveLearnSetEntry(Move.SWALLOW,20),
                        new MoveLearnSetEntry(Move.STOCKPILE,20),
                        new MoveLearnSetEntry(Move.AIR_SLASH,24),
                        new MoveLearnSetEntry(Move.DEFOG,27),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,31),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,35),
                        new MoveLearnSetEntry(Move.REST,39),
                        new MoveLearnSetEntry(Move.AMNESIA,44),
                        new MoveLearnSetEntry(Move.HURRICANE,49),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Orcloud");

    }


}
