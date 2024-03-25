package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Muffairy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Muffairy() {
        super("Muffairy",
                Type.GROUND,Type.FAIRY,
                new Stats(60,
                        10,
                        10,
                        50,
                        20,
                        50),
                List.of(Ability.SUGARCOAT,Ability.SWEET_VEIL), Ability.TOPPINGS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                40, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's very small and pretty weak, but due to them sticking in groups, they aren't often attacked."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Muffairy");

    }


}
