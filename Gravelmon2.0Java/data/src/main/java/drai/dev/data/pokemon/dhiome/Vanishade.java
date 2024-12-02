package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vanishade extends drai.dev.data.pokemon.Pokemon {
    public Vanishade(Stats stats) {
        super("Vanishade",
                Type.GHOST,Type.STEEL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Vanishade's steel frame hides a malevolent spirit that preys on vanity. Those who gaze too long at their reflection in its surface find their vitality drained, leaving only a hollow shell of their former selves."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 31, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Vanishade");

    }


}
