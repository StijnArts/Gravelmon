package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kunama extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kunama() {
        super("Kunama",
                Type.GROUND,Type.WATER,
                new Stats(85,
                        85,
                        80,
                        90,
                        110,
                        55),
                List.of(Ability.DRY_SKIN,Ability.RAINBOON), Ability.ADAPTABILITY,
                12, 191,
                new Stats(0,0,0,0,2,0), 45,
                0.0,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("When it is properly hydrated, its body is slimey and flexible. It has a level-headed disposition and takes a pragmatic approach to survival."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kunama");

    }


}
