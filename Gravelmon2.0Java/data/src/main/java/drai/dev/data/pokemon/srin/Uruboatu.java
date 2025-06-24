package drai.dev.data.pokemon.srin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Uruboatu extends drai.dev.data.pokemon.Pokemon {
    public Uruboatu(Stats stats) {
        super("Uruboatu",
                Type.COSMIC,Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                23, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(44).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
        setLangFileName("Uruboatu");

    }
}
