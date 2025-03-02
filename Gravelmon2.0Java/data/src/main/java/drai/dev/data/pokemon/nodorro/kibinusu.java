package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class kibinusu extends drai.dev.data.pokemon.Pokemon {
    public kibinusu() {
        super("kibinusu",
                Type.ELECTRIC, Type.LIGHT,
                new Stats(60,
                        85,
                        45,
                        65,
                        40,
                        150),
                List.of(Ability.STATIC,Ability.MOTOR_DRIVE), Ability.SPEED_BOOST,
                4, 20,
                new Stats(0,0,0,0,0,2), 155,
                0.5,
                120, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Kibinusu cannot store their electricity well and thus moves constantly to release the electricity."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.SPARK,5),
                        new MoveLearnSetEntry(Move.DIVERT,8),
                        new MoveLearnSetEntry(Move.SWIFT,12),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.CHEERUP,17),
                        new MoveLearnSetEntry(Move.NUZZLE,19),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,24),
                        new MoveLearnSetEntry(Move.AGILITY,27),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,32),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,36),
                        new MoveLearnSetEntry(Move.DISCHARGE,41)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("kibinusu");

    }


}
