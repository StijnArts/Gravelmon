package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kindeshu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kindeshu() {
        super("Kindeshu",
                Type.GHOST,Type.LIGHT,
                new Stats(61,
                        60,
                        98,
                        71,
                        98,
                        62),
                List.of(Ability.LIGHTDRAIN), Ability.LIGHTDRAIN,
                5, 39,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                167, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Kindeshu looks like an old toy, so children are more likely to find comfort in it. However, once it gains a child's trust it will change form and absorb the child's light energy to feed itself."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kindeshu");

    }


}
