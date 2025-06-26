package drai.dev.data.pokemon.urzavos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ferneurosis extends drai.dev.data.pokemon.Pokemon {
    public Ferneurosis(Stats stats) {
        super("Ferneurosis",
                Type.GRASS, Type.PSYCHIC,
                stats,
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
        setLangFileName("Ferneurosis");

    }
}
