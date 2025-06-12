package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kernelkit extends drai.dev.data.pokemon.Pokemon {
    public Kernelkit() {
        super("Kernelkit",
                Type.ELECTRIC,
                new Stats(40,
                        65,
                        35,
                        55,
                        45,
                        75),
                List.of(Ability.SUPERCHARGE), Ability.NO_GUARD,
                6, 0,
                new Stats(0,0,0,0,0,1), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("When this pokemon is threatened, it can charge up power in the kernel on the end of its tail to create a loud popping sound. Contact with a Kernelkit's tail may produce a small, static shock."),
                List.of(new EvolutionEntry("maizent", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kernelkit");

    }


}
