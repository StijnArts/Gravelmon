package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Kintee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kintee() {
        super("Kintee",
                Type.FIGHTING,
                new Stats(50,
                        70,
                        55,
                        45,
                        40,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("kinett", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.REVENGE,8),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,12),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,16),
                        new MoveLearnSetEntry(Move.SCARY_FACE,20),
                        new MoveLearnSetEntry(Move.VITAL_THROW,24),
                        new MoveLearnSetEntry(Move.STRENGTH,29),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,32),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,40),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,44),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,52)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());

    }


}
