package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Luradune extends drai.dev.gravelmon.pokemon.Pokemon {
    public Luradune() {
        super("Luradune",
                Type.BUG,Type.GROUND,
                new Stats(60,
                        65,
                        70,
                        40,
                        50,
                        40),
                List.of(Ability.ARENA_TRAP), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its abdomen is bioluminescent. At night, Luradune will burrow the rest of its body in the sand to attract and ambush small insects."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Luradune");

    }


}
