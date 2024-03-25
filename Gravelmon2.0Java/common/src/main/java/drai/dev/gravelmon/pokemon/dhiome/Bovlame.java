package drai.dev.gravelmon.pokemon.dhiome;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bovlame extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bovlame() {
        super("Bovlame",
                Type.FIRE,
                new Stats(65,
                        80,
                        65,
                        65,
                        55,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 234,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The flames it produces have a yellowish tint. Forklore has it that they burn only the ones with sinister souls."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bovlame");

    }


}
