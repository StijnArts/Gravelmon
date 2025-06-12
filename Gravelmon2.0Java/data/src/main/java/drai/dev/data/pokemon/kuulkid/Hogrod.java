package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hogrod extends drai.dev.data.pokemon.Pokemon {
    public Hogrod() {
        super("Hogrod",
                Type.STEEL,Type.FIRE,
                new Stats(90,
                        76,
                        82,
                        66,
                        62,
                        120),
                List.of(Ability.SPEED_BOOST), Ability.REDHOT,
                14, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hogrod");

    }


}
