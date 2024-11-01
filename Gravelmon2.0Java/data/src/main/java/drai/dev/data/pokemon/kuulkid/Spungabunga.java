package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spungabunga extends drai.dev.data.pokemon.Pokemon {
    public Spungabunga() {
        super("Spungabunga",
                Type.WATER,Type.ROCK,
                new Stats(110,
                        86,
                        118,
                        65,
                        72,
                        84),
                List.of(Ability.WATER_ABSORB), Ability.ROCK_HEAD,
                16, 0,
                new Stats(0,2,1,0,0,0), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID, Label.JOKE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 42, 57, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Spungabunga");

    }


}
