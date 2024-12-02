package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Felipom extends drai.dev.data.pokemon.Pokemon {
    public Felipom(Stats stats) {
        super("Felipom",
                Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.15,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In ancient times long before modern medicine was invented, Felipom would work as assistances in traditional apothecary shops. They are always happy to serve."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 32, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Felipom");

    }


}
