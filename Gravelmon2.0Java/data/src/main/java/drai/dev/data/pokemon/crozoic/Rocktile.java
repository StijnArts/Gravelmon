package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rocktile extends drai.dev.data.pokemon.Pokemon {
    public Rocktile() {
        super("Rocktile",
                Type.ROCK,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RECKLESS,Ability.BATTLE_ARMOR), Ability.POWERLIFTER,
                11, 670,
                new Stats(0,0,2,0,0,0), 100,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("- Rock ThrowSTAB Rock - Fling  Dark - Seismic TossSTAB Fighting - Upper Hand STAB Fighting - Circle ThrowSTAB Fighting - Stone EdgeSTAB Rock - Head SmashSTAB Rock - Sand Tomb  Ground"),
                List.of(new EvolutionEntry("graplarock", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,1),
                        new MoveLearnSetEntry(Move.UPPERHAND,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,1),
                        new MoveLearnSetEntry(Move.FLING,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 43, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rocktile");

    }


}