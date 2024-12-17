package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bubupole extends drai.dev.data.pokemon.Pokemon {
    public Bubupole() {
        super("Bubupole",
                Type.FIRE, Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Bubupole resides in craters with boiling hot water. In case of a steam eruption, they become extremely hot and usually land in the ocean. Its caudal fin controls the air flow while being airborn."),
                List.of(new EvolutionEntry("geohertoad", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 5, 26, 4.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_VOLCANIC, Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Bubupole");

    }


}
