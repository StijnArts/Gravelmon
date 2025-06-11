package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gremelon extends drai.dev.data.pokemon.Pokemon {
    public Gremelon() {
        super("Gremelon",
                Type.GRASS, Type.DARK,
                new Stats(55,
                        90,
                        60,
                        55,
                        40,
                        50),
                List.of(Ability.PICKPOCKET), Ability.PRANKSTER,
                5, 104,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                70, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokémon is incredibly sneaky, often pretending to be a normal melon, then popping out and tripping its victim using vines!"),
                List.of(),
                List.of(

                ),
                List.of(Label.ENJIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SUMMER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Gremelon");

    }


}
