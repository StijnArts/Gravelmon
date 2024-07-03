package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Aqube extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aqube() {
        super("Aqube",
                Type.WATER, Type.FIGHTING,
                new Stats(50,
                        82,
                        81,
                        62,
                        25,
                        25),
                List.of(Ability.WATER_COMPACTION), Ability.WATER_ABSORB,
                4, 165,
                new Stats(0,2,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(new EvolutionEntry("wapolyp", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.WORK_UP,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,16),
                        new MoveLearnSetEntry(Move.FLIP_TURN,22),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.WATERFALL,30),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,41),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,50)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
