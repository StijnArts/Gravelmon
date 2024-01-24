package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Netherval extends drai.dev.gravelmon.pokemon.Pokemon {
    public Netherval() {
        super("Netherval",
                Type.FIRE,Type.ELECTRIC,
                new Stats(90,
                        130,
                        100,
                        160,
                        90,
                        110),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,1,0,2,0,0), 3,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It caused the largest volcano eruption on the islands, destroying everything. People say it did this to cleanse the islands of impurities. It erupted for over 2000 years. It went into a deep slumber deep inside the volcano. Ozoridrey and Vernirox took over to protect the islands."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,8),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,22),
                        new MoveLearnSetEntry(Move.DISCHARGE,29),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,36),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,43),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,50),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,57),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,64),
                        new MoveLearnSetEntry(Move.WORK_UP,71),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,78),
                        new MoveLearnSetEntry(Move.THUNDER,85),
                        new MoveLearnSetEntry(Move.ERUPTION,92)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Netherval");

    }


}
