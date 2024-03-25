package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kaisaos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kaisaos() {
        super("Kaisaos",
                Type.DARK,Type.PSYCHIC,
                new Stats(95,
                        115,
                        110,
                        200,
                        100,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                106, 8940,
                new Stats(1,0,0,2,0,0), 3,
                1.0,
                310, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It's core is pulsating with deranged energy, glitching everything around itself into a disorted mess. It's mere presence is a threat to the universe."),
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
           setLangFileName("Kaisaos");

    }


}
