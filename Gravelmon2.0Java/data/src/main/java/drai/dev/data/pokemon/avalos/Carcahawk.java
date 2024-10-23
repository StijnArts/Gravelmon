package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carcahawk extends drai.dev.data.pokemon.Pokemon {
    public Carcahawk() {
        super("Carcahawk",
                Type.FIRE, Type.FLYING,
                new Stats(70,
                        94,
                        72,
                        92,
                        72,
                        98),
                List.of(Ability.FLASH_FIRE,Ability.FIERYSPIRIT), Ability.DROUGHT,
                14, 0,
                new Stats(0,1,0,0,0,1), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Theorized to have migrated from a faraway region, Carcahawk can fly at amazing speeds. Not only that, the fire from its wings lets it adjust the pressure of air currents, which gives it more control when soaring."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.GROWL,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,13),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,17),
                        new MoveLearnSetEntry(Move.FLAME_BURST,21),
                        new MoveLearnSetEntry(Move.AGILITY,25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,29),
                        new MoveLearnSetEntry(Move.INCINERATE,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,41),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,45),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,49),
                        new MoveLearnSetEntry(Move.TAILWIND,53),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,57),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,60),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.SETTINGSUN,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 37, 54, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
