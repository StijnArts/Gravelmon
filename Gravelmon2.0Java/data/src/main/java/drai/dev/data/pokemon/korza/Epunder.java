package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Epunder extends drai.dev.data.pokemon.Pokemon {
    public Epunder() {
        super("Epunder",
                Type.DRAGON,Type.ELECTRIC,
                new Stats(90,
                        80,
                        80,
                        138,
                        120,
                        92),
                List.of(Ability.LIGHTNING_ROD,Ability.CLOUD_NINE), Ability.SERENE_GRACE,
                34, 558,
                new Stats(0,0,0,3,0,0), 35,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Epunder are seen as a symbol of luck and good fortune, especially to farmers because of the powerful rains they bring during times of drought. Wrathful Epunder are a common theme in some local folk tales."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,7),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,14),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,18),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,24),
                        new MoveLearnSetEntry(Move.DISABLE,27),
                        new MoveLearnSetEntry(Move.WHIRLWIND,33),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,38),
                        new MoveLearnSetEntry(Move.DISCHARGE,42),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,47),
                        new MoveLearnSetEntry(Move.THUNDER,55),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,61),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,70)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Epunder");

    }


}
