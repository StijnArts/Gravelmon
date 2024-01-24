package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bublit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bublit() {
        super("Bublit",
                Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SUPERCHARGE), Ability.SUPERCHARGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("When Bublit is happy, it emits a warm, vivid light from its body. The dimmer the light, the more unhappy or unwell the Bublit is. On occasion, massive gatherings of Bublit are encountered, resulting in swathes of ocean lit up at night."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bublit");

    }


}
