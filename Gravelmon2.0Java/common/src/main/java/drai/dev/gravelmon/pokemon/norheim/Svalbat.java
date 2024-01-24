package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Svalbat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Svalbat() {
        super("Svalbat",
                Type.DARK,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FOREWARN,Ability.SECRETINSIGHT,Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This flightless cave dweller lacks vision, just like Zubat. Navigating through narrow paths with the help of sound, Svalbat creates eerie noises by lifting its wing like arms up and down. In return, the sound reverbs, causing long lasting echoes. Not my proudest of faps."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Svalbat");

    }


}
