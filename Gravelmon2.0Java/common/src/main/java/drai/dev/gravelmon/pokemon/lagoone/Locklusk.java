package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Locklusk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Locklusk() {
        super("Locklusk",
                Type.WATER,Type.STEEL,
                new Stats(50,
                        70,
                        115,
                        35,
                        55,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 320,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                123, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("The high durability of its shell combined with its incredible strong bite force, makes sure that anything that ever falls inside its shell is never recovered."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Locklusk");

    }


}
