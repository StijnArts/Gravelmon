package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snowbull extends drai.dev.data.pokemon.Pokemon {
    public Snowbull() {
        super("Snowbull",
                Type.ICE,
                new Stats(50,
                        57,
                        65,
                        51,
                        30,
                        32),
                List.of(Ability.STRONGSTART), Ability.STRONGSTART,
                9, 0,
                new Stats(0,0,1,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("abominabull", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"minecraft:iron_helmet")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Snowbull");

    }


}
