package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Behitle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Behitle() {
        super("Behitle",
                Type.BUG,
                new Stats(20,
                        60,
                        50,
                        50,
                        60,
                        70),
                List.of(Ability.HEATPROOF), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They are commonly seem running at high speeds during the day. They move slower during rainy days with the fear of slipping and flipping upside down."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Behitle");

    }


}
