package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dapperition extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dapperition() {
        super("Dapperition",
                Type.GHOST,
                new Stats(90,
                        65,
                        80,
                        105,
                        95,
                        85),
                List.of(Ability.SHADOW_TAG), Ability.OVERCOAT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dapperition's body is made of shadows, allowing it to move freely just about anywhere. Don't be fooled by their armless appearance. They can easily hypnotize someone using the pattern on their chest and suddenly form eerie arms to snatch them up."),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dapperition");

    }


}
