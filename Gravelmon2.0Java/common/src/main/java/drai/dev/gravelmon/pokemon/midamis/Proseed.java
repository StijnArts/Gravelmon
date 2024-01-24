package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Proseed extends drai.dev.gravelmon.pokemon.Pokemon {
    public Proseed() {
        super("Proseed",
                Type.POISON,Type.PSYCHIC,
                new Stats(35,
                        35,
                        40,
                        35,
                        40,
                        50),
                List.of(Ability.SHIELD_DUST), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Proseed are known to let themselves get carried away by light breezes, both out of fear for their lives and trying to find a proper space to grow and develop."),
                List.of(),
                List.of(                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Proseed");

    }


}
