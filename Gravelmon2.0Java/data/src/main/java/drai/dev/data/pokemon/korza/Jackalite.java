package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jackalite extends drai.dev.data.pokemon.Pokemon {
    public Jackalite() {
        super("Jackalite",
                Type.ELECTRIC,
                new Stats(54,
                        96,
                        63,
                        67,
                        72,
                        113),
                List.of(Ability.QUICK_FEET,Ability.STATIC), Ability.SPEED_BOOST,
                9, 240,
                new Stats(0,0,0,0,0,2), 70,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("It's believed that Jackalite will only breed during electrical storms in the wild. It has enough electricity stored in its body to power a city block for days, without fatigue."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.NUZZLE,16),
                        new MoveLearnSetEntry(Move.CHARGE,18),
                        new MoveLearnSetEntry(Move.CHARM,21),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,25),
                        new MoveLearnSetEntry(Move.ENCORE,29),
                        new MoveLearnSetEntry(Move.STUNJAB,33),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,37),
                        new MoveLearnSetEntry(Move.BOUNCE,41),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.JUMP_KICK,54),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,58)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Jackalite");

    }


}
