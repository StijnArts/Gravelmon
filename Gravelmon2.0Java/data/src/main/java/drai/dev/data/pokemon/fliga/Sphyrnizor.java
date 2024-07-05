package drai.dev.data.pokemon.fliga;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sphyrnizor extends drai.dev.data.pokemon.Pokemon {
    public Sphyrnizor() {
        super("Sphyrnizor",
                Type.WATER, Type.ELECTRIC,
                new Stats(70,
                        114,
                        60,
                        100,
                        50,
                        90),
                List.of(Ability.MOTOR_DRIVE), Ability.MAGNET_PULL,
                17, 0,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Sphyrnizor are considerably dumb, only knowing how to swim and seek out pulses of electricity. When battling, if it's fully charged, it will tear it's opponents apart in a blind fury."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FEINT,7),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,18),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,22),
                        new MoveLearnSetEntry(Move.BRINE,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.LIQUIDATION,34),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,40),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,45),
                        new MoveLearnSetEntry(Move.ZAPWRAP,51)            ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 23, 44, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Sphyrnizor");
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);


    }


}
