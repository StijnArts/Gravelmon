package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geohertoad extends drai.dev.data.pokemon.Pokemon {
    public Geohertoad() {
        super("Geohertoad",
                Type.FIRE, Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its body is covered by lightweight lava rock, making it possible for Geohertoad to ascend to the surface. Beware, S.S. Cactus."),
                List.of(new EvolutionEntry("phrynotoad", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 20, 41, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_VOLCANIC, Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Geohertoad");

    }


}
