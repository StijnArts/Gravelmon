package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dredgen extends Pokemon {
    public Dredgen() {
        super("Dredgen",
                Type.GROUND,
                new Stats(75,
                        115,
                        110,
                        65,
                        70,
                        90),
                List.of(Ability.INTIMIDATE, Ability.FILTER), Ability.DUST_DEVIL,
                15, 365,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Dredgen break rocks into bite-sized bits with their shovel-like tail, which they also do when combating opponent Gigalith. They enjoy sunbathing and cleaning themselves in the dust, making them some of the cleanest ground pokemon!"),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
