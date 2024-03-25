package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mycelil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mycelil() {
        super("Mycelil",
                Type.GRASS,
                new Stats(30,
                        25,
                        35,
                        45,
                        36,
                        20),
                List.of(Ability.EFFECT_SPORE), Ability.CHLOROPHYLL,
                23, 13,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                38, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Mycelil like to stay in one place, only moving when they have drained the nutrients from the ground. Their mushrooms glow in the dark."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mycelil");

    }


}
