package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Echolite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Echolite() {
        super("Echolite",
                Type.ELECTRIC,Type.FLYING,
                new Stats(37,
                        30,
                        41,
                        60,
                        52,
                        95),
                List.of(Ability.ILLUMINATE), Ability.ADAPTABILITY,
                6, 50,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("They emit a bright light from their bodies. The inside of dark caves where groups of Echolite hang on ceillings look like beautiful starry night skies."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Echolite");

    }


}
