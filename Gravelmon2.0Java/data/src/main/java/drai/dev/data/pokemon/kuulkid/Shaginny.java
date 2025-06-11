package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shaginny extends drai.dev.data.pokemon.Pokemon {
    public Shaginny() {
        super("Shaginny",
                Type.NORMAL,
                new Stats(50,
                        55,
                        35,
                        30,
                        35,
                        60),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                3, 0,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The tangled, upkept formation of their fur makes Shaginnies exceedingly hard to groom. These pokemon are often prone to skin problems because of their inability to access the skin underneath their hair."),
                List.of(new EvolutionEntry("cavicurl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shaginny");

    }


}
