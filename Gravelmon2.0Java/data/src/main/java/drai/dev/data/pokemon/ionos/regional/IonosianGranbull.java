package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianGranbull extends drai.dev.data.pokemon.Pokemon {
    public IonosianGranbull(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Granbull",
                Type.FAIRY, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.12,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 54, 1.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
            addAdditionalEvolution("snubbull", new EvolutionEntry("granbull ionosian", EvolutionType.LEVEL_UP, List.of(),
                    List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_BADLANDS.getId() + ":" + Biome.IS_BADLANDS.getName() +"\""))));
           setLangFileName("Granbull");

    }


}
