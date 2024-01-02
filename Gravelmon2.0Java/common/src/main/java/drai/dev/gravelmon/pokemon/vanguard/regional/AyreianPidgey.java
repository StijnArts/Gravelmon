package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AyreianPidgey extends Pokemon {
    public AyreianPidgey(int dexNo) {
        super(dexNo,"AyreianPidgey",
                Type.GRASS, Type.FLYING,
                new Stats(40,56,40,56,35,35),
                List.of(Ability.FLOWER_GIFT, Ability.OVERGROW), Ability.GRASSY_SURGE,
                3, 18,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("For protection, it releases a horrible stench from the antenna on its head to drive away enemies."),
                List.of(new EvolutionEntry("ayreianpidgeotto", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 3),
                        new MoveLearnSetEntry(Move.PECK, 5),
                        new MoveLearnSetEntry(Move.BRANCH_POKE, 9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 13),
                        new MoveLearnSetEntry(Move.WHIRLWIND, 17),
                        new MoveLearnSetEntry(Move.TRAILBLAZE, 22),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, 27),
                        new MoveLearnSetEntry(Move.AGILITY, 32),
                        new MoveLearnSetEntry(Move.GRAV_APPLE, 38),
                        new MoveLearnSetEntry(Move.ROOST, 44),
                        new MoveLearnSetEntry(Move.TAILWIND, 50),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 56),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE, 62),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),

                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, "egg"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, "egg"),
                        new MoveLearnSetEntry(Move.UPROAR, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 25, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Pidgey");
        setCanFly(true);
    }
}
