package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Wreckyard extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wreckyard() {
        super("Wreckyard",
                Type.STEEL,
                new Stats(95,
                        89,
                        79,
                        55,
                        98,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                23, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Wreckyard are adept at grabbing things with their huge iron claws. They scoop up everything they can into their carriage, which is crushed into tiny cubes."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,13),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,16),
                        new MoveLearnSetEntry(Move.GEAR_GRIND,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,23),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,32),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,36),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,46),
                        new MoveLearnSetEntry(Move.SKULL_BASH,51),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,55),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 54, .1, List.of(
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Wreckyard");

    }


}
