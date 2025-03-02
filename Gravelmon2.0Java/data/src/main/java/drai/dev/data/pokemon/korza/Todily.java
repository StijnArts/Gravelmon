package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Todily extends drai.dev.data.pokemon.Pokemon {
    public Todily() {
        super("Todily",
                Type.GRASS,Type.WATER,
                new Stats(134,
                        52,
                        65,
                        87,
                        64,
                        88),
                List.of(Ability.HYDRATION,Ability.DAMP), Ability.WATER_ABSORB,
                10, 152,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                172, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.GRASS),
                List.of("The larger a Todily's flower, the higher in rank it is in its family hierarchy. Its cheek sacs can help its cry carry over many, many miles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,4),
                        new MoveLearnSetEntry(Move.ABSORB,8),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.BOUNCE,16),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,22),
                        new MoveLearnSetEntry(Move.WATER_SPORT,27),
                        new MoveLearnSetEntry(Move.SYNTHESIS,31),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,39),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,43),
                        new MoveLearnSetEntry(Move.STOCKPILE,47),
                        new MoveLearnSetEntry(Move.SWALLOW,47),
                        new MoveLearnSetEntry(Move.SPIT_UP,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,52),
                        new MoveLearnSetEntry(Move.LEECH_SEED,58)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Todily");

    }


}
