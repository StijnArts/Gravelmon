package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pilomoss extends drai.dev.data.pokemon.Pokemon {
    public Pilomoss() {
        super("Pilomoss",
                Type.GRASS, Type.NORMAL,
                new Stats(60,
                        45,
                        60,
                        45,
                        50,
                        30),
                List.of(Ability.CHLOROPHYLL), Ability.GRASS_PELT,
                8, 260,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                58, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Pilomoss may be found in the woodland areas of Otopo. It basks in the sun as much as possible, turning its coat green in the process. They are thought to be linked to Slakoth, however Pilomoss are considerably more active."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,4),
                        new MoveLearnSetEntry(Move.LEAFTURN,7),
                        new MoveLearnSetEntry(Move.YAWN,10),
                        new MoveLearnSetEntry(Move.ENCORE,12),
                        new MoveLearnSetEntry(Move.VINESWING,14),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,16),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,19),
                        new MoveLearnSetEntry(Move.COUNTER,23),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,30)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pilomoss");

    }


}
