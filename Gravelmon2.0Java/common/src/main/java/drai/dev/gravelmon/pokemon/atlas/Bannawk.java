package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bannawk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bannawk() {
        super("Bannawk",
                Type.GRASS, Type.FLYING,
                new Stats(58,
                        64,
                        60,
                        73,
                        70,
                        80),
                List.of(Ability.OVERGROW), Ability.HARVEST,
                7, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
                List.of("Generally the leaders of a flock of Baneep, they never hesitate to attack with a barrage of seeds if threatened."),
                List.of(new EvolutionEntry("phoenan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHIRP,5),
                        new MoveLearnSetEntry(Move.SEEDSHOT,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,14),
                        new MoveLearnSetEntry(Move.BULLET_SEED,18),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,20),
                        new MoveLearnSetEntry(Move.WING_ATTACK,24),
                        new MoveLearnSetEntry(Move.BANANARANG,27),
                        new MoveLearnSetEntry(Move.WORRY_SEED,32),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.AIR_SLASH,45),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,48),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,52),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,59),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bannawk");
setCanFly(true);
    }


}
