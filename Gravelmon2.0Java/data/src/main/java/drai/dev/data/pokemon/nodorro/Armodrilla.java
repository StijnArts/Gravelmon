package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Armodrilla extends drai.dev.data.pokemon.Pokemon {
    public Armodrilla() {
        super("Armodrilla",
                Type.STEEL, Type.ROCK,
                new Stats(80,
                        130,
                        139,
                        50,
                        60,
                        70),
                List.of(Ability.STURDY,Ability.BATTLE_ARMOR), Ability.SOLID_ROCK,
                16, 1180,
                new Stats(0,1,2,0,0,0), 50,
                0.5,
                230, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of("Barrier Psychic Rapid Spin Normal Natural Gift Normal Drain Punch Fighting Zen Headbutt Psychic Head SmashSTAB Rock Hone Claws Dark Shell Smash Normal Play Rough Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Armodrilla");

    }


}
