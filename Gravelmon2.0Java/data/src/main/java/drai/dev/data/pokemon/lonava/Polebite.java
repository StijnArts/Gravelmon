package drai.dev.data.pokemon.lonava;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Polebite extends drai.dev.data.pokemon.Pokemon {
    public Polebite() {
        super("Polebite",
                Type.WATER,Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.DAMP,Ability.STATIC), Ability.SWIFT_SWIM,
                5, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Ecologically similar to Bulbite, Polebite swim in shallow ponds and urban canals. They charge up static as they swim, ready to share with any other of its species."),
                List.of(),
                List.of(),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 13, 34, 3.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Polebite");

    }


}
