package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Permaent extends drai.dev.data.pokemon.Pokemon {
    public Permaent(Stats stats) {
        super("Permaent",
                Type.GRASS, Type.ICE,
                stats,
                List.of(Ability.SNOW_WARNING), Ability.SOUNDPROOF,
                23, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,13),
                        new MoveLearnSetEntry(Move.MIST,16),
                        new MoveLearnSetEntry(Move.AVALANCHE,19),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,22),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,26),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,32),
                        new MoveLearnSetEntry(Move.ICE_BEAM,37),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,43),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,48),
                        new MoveLearnSetEntry(Move.SWEETDECAY,52),
                        new MoveLearnSetEntry(Move.BLIZZARD,55),
                        new MoveLearnSetEntry(Move.SHEER_COLD,60)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 49, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Permaent");
        addAdditionalEvolution("snover", new EvolutionEntry("permaent", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_TAIGA.getId() + ":" + Biome.IS_TAIGA.getName()))));

    }


}
