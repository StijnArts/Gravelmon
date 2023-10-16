package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Aquilor extends Pokemon {
    public Aquilor() {
        super("Aquilor",
                Type.NORMAL, Type.FLYING,
                new Stats(50, 85, 55, 50, 50, 85),
                List.of(Ability.KEEN_EYE, Ability.MOXIE), Ability.SAND_FORCE,
                7, 119,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                131, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.FLYING),
                List.of("Aquilor lives in treetops and watches its prey before swooping on it. Its sharp eyes can spot the faintest of movements, even through dense foliage."),
                List.of(new EvolutionEntry("warquila", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.JET_STRIKE,16),
                        new MoveLearnSetEntry(Move.PSYCH_UP,20),
                        new MoveLearnSetEntry(Move.SUBMISSION,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.DRILL_PECK,32),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,36),
                        new MoveLearnSetEntry(Move.STEEL_WING,40),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,44),
                        new MoveLearnSetEntry(Move.DRILL_RUN,48),
                        new MoveLearnSetEntry(Move.STANDOFF,52),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,56),
                        new MoveLearnSetEntry(Move.LAST_RESORT,60),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.HURRICANE,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg")
                        ),
                List.of(Label.SAGE),
                4, List.of(
                        new ItemDrop("cobblemon:sharp_beak",20, 1,1),
                        new ItemDrop("minecraft:feather",40, 1,2),
                        new ItemDrop("minecraft:egg",40, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 18, 37, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        this.setCanFly(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
