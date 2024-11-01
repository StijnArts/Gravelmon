package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Heliwisp extends drai.dev.data.pokemon.Pokemon {
    public Heliwisp() {
        super("Heliwisp",
                Type.GHOST,Type.GRASS,
                new Stats(23,
                        35,
                        30,
                        52,
                        43,
                        52),
                List.of(Ability.LEAF_GUARD), Ability.PINWHEEL,
                2, 1,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                47, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("This pokemon is perpetually spinning through the air. The 'face' is actually a false husk on top of the true body."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Heliwisp");

    }


}
