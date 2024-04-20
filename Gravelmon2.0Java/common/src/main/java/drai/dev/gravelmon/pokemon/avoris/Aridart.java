package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Aridart extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aridart() {
        super("Aridart",
                Type.ROCK, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ROUGH_SKIN,Ability.SAND_RUSH,Ability.DRY_SKIN), Ability.DRY_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Found in the hot deserts of Avoris, these Pokemon adapted to the harsh living conditions and are able to survive without food or water for months. With the skillful use of their limbs they easily dash across rocky terrains and even through deep sand at high speeds. They can outspeed almost any of their enemies."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aridart");

    }


}
