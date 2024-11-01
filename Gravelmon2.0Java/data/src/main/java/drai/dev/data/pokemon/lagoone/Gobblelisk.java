package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gobblelisk extends drai.dev.data.pokemon.Pokemon {
    public Gobblelisk() {
        super("Gobblelisk",
                Type.BUG,
                new Stats(44,
                        60,
                        52,
                        67,
                        62,
                        35),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 131,
                new Stats(0,0,0,1,0,0), 75,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("drasalys", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gobblelisk");

    }


}
