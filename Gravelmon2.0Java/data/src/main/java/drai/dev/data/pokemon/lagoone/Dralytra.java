package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dralytra extends drai.dev.data.pokemon.Pokemon {
    public Dralytra() {
        super("Dralytra",
                Type.BUG,Type.DRAGON,
                new Stats(70,
                        68,
                        84,
                        138,
                        89,
                        101),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 132,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Dralytra");

    }


}
