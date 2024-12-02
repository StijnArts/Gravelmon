package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pecktock extends drai.dev.data.pokemon.Pokemon {
    public Pecktock() {
        super("Pecktock",
                Type.FLYING,Type.STEEL,
                new Stats(40,
                        56,
                        35,
                        25,
                        34,
                        58),
                List.of(Ability.OWNTEMPO), Ability.OWNTEMPO,
                3, 0,
                new Stats(0,1,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The tails of Pecktocks keep a consistent rhythm. In ancient times, these pokemon were used to measure short lengths of time."),
                List.of(new EvolutionEntry("peckdulum", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 34, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Pecktock");

    }


}
