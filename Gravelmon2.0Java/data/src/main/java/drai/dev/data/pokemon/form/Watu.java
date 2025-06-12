package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Watu extends drai.dev.data.pokemon.Pokemon {
    public Watu() {
        super("Watu",
                Type.NORMAL,Type.WATER,
                new Stats(79,
                        101,
                        71,
                        83,
                        71,
                        63),
                List.of(Ability.WATER_ABSORB), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Watu");

    }


}
