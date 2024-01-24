package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Willowanne extends drai.dev.gravelmon.pokemon.Pokemon {
    public Willowanne() {
        super("Willowanne",
                Type.GRASS,
                new Stats(74,
                        100,
                        72,
                        90,
                        72,
                        46),
                List.of(Ability.TANGLED_FEET), Ability.TANGLED_FEET,
                8, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.0,
                159, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Willowanne languidly stroll through fields on sunny days, hoping their dry skin catches alight in a spectacular show of fire."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Willowanne");

    }


}
