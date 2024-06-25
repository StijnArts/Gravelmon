package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Lopunny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lopunny(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Lopunny",
                Type.NORMAL,
                new Stats(65,
                        76,
                        84,
                        54,
                        96,
                        105),
                List.of(Ability.CUTE_CHARM,Ability.KLUTZ), Ability.LIMBER,
                9, 333,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lopunny");

    }


}
