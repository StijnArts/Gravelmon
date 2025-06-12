package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Potthos extends drai.dev.data.pokemon.Pokemon {
    public Potthos() {
        super("Potthos",
                Type.GROUND,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(), null,
                5, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("gardelem", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:peat_block")),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_ARID)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Potthos");

    }


}
