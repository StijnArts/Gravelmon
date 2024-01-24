package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Blitzchief extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blitzchief() {
        super("Blitzchief",
                Type.ELECTRIC,Type.DARK,
                new Stats(50,
                        95,
                        70,
                        95,
                        70,
                        85),
                List.of(Ability.STATIC), Ability.STATIC,
                8, 165,
                new Stats(0,1,0,1,0,0), 75,
                0.5,
                189, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They are mostly nocturnal and can be seen searching for food in dumpsters. It specifically looks for discarded batteries and electronics to chew on."),
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
           setLangFileName("Blitzchief");

    }


}
