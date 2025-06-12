package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Convice extends drai.dev.data.pokemon.Pokemon {
    public Convice() {
        super("Convice",
                Type.DARK,Type.NORMAL,
                new Stats(80,
                        105,
                        55,
                        45,
                        45,
                        95),
                List.of(Ability.RUN_AWAY,Ability.RATTLED), Ability.TECHNICIAN,
                13, 0,
                new Stats(0,1,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Convice");

    }


}
