package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skoopy extends drai.dev.data.pokemon.Pokemon {
    public Skoopy() {
        super("Skoopy",
                Type.ICE, Type.FAIRY,
                new Stats(50,
                        50,
                        35,
                        85,
                        85,
                        45),
                List.of(Ability.ICE_BODY), Ability.MAGIC_GUARD,
                3, 11,
                new Stats(0,0,0,1,0,0), 0,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of("These Pokemon love practicing their magic, often freezing anything they can find. Whilst their magic is annoying to some, it can be very useful during hot summer days."),
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
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Skoopy");

    }


}
