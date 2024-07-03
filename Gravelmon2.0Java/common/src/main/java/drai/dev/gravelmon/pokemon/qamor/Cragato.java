package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Cragato extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cragato() {
        super("Cragato",
                Type.ROCK, Type.ELECTRIC,
                new Stats(57,
                        60,
                        69,
                        69,
                        63,
                        40),
                List.of(Ability.STATIC), Ability.STRONG_JAW,
                9, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("resistreak", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,10),
                        new MoveLearnSetEntry(Move.SPARK,14),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,19),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,23),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,28),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,33),
                        new MoveLearnSetEntry(Move.ION_DELUGE,38),
                        new MoveLearnSetEntry(Move.DISCHARGE,43),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,48),
                        new MoveLearnSetEntry(Move.STUNJAB,50),
                        new MoveLearnSetEntry(Move.GLARE,54),
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,59),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,65)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 23, 41, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cragato");

    }


}
