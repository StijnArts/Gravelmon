package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Timicharge extends drai.dev.data.pokemon.Pokemon {
    public Timicharge() {
        super("Timicharge",
                Type.NORMAL,
                new Stats(60,
                        80,
                        75,
                        30,
                        30,
                        70),
                List.of(Ability.STURDY,Ability.ADAPTABILITY), Ability.NORMALIZE,
                6, 363,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                69, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A shy Pokemon who spends much of its time with its mother. It is known to charge full force when threatened!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FLAIL,5),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.SLAM,15),
                        new MoveLearnSetEntry(Move.ENDURE,17),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,22),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,22),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,30),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,35),
                        new MoveLearnSetEntry(Move.MEGAHORN,40)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Timicharge");

    }


}
