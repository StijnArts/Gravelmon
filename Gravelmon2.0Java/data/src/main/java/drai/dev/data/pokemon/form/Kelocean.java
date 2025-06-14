package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kelocean extends drai.dev.data.pokemon.Pokemon {
    public Kelocean() {
        super("Kelocean",
                Type.WATER,
                new Stats(67,
                        87,
                        84,
                        63,
                        67,
                        121),
                List.of(Ability.SEAWALK), null,
                23, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(40)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanWalkOnWater(true);
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Kelocean");

    }


}
