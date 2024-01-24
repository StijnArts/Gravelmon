package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ottoil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ottoil() {
        super("Ottoil",
                Type.POISON,
                new Stats(35,
                        60,
                        40,
                        50,
                        50,
                        60),
                List.of(Ability.DAMP,Ability.STRONG_JAW,Ability.POISON_TOUCH), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,1), 230,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It didn't appear in the region until modern times, but it doesn't cause trouble with the native Pokémon. A film of waterproof goo keeps it insulated in chilly water."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ottoil");

    }


}
