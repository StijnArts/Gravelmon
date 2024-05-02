package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wooble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wooble() {
        super("Wooble",
                Type.ICE, Type.NORMAL,
                new Stats(60,
                        61,
                        90,
                        40,
                        30,
                        25),
                List.of(Ability.SNOW_CLOAK,Ability.EARLY_BIRD,Ability.FUR_COAT), Ability.FUR_COAT,
                7, 165,
                new Stats(0,0,1,0,0,0), 220,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Wooble's wool keeps it warm in the harshest arctic climates. People in those areas tend to keep Wooble to use their wool for clothing."),
                List.of(new EvolutionEntry("snowool", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
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
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING, Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FOREST))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wooble");

    }


}
