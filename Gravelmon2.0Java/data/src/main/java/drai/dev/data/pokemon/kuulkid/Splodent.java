package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Splodent extends drai.dev.data.pokemon.Pokemon {
    public Splodent() {
        super("Splodent",
                Type.NORMAL,Type.FIRE,
                new Stats(50,
                        60,
                        50,
                        78,
                        53,
                        89),
                List.of(Ability.AFTERMATH), Ability.AFTERMATH,
                4, 0,
                new Stats(0,0,0,1,0,1), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_BASALT)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Splodent");

    }


}
