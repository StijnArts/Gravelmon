package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kitteepy extends drai.dev.data.pokemon.Pokemon {
    public Kitteepy() {
        super("Kitteepy",
                Type.NORMAL,
                new Stats(76,
                        65,
                        77,
                        55,
                        60,
                        30),
                List.of(Ability.TRUANT), Ability.TRUANT,
                5, 0,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("groggymog", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:awakening")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Kitteepy");

    }


}
