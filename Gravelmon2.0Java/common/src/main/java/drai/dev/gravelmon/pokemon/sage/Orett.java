package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Orett extends Pokemon {
    public Orett() {
        super("Orett",
                Type.STEEL,
                new Stats(45, 63, 65, 35, 40, 72),
                List.of(Ability.SHED_SKIN, Ability.BATTLE_ARMOR), Ability.STURDY,
                7, 861,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.DRAGON),
                List.of("Born deep underground, Orett feeds on ore to keep its metallic shell strong. The composition of its body depends on what kind of ore it feeds on."),
                List.of(new EvolutionEntry("anvelid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,7),
                        new MoveLearnSetEntry(Move.BIDE,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,15),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,19),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,22),
                        new MoveLearnSetEntry(Move.DIG,25),
                        new MoveLearnSetEntry(Move.IRON_HEAD,29),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,33),
                        new MoveLearnSetEntry(Move.SKULL_BASH,37),
                        new MoveLearnSetEntry(Move.IRON_TAIL,40),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,43),
                        new MoveLearnSetEntry(Move.METAL_BURST,47),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:iron_ore",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 28, 4.0, List.of(
                        new SpawnCondition(SpawnConditionType.MAXY,"20"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
