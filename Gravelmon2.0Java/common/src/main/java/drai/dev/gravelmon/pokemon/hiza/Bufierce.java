package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bufierce extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bufierce() {
        super("Bufierce",
                Type.FIGHTING,Type.GROUND,
                new Stats(50,
                        95,
                        55,
                        20,
                        55,
                        50),
                List.of(Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(0,1,0,0,0,0), 120,
                0.75,
                69, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Small and clumsy, Bufierce it has difficulty running, so it tends to stick next to bigger Pokémon to feel safe."),
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
           setLangFileName("Bufierce");

    }


}
