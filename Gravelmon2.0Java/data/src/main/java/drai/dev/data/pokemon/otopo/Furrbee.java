package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Furrbee extends drai.dev.data.pokemon.Pokemon {
    public Furrbee() {
        super("Furrbee",
                Type.BUG, Type.FLYING,
                new Stats(90,
                        50,
                        60,
                        85,
                        60,
                        50),
                List.of(Ability.HONEY_GATHER), Ability.HONEY_GATHER,
                8, 0,
                new Stats(1,0,0,1,0,0), 110,
                0.5,
                138, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("According to several Pokefans, Furrbee make the greatest pollen of all Pokémon. Pollen from Furrbee is utilised in both human and Pokémon dishes."),
                List.of(),
                List.of(),
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
           setLangFileName("Furrbee");

    }


}
