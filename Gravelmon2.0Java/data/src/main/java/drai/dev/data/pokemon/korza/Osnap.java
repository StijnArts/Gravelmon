package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Osnap extends drai.dev.data.pokemon.Pokemon {
    public Osnap() {
        super("Osnap",
                Type.ELECTRIC,Type.NORMAL,
                new Stats(40,
                        30,
                        40,
                        120,
                        80,
                        110),
                List.of(Ability.DOWNLOAD), Ability.DOWNLOAD,
                3, 23,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                84, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("An artificial mon originally developed as a media sharing device, Osnap is able to convert its memories into pictures and video."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,9),
                        new MoveLearnSetEntry(Move.SPARK,14),
                        new MoveLearnSetEntry(Move.CONVERSION,18),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,23),
                        new MoveLearnSetEntry(Move.SCARY_FACE,27),
                        new MoveLearnSetEntry(Move.SWEET_KISS,30),
                        new MoveLearnSetEntry(Move.CONVERSION_2,32),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,37),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,41),
                        new MoveLearnSetEntry(Move.LOCKON,46),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,51),
                        new MoveLearnSetEntry(Move.COPYCAT,56),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,60),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,66),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,70)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Osnap");

    }


}
