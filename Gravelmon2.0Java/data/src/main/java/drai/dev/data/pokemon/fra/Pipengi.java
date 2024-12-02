package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pipengi extends drai.dev.data.pokemon.Pokemon {
    public Pipengi() {
        super("Pipengi",
                Type.FAIRY,Type.ICE,
                new Stats(51,
                        66,
                        63,
                        48,
                        51,
                        92),
                List.of(), null,
                4, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 45, 2.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pipengi");
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }


}
