package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Injectoplasm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Injectoplasm() {
        super("Injectoplasm",
                Type.POISON,Type.GHOST,
                new Stats(65,
                        100,
                        35,
                        130,
                        90,
                        60),
                List.of(Ability.POISON_POINT), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.6,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its body contains a woopertail of hideous bloodborne illnesses. Entire towns can be shut down because of Injectoplasm sightings."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Injectoplasm");

    }


}
