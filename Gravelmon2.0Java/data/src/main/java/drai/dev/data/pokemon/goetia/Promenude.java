package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Promenude extends drai.dev.data.pokemon.Pokemon {
    public Promenude() {
        super("Promenude",
                Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It prides itself on its primped appearance and impeccable poise, to the point of arrogance. It stays in the shade to avoid drying out and compromising its complexion."),
                List.of(
                        new EvolutionEntry("glautillion", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 39, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Promenude");

    }


}
