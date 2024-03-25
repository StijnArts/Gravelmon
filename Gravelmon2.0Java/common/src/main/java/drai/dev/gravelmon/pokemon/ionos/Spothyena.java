package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Spothyena extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spothyena() {
        super("Spothyena",
                Type.GROUND,
                new Stats(59,
                        76,
                        65,
                        50,
                        50,
                        60),
                List.of(Ability.GLUTTONY,Ability.PICKUP), Ability.MOXIE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.97,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Spothyena hunt in moderately sized packs. They are usually impatient and fight with each other over the smallest of things, mainly food."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spothyena");

    }


}
