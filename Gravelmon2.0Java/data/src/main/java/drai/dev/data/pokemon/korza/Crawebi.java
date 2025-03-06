package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crawebi extends drai.dev.data.pokemon.Pokemon {
    public Crawebi() {
        super("Crawebi",
                Type.WATER,Type.FIRE,
                new Stats(25,
                        60,
                        35,
                        45,
                        30,
                        40),
                List.of(Ability.STORM_DRAIN,Ability.HYPER_CUTTER), Ability.COLOR_CHANGE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("A common mon, it is found in unpolluted waters. Crawebi hide among algae-stained rocks for camouflage, covering its head and claws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Crawebi");

    }


}
