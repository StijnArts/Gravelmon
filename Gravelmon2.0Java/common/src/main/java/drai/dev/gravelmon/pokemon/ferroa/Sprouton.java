package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Sprouton extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sprouton() {
        super("Sprouton",
                Type.STEEL, Type.GRASS,
                new Stats(40,
                        55,
                        75,
                        45,
                        45,
                        40),
                List.of(Ability.LEAF_GUARD), Ability.GRASSY_SURGE,
                5, 165,
                new Stats(0,0,1,0,0,0), 200,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("It thrives on soil rich in metal content, which it stores in its bulb. When it is ready to evolve, it drills deep underground and sprouts."),
                List.of(new EvolutionEntry("utopion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.HYPNOSIS,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,18),
                        new MoveLearnSetEntry(Move.INGRAIN,21),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,24),
                        new MoveLearnSetEntry(Move.GROWTH,27),
                        new MoveLearnSetEntry(Move.DIG,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,35),
                        new MoveLearnSetEntry(Move.LOCKON,39),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,42),
                        new MoveLearnSetEntry(Move.SELFREPAIR,48),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 32, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Sprouton");

    }


}
