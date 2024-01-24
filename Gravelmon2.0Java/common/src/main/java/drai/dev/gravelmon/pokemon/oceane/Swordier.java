package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Swordier extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swordier() {
        super("Swordier",
                Type.STEEL,Type.FIGHTING,
                new Stats(80,
                        120,
                        70,
                        90,
                        70,
                        105),
                List.of(Ability.TEMPER), Ability.STEADFAST,
                8, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Swordier's nose grew so long that it broke off. Now, it wields the sharp blade as a sword. Whenever a Swordier comes across another of its kind, they will bow, and battle each other. It is dangerous to try to intervene."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_CLAW,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swordier");

    }


}
