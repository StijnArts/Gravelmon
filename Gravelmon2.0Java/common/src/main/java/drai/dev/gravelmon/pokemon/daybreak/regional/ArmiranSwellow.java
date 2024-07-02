package drai.dev.gravelmon.pokemon.daybreak.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class ArmiranSwellow extends Pokemon {
    public ArmiranSwellow(String name, Aspect aspect) {
        super(name, aspect,"ArmiranSwellow",
                Type.ELECTRIC, Type.FLYING,
                new Stats(60, 65, 60, 85, 50, 135),
                List.of(Ability.MOTOR_DRIVE), Ability.GALVANIZE,
                24, 1555,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                281, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It can induce thunderstorms to create attacks. It often targets fishing ships to steal food from netting."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.PLUCK,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,17),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,21),
                        new MoveLearnSetEntry(Move.CHARGE,24),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,27),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,30),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,36),
                        new MoveLearnSetEntry(Move.AIR_SLASH,36),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,39),
                        new MoveLearnSetEntry(Move.ELECTRIFY,42),
                        new MoveLearnSetEntry(Move.ENDEAVOR,45),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,51),
                        new MoveLearnSetEntry(Move.THUNDER,54),
                        new MoveLearnSetEntry(Move.REVERSAL,57),
                        new MoveLearnSetEntry(Move.BOOMBURST,60),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,64),
                        new MoveLearnSetEntry(Move.HURRICANE,70),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.CHARGE,"tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.ROOST,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.DEFOG,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor")
                        ),
                List.of(Label.GEN3,Label.DAYBREAK),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 35, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN, Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Swellow");
        this.setPortraitXYZ(0,1.8,0);
        setPreEvolution("taillow");
        setCanFly(true);
        addAdditionalEvolution("taillow", new EvolutionEntry("swellow armiran", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_HIGHLANDS.getId() + ":" + Biome.IS_HIGHLANDS.getName() +"\""))));
    }
}
