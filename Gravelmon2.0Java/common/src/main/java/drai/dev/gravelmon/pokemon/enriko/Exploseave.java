package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Exploseave extends drai.dev.gravelmon.pokemon.Pokemon {
    public Exploseave() {
        super("Exploseave",
                Type.WATER,Type.STEEL,
                new Stats(50,
                        80,
                        150,
                        30,
                        120,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 65,
                1.0,
                233, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("Exploseave's internal anatomy is designed to trigger a massive explosion when injured. As long as its tail remains, it will regrow its entire body after detonating."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Exploseave");

    }


}
