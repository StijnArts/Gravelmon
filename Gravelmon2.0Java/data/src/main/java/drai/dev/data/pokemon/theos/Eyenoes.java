package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Eyenoes extends drai.dev.data.pokemon.Pokemon {
    public Eyenoes() {
        super("Eyenoes",
                Type.GHOST, Type.PSYCHIC,
                new Stats(100,
                        45,
                        70,
                        105,
                        100,
                        80),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.SHADOW_TAG,
                0, 0,
                new Stats(0,0,0,3,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Eyenoes have incredible vision, allowing them to partially see through walls. They are also able to sense the passing of those around and will shriek whenever someones time is up."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(39).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Eyenoes");

    }


}
