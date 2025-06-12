package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Elesmoduct extends drai.dev.data.pokemon.Pokemon {
    public Elesmoduct(Stats stats) {
        super("Elesmoduct",
                Type.WATER,Type.ELECTRIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                38, 3240,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("It's rarely seen due to its deep-diving lifestyle. The electricity in its neck intensifies when it's close to finding prey hiding in the seabed, focusing into its jaws to allow it to deliver a deadly, paralyzing bite."),
                List.of(),
                List.of(
                                                ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
