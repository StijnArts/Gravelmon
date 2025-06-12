package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chelosnap extends drai.dev.data.pokemon.Pokemon {
    public Chelosnap(Stats stats) {
        super("Chelosnap",
                Type.WATER, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The fringes on Chelosnap’s skin blur its silhouette as it lies underwater, allowing it to hide in plain sight. It stays still for so long, algae grows on its shell. Its jaws can rend a car in half."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 32, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Chelosnap");

    }


}
