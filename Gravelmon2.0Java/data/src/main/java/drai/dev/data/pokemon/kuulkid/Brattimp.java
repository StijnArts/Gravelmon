package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brattimp extends drai.dev.data.pokemon.Pokemon {
    public Brattimp() {
        super("Brattimp",
                Type.FIRE,Type.FAIRY,
                new Stats(44,
                        44,
                        32,
                        63,
                        45,
                        53),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                7, 0,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("dival", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 34, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brattimp");

    }


}
