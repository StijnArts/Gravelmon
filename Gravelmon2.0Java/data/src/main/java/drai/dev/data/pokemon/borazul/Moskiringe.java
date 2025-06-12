package drai.dev.data.pokemon.borazul;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moskiringe extends drai.dev.data.pokemon.Pokemon {
    public Moskiringe() {
        super("Moskiringe",
                Type.BUG,Type.POISON,
                new Stats(70,
                        37,
                        74,
                        106,
                        74,
                        126),
                List.of(), null,
                9, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BORAZUL),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 31, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanFly(true);
        setCanWalkOnWater(true);
        setLangFileName("Moskiringe");

    }


}
