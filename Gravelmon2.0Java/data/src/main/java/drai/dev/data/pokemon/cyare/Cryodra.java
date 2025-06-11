package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cryodra extends drai.dev.data.pokemon.Pokemon {
    public Cryodra() {
        super("Cryodra",
                Type.ICE, Type.DRAGON,
                new Stats(142,
                        73,
                        79,
                        82,
                        79,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                22, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cryodra occasionally emit a soft aura containg the seven colours of the rainbow. It is said that they are able to create massive auroras during the night."),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_FROZEN_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Cryodra");

    }


}
