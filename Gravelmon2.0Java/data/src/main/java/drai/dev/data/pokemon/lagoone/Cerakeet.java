package drai.dev.data.pokemon.lagoone;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cerakeet extends drai.dev.data.pokemon.Pokemon {
    public Cerakeet() {
        super("Cerakeet",
                Type.FLYING,
                new Stats(72,
                        65,
                        115,
                        65,
                        94,
                        54),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 20,
                new Stats(0,0,2,0,0,0), 70,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setLangFileName("Cerakeet");

    }
}
