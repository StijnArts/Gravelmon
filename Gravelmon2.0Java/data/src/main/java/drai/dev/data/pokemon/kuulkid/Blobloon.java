package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blobloon extends drai.dev.data.pokemon.Pokemon {
    public Blobloon() {
        super("Blobloon",
                Type.WATER,
                new Stats(85,
                        55,
                        80,
                        62,
                        83,
                        55),
                List.of(Ability.DRENCH), Ability.DRENCH,
                5, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 13, 32, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Blobloon");

    }


}
