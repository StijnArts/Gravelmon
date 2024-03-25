package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Flufflame extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flufflame() {
        super("Flufflame",
                Type.FIRE,Type.FLYING,
                new Stats(55,
                        55,
                        65,
                        90,
                        65,
                        95),
                List.of(Ability.BLAZE), Ability.BOMBARDIER,
                0, 0,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of(""),
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
           setLangFileName("Flufflame");

    }


}
