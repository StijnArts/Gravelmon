package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Binchickin extends drai.dev.data.pokemon.Pokemon {
    public Binchickin() {
        super("Binchickin",
                Type.POISON,
                new Stats(32,
                        46,
                        55,
                        35,
                        46,
                        50),
                List.of(Ability.TRASHGUARD), Ability.TRASHGUARD,
                7, 0,
                new Stats(0,0,1,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Skittish by nature, these pokemon will scrounge up the scraps left by people and other pokemon. They are most common in urban areas and landfills."),
                List.of(new EvolutionEntry("garbagegutz", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:metal_coat")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Binchickin");

    }


}
