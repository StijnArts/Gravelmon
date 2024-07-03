package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Rowviar extends Pokemon {
    public Rowviar() {
        super("Rowviar",
                Type.WATER,
                new Stats(41,
                        69,
                        40,
                        40,
                        30,
                        60),
                List.of(Ability.SWIFT_SWIM), Ability.STRONG_JAW,
                4, 55,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("These small Pokemon travel in schools of 12 and tend to swim in a V formation. When one evolves into Sanook, they leave their colony to start a new one."),
                List.of(new EvolutionEntry("sanook", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,6),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.AGILITY,18),
                        new MoveLearnSetEntry(Move.DIVE,24),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,30),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.SLASH,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 22, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
