package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geminie extends drai.dev.data.pokemon.Pokemon {
    public Geminie() {
        super("Geminie",
                Type.PSYCHIC,Type.ROCK,
                new Stats(70,
                        102,
                        122,
                        53,
                        65,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 167,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

        setLangFileName("Geminie");

    }


}
