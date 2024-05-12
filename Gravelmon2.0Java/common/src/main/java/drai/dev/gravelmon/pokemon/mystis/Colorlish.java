package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Colorlish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Colorlish() {
        super("Colorlish",
                Type.WATER,
                new Stats(50,
                        30,
                        50,
                        40,
                        50,
                        30),
                List.of(Ability.SECRETINSIGHT), Ability.MARVEL_SCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colorish's scales have grown over its eyes. Thankfully, it is so dull it often isn't noticed until it bites or rams into others. It hunts using a mystic power."),
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
           setLangFileName("Colorlish");

    }


}
