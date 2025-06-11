package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pestileon extends drai.dev.data.pokemon.Pokemon {
    public Pestileon(Stats stats) {
        super("Pestileon",
                Type.GHOST, Type.POISON,
                stats,
                List.of(Ability.POISON_TOUCH), Ability.CURSED_BODY,
                9, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("If you ever stumble across a Pestileon in the desert night or inside an old crypt, you are in bad luck. This Pokémon will always point you in the wrong direction with its long, pointy ears. Spending too much time with Pestileon will make you very sick. It is highly associated with plagues and is often the cause behind them."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Pestileon");

    }


}
