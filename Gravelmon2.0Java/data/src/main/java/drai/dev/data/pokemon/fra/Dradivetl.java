package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dradivetl extends drai.dev.data.pokemon.Pokemon {
    public Dradivetl() {
        super("Dradivetl",
                Type.GROUND,Type.DRAGON,
                new Stats(70,
                        106,
                        74,
                        37,
                        74,
                        126),
                List.of(), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 61, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Dradivetl");

    }


}
