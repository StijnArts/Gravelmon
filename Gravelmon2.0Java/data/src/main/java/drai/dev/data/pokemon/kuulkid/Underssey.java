package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Underssey extends drai.dev.data.pokemon.Pokemon {
    public Underssey() {
        super("Underssey",
                Type.WATER,Type.FIGHTING,
                new Stats(110,
                        118,
                        86,
                        65,
                        72,
                        84),
                List.of(Ability.WATER_ABSORB), Ability.SHEER_FORCE,
                17, 0,
                new Stats(0,3,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Despite this pokemon's towering size, Their personality is comparable to a small child. To keep themselves entertained, Undersseys create bubbles from the large instrument atop their heads."),
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
           setLangFileName("Underssey");

    }


}
