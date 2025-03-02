package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monsewer extends drai.dev.data.pokemon.Pokemon {
    public Monsewer() {
        super("Monsewer",
                Type.POISON, Type.GROUND,
                new Stats(125,
                        100,
                        65,
                        100,
                        105,
                        30),
                List.of(Ability.WATER_ABSORB,Ability.STICKY_HOLD), Ability.STENCH,
                26, 1680,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                231, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("Monsewer live in the sludge and muck of the cities sewers where they absorb anything they can to grow in size. Sewer canals are commonly blocked up by Monsewer hiding in large pipes and tunnels."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,3),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,12),
                        new MoveLearnSetEntry(Move.MUD_BOMB,15),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,18),
                        new MoveLearnSetEntry(Move.POISON_JAB,21),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,24),
                        new MoveLearnSetEntry(Move.MINIMIZE,28),
                        new MoveLearnSetEntry(Move.SWALLOW,31),
                        new MoveLearnSetEntry(Move.STOCKPILE,31),
                        new MoveLearnSetEntry(Move.BULLDOZE,36),
                        new MoveLearnSetEntry(Move.TOXIC,45),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.BELCH,58)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Monsewer");

    }


}
