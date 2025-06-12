package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pincess extends drai.dev.data.pokemon.Pokemon {
    public Pincess() {
        super("Pincess",
                Type.BUG, Type.GROUND,
                new Stats(44,
                        44,
                        44,
                        44,
                        44,
                        22),
                List.of(Ability.COMPOUND_EYES,Ability.COMPETITIVE), Ability.STURDY,
                1, 14,
                new Stats(0,0,0,0,1,0), 220,
                0.0,
                78, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("victoriant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,3),
                        new MoveLearnSetEntry(Move.DIG,8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,12),
                        new MoveLearnSetEntry(Move.CONFUSION,16),
                        new MoveLearnSetEntry(Move.POISON_POWDER,20),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,24)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 1, 14, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pincess");

    }


}
