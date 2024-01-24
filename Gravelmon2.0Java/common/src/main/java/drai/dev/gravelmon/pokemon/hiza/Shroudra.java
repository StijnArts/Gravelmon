package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shroudra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shroudra() {
        super("Shroudra",
                Type.DRAGON,Type.DARK,
                new Stats(105,
                        95,
                        72,
                        95,
                        78,
                        85),
                List.of(Ability.DARKHOLD), Ability.DARKHOLD,
                8, 165,
                new Stats(0,0,0,2,0,0), 15,
                0.5,
                180, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_2),
                List.of("Luminay becomes Shroudra after it can no longer shine, it seeks other light sources to absorb and strenghten its own."),
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
           setLangFileName("Shroudra");

    }


}
