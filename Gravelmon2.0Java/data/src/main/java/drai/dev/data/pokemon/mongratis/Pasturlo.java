package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pasturlo extends drai.dev.data.pokemon.Pokemon {
    public Pasturlo() {
        super("Pasturlo",
                Type.GRASS,
                new Stats(68,
                        56,
                        58,
                        51,
                        40,
                        43),
                List.of(Ability.OVERCOAT), Ability.OVERCOAT,
                7, 69,
                new Stats(1,0,0,0,0,0), 45,
                0.85,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Pasturlo tries its best to stay asleep at all times, but gets extremely angry when it is awoken from its slumber."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,11),
                        new MoveLearnSetEntry(Move.YAWN,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,19),
                        new MoveLearnSetEntry(Move.SUBMISSION,22),
                        new MoveLearnSetEntry(Move.RETALIATE,25),
                        new MoveLearnSetEntry(Move.LEECH_SEED,29),
                        new MoveLearnSetEntry(Move.MILK_DRINK,33),
                        new MoveLearnSetEntry(Move.HORN_LEECH,37),
                        new MoveLearnSetEntry(Move.STONE_EDGE,41),
                        new MoveLearnSetEntry(Move.LEAF_STORM,45)                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pasturlo");

    }


}
