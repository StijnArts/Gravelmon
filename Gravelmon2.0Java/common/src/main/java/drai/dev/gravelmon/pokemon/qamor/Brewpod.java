package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Brewpod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brewpod() {
        super("Brewpod",
                Type.GROUND,Type.GRASS,
                new Stats(70,
                        20,
                        30,
                        30,
                        50,
                        20),
                List.of(Ability.CUTE_CHARM), Ability.SWEET_VEIL,
                8, 165,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Brewpod helped teach the Native Qamoran people how to cultivate the land and harvest a special bean that, when cultivated and prepared in specific ways, could produce a drink as potent as coffee or a food as rich as chocolate."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brewpod");

    }


}
