package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochPalkia extends drai.dev.data.pokemon.Pokemon {
    public EpochPalkia(String name, Aspect aspect) {
        super(name, aspect, "EpochPalkia",
                Type.COSMIC,Type.DRAGON,
                new Stats(300,
                        125,
                        125,
                        75,
                        25,
                        100),
                List.of(Ability.ASTRALMAJESTY), null,
                42, 3360,
                new Stats(0,0,0,3,0,0), 75,
                -1.0,
                340, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It has the ability to distort space. It is one of the Creation Trio of the Multiverse."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRIVEGA,1),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.POLARSPEAR,1)                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Palkia");

    }


}
