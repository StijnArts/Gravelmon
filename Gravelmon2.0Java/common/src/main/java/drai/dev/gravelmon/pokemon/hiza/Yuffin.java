package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Yuffin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yuffin() {
        super("Yuffin",
                Type.FLYING,Type.WATER,
                new Stats(48,
                        48,
                        42,
                        58,
                        42,
                        62),
                List.of(Ability.HYDRATION), Ability.GALE_WINGS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Often found in large groups near colder waters. They can glide as close to the water as possible, usually mistaken as if they are skiing."),
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
           setLangFileName("Yuffin");

    }


}
