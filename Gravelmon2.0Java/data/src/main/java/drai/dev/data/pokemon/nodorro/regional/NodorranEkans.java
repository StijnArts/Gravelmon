package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranEkans extends drai.dev.data.pokemon.Pokemon {
    public NodorranEkans(String name, Aspect aspect) {
        super(name, aspect, "Ekans",
                Type.FIRE, Type.POISON,
                new Stats(35,
                        45,
                        40,
                        60,
                        58,
                        50),
                List.of(Ability.INTIMIDATE,Ability.SHED_SKIN), Ability.FLASH_FIRE,
                20, 70,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Ekans are short tempered and can quickly lash out to unsuspecting foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.EMBER,9),
                        new MoveLearnSetEntry(Move.ACID,11),
                        new MoveLearnSetEntry(Move.FIRE_FANG,13),
                        new MoveLearnSetEntry(Move.POISON_GAS,15),
                        new MoveLearnSetEntry(Move.INCINERATE,18),
                        new MoveLearnSetEntry(Move.GLARE,21),
                        new MoveLearnSetEntry(Move.WILLOWISP,26),
                        new MoveLearnSetEntry(Move.COIL,29),
                        new MoveLearnSetEntry(Move.SLUDGE,33),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,37),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ekans");

    }


}
