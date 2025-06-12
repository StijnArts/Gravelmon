package drai.dev.data.pokemon.lagoone;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cerakeet extends drai.dev.data.pokemon.Pokemon {
    public Cerakeet() {
        super("Cerakeet",
                Type.FLYING,
                new Stats(72,
                        65,
                        115,
                        65,
                        94,
                        54),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 20,
                new Stats(0,0,2,0,0,0), 70,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 56, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Cerakeet");

    }
}
