package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Porscythe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Porscythe() {
        super("Porscythe",
                Type.STEEL,Type.DARK,
                new Stats(55,
                        110,
                        70,
                        80,
                        60,
                        105),
                List.of(Ability.SWIFT_SWIM), Ability.DEFIANT,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Porposcythe swim in the ocean at high speeds, using this to their advantage. Using their cunning but cruel intellect, they slash through prey or incoming threats using their blade-like mouth."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Porscythe");

    }


}
