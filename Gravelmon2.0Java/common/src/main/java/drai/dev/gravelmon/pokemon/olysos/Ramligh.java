package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ramligh extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ramligh() {
        super("Ramligh",
                Type.FIRE,
                new Stats(64,
                        46,
                        50,
                        95,
                        84,
                        65),
                List.of(Ability.BLAZE), Ability.STATIC,
                9, 200,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("A lofty Pokémon, mostly because of it's wool's appearance. And because of that they mostly keep distance to water and rain."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ramligh");

    }


}
