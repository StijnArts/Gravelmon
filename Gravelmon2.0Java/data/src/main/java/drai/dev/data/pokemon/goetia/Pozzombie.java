package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pozzombie extends drai.dev.data.pokemon.Pokemon {
    public Pozzombie(Stats stats) {
        super("Pozzombie",
                Type.NORMAL, Type.GHOST,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It comes out at night to rummage through garbage. When in danger, all signs of life vanish from its body only for it to get back on its feet and walk away when scavengers come."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Pozzombie");

    }


}
