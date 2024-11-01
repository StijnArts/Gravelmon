package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squealie extends drai.dev.data.pokemon.Pokemon {
    public Squealie() {
        super("Squealie",
                Type.STEEL,
                new Stats(60,
                        52,
                        63,
                        40,
                        45,
                        80),
                List.of(Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("hogrod", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 45, 3.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squealie");

    }


}
