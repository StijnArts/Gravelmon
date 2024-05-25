package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Battefry extends drai.dev.gravelmon.pokemon.Pokemon {
    public Battefry() {
        super("Battefry",
                Type.ELECTRIC, Type.WATER,
                new Stats(50,
                        50,
                        30,
                        50,
                        30,
                        65),
                List.of(Ability.SWIFT_SWIM), Ability.BATTERY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These small pokemon can create small jolts, but they aren't enough to deter predators. Instead, they're used for communication."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.SOAK,21),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,24),
                        new MoveLearnSetEntry(Move.CRUNCH,27),
                        new MoveLearnSetEntry(Move.ION_DELUGE,30),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,36),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Battefry");

    }


}
