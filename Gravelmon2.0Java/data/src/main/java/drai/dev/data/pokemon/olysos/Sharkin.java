package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sharkin extends drai.dev.data.pokemon.Pokemon {
    public Sharkin() {
        super("Sharkin",
                Type.WATER,
                new Stats(54,
                        50,
                        63,
                        55,
                        63,
                        22),
                List.of(Ability.TORRENT), Ability.MOXIE,
                4, 65,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("It loves everything that has to do with water and splashes around in it. Sadly it isn't that flexible on land."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sharkin");

    }


}
