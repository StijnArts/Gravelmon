package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranBonsly extends drai.dev.data.pokemon.Pokemon {
    public NodorranBonsly(String name, Aspect aspect) {
        super(name, aspect, "Bonsly",
                Type.GROUND,
                new Stats(45,
                        30,
                        45,
                        75,
                        80,
                        20),
                List.of(Ability.RATTLED,Ability.RUN_AWAY), Ability.DRY_SKIN,
                7, 90,
                new Stats(0,0,0,1,0,0), 155,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Bonsly is a good mimic, making it often mistaken for a real rooted carrot. although it can easily be recognized as a fake due to it's curling 'leaves'."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,5),
                        new MoveLearnSetEntry(Move.MUD_SHOT,8),
                        new MoveLearnSetEntry(Move.MIMIC,11),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,16),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.FLATTER,23),
                        new MoveLearnSetEntry(Move.NATURE_POWER,28),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,31),
                        new MoveLearnSetEntry(Move.COUNTER,35),
                        new MoveLearnSetEntry(Move.TAUNT,40)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bonsly");

    }


}
