package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Magoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magoo() {
        super("Magoo",
                Type.BUG,
                new Stats(40,
                        50,
                        30,
                        30,
                        30,
                        40),
                List.of(Ability.ADAPTABILITY), Ability.CORROSION,
                4, 10,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Magoo's saliva can eat through almost anything, allowing them to get into all sorts of places. They like cramped, dark spots where they can gather energy in order to evolve while avoiding predators."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magoo");

    }


}
