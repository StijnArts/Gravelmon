package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Mambolt extends drai.dev.data.pokemon.Pokemon {
    public Mambolt() {
        super("Mambolt",
                Type.ELECTRIC,
                new Stats(40,
                        65,
                        40,
                        65,
                        40,
                        75),
                List.of(Ability.SHED_SKIN,Ability.MOTOR_DRIVE,Ability.TIGHTGRIP), Ability.TIGHTGRIP,
                9, 165,
                new Stats(0,0,0,0,0,1), 210,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Mambolt spend most of their time up high in the trees. Due to their thin bodies, Mambolt are often mistaken for vines. Their loose skin helps them quickly escape if grabbed by a predator."),
                List.of(new EvolutionEntry("anaconduct", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:electirizer")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.GLARE,13),
                        new MoveLearnSetEntry(Move.BITE,17),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,20),
                        new MoveLearnSetEntry(Move.WRAP,24),
                        new MoveLearnSetEntry(Move.BOLTIN,28),
                        new MoveLearnSetEntry(Move.CRUNCH,33),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.VINESWING,42),
                        new MoveLearnSetEntry(Move.IRON_TAIL,47),
                        new MoveLearnSetEntry(Move.COIL,53),
                        new MoveLearnSetEntry(Move.ZAPWRAP,60),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 5, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mambolt");

    }


}
