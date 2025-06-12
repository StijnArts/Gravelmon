package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Snowool extends drai.dev.data.pokemon.Pokemon {
    public Snowool() {
        super("Snowool",
                Type.ICE, Type.NORMAL,
                new Stats(70,
                        61,
                        110,
                        70,
                        50,
                        40),
                List.of(Ability.SNOW_CLOAK,Ability.EARLY_BIRD,Ability.FUR_COAT), Ability.FUR_COAT,
                11, 165,
                new Stats(0,0,2,0,0,0), 78,
                0.5,
                122, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Snowool are treasured by the trainers who manage to raise them in the harsh climates. The scarf from Snowool is said to warm up anyone, regardless of how cold they were prior."),
                List.of(new EvolutionEntry("shiveram", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,3),
                        new MoveLearnSetEntry(Move.ICY_WIND,7),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,10),
                        new MoveLearnSetEntry(Move.MIST,12),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,16),
                        new MoveLearnSetEntry(Move.ICE_SHARD,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,23),
                        new MoveLearnSetEntry(Move.CHARM,25),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,30),
                        new MoveLearnSetEntry(Move.ICE_BEAM,34),
                        new MoveLearnSetEntry(Move.REST,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,41)                        ),
                List.of(Label.OROHNHAVAI
                ),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 19, 32, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING, Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snowool");

    }


}
