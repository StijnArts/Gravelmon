package drai.dev.data.pokemon.urzavos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chompupi extends drai.dev.data.pokemon.Pokemon {
    public Chompupi() {
        super("Chompupi",
                Type.STEEL,Type.GHOST,
                new Stats(40,
                        60,
                        80,
                        55,
                        30,
                        35),
                List.of(Ability.ROUGH_SKIN,Ability.FILTER), Ability.STRONG_JAW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setLangFileName("Chompupi");

    }
}
