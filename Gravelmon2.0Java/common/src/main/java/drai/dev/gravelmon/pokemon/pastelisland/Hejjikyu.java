package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hejjikyu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hejjikyu() {
        super("Hejjikyu",
                Type.GRASS,
                new Stats(60,
                        66,
                        120,
                        60,
                        100,
                        31),
                List.of(Ability.ROUGH_SKIN), Ability.SIMPLE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Sharp grassy quills grow over the shell of Hejjikyu, allowing Hejjikyu to create their own source of energy while remaining still. They appear commonly in the summer inside of hedges and bushes."),
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
           setLangFileName("Hejjikyu");

    }


}
