package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Comictini extends drai.dev.data.pokemon.Pokemon {
    public Comictini() {
        super("Comictini",
                Type.WATER,Type.POISON,
                new Stats(70,
                        100,
                        70,
                        100,
                        105,
                        80),
                List.of(Ability.TORRENT), Ability.HUSTLE,
                19, 0,
                new Stats(0,1,0,0,2,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Comictini");

    }


}
