package drai.dev.gravelmon.pokemon.varitas.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class VaritasianRaikou extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaritasianRaikou(int dex) {
        super(dex,"Raikou",
                Type.GHOST, Type.ELECTRIC,
                new Stats(90,
                        85,
                        75,
                        115,
                        100,
                        115),
                List.of(Ability.PRESSURE), Ability.INNER_FOCUS,
                19, 165,
                new Stats(0,0,0,1,0,2), 3,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Raikou embodies the speed of lightning. The roars of this Pokemon send shock waves shuddering through the air and shake the ground as if lightning bolts had come crashing down."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.ROAR,15),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,22),
                        new MoveLearnSetEntry(Move.SPARK,29),
                        new MoveLearnSetEntry(Move.REFLECT,36),
                        new MoveLearnSetEntry(Move.CRUNCH,43),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,50),
                        new MoveLearnSetEntry(Move.DISCHARGE,57),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,64),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,71),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,78),
                        new MoveLearnSetEntry(Move.THUNDER,85),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm")                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raikou");

    }


}
