package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bilbysit extends drai.dev.data.pokemon.Pokemon {
    public Bilbysit() {
        super("Bilbysit",
                Type.GROUND,Type.FAIRY,
                new Stats(75,
                        52,
                        35,
                        33,
                        30,
                        45),
                List.of(Ability.MATERNAL), Ability.MATERNAL,
                6, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("macarton", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 35, 3.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bilbysit");

    }


}
