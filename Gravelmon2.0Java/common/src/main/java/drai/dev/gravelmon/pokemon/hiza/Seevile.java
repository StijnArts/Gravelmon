package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Seevile extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seevile() {
        super("Seevile",
                Type.GRASS,
                new Stats(20,
                        35,
                        20,
                        55,
                        65,
                        55),
                List.of(Ability.CUTE_CHARM), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.0,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("One may never pluck Seevile out of the ground during daytime or it won't stop crying. The sound of its cry is enough to drive one insane."),
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
           setLangFileName("Seevile");

    }


}
