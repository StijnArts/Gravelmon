package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranSamurott extends drai.dev.data.pokemon.Pokemon {
    public NodorranSamurott(String name, Aspect aspect) {
        super(name, aspect, "Samurott",
                Type.WATER, Type.GHOST,
                new Stats(67,
                        120,
                        71,
                        120,
                        70,
                        80),
                List.of(Ability.INFILTRATOR), Ability.SHADOW_TAG,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Pound Normal - Stomp Normal - Headbutt Normal - Horn Attack Normal - Horn Drill Normal - Leer Normal - Hydro PumpSTAB Water - Revenge Fighting - Water PulseSTAB Water - Sucker Punch Dark - Aqua JetSTAB Water - Ominous WindSTAB Ghost - ScaldSTAB Water - HexSTAB Ghost - Razor ShellSTAB Water - Phantom ForceSTAB Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.HORN_DRILL,1),
                        new MoveLearnSetEntry(Move.SCALD,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.REVENGE,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.HEX,1),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Samurott");

    }


}
