package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clonector extends drai.dev.data.pokemon.Pokemon {
    public Clonector() {
        super("Clonector",
                Type.BUG,Type.FLYING,
                new Stats(50,
                        50,
                        60,
                        85,
                        60,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                146, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Clonector resembles a variety of bee and wasp Pokemon, however it is unable to sting its opponent. Its colours deter predators, allowing it to forage for food freely."),
                List.of(),
                List.of(
                ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH)
                        .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Clonector");

    }


}
