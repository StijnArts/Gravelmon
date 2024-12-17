package drai.dev.data.pokemon.avalos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fubber extends drai.dev.data.pokemon.Pokemon {
    public Fubber() {
        super("Fubber",
                Type.FAIRY, Type.NORMAL,
                new Stats(50,
                        30,
                        30,
                        30,
                        60,
                        30),
                List.of(Ability.UNAWARE, Ability.FRIEND_GUARD), Ability.SLOW_START,
                6, 0,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("jodoge", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());

    }
}
