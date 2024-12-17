package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roadent extends drai.dev.data.pokemon.Pokemon {
    public Roadent() {
        super("Roadent",
                Type.NORMAL,Type.GROUND,
                new Stats(50,
                        50,
                        60,
                        40,
                        50,
                        30),
                List.of(Ability.UNAWARE), Ability.UNAWARE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Often crosses roads and routes with heavy traffic as a test of speed and skill. Its hide, on its own, isn't strong enough to protect from any collisions."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Roadent");

    }


}
