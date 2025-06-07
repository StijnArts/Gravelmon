package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Drazephir extends drai.dev.data.pokemon.Pokemon {
    public Drazephir() {
        super("Drazephir",
                Type.PSYCHIC, Type.FLYING,
                new Stats(80,
                        120,
                        80,
                        140,
                        60,
                        120),
                List.of(Ability.PRESSURE), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A Pokemon spoken about in folklore where it controls winds. Some locals believe windy days mean Drazephir is very active and playful, while strong winds are seen as warning signs of incoming danger. It guards the sky over the islands."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Drazephir");

    }


}
