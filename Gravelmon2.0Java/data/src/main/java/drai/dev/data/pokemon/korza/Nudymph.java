package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nudymph extends drai.dev.data.pokemon.Pokemon {
    public Nudymph() {
        super("Nudymph",
                Type.FAIRY,Type.WATER,
                new Stats(103,
                        50,
                        77,
                        97,
                        80,
                        80),
                List.of(Ability.STICKY_HOLD), Ability.WATER_ABSORB,
                7, 108,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Nudymph are only known to live in the Spiral Springs. They unintentionally drown people that go to the springs, wanting to play with their new friends but not knowing that humans can't breathe underwater."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,3),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,6),
                        new MoveLearnSetEntry(Move.CHARM,10),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,14),
                        new MoveLearnSetEntry(Move.BRINE,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,23),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,27),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.SCALD,36),
                        new MoveLearnSetEntry(Move.RECOVER,40),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,49),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,53),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,56)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nudymph");

    }


}
