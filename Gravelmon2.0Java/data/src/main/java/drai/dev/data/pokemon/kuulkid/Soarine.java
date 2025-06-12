package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Soarine extends drai.dev.data.pokemon.Pokemon {
    public Soarine() {
        super("Soarine",
                Type.WATER,Type.FLYING,
                new Stats(90,
                        60,
                        55,
                        75,
                        55,
                        120),
                List.of(Ability.SERENEGRACE), Ability.SERENEGRACE,
                21, 0,
                new Stats(0,0,0,0,0,2), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 28, 54, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setCanFly(true);
           setLangFileName("Soarine");

    }


}
