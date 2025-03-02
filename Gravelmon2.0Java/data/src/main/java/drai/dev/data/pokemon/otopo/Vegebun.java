package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vegebun extends drai.dev.data.pokemon.Pokemon {
    public Vegebun() {
        super("Vegebun",
                Type.GROUND, Type.FAIRY,
                new Stats(70,
                        60,
                        90,
                        70,
                        80,
                        110),
                List.of(Ability.HARVEST,Ability.RIPEN), Ability.PIXILATE,
                4, 55,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                151, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Vegebun are extremely joyous Pokémon. It is said that if a Vegebun makes a nest in a farm, it will have a bountiful harvest."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,5),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,5),
                        new MoveLearnSetEntry(Move.MUD_BOMB,11),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,13),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,15),
                        new MoveLearnSetEntry(Move.CHARM,17),
                        new MoveLearnSetEntry(Move.DIG,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,23),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,25),
                        new MoveLearnSetEntry(Move.METRONOME,27),
                        new MoveLearnSetEntry(Move.ROTOTILLER,30),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,35),
                        new MoveLearnSetEntry(Move.PRESENT,37),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.MINIMIZE,45),
                        new MoveLearnSetEntry(Move.BESTOW,47),
                        new MoveLearnSetEntry(Move.HEALING_WISH,50),
                        new MoveLearnSetEntry(Move.EARTH_POWER,53),
                        new MoveLearnSetEntry(Move.TACKLE,"tm"),
                        new MoveLearnSetEntry(Move.TACKLE,"tm"),
                        new MoveLearnSetEntry(Move.TACKLE,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vegebun");

    }


}
