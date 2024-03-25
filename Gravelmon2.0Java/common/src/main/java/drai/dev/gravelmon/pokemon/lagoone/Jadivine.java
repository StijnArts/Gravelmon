package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Jadivine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jadivine() {
        super("Jadivine",
                Type.FLYING,Type.DRAGON,
                new Stats(30,
                        50,
                        40,
                        70,
                        65,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 30,
                new Stats(0,0,0,1,0,0), 175,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jadivine");

    }


}
