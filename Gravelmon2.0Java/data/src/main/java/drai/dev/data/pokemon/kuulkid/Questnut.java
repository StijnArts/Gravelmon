package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Questnut extends drai.dev.data.pokemon.Pokemon {
    public Questnut() {
        super("Questnut",
                Type.GRASS,
                new Stats(60,
                        30,
                        60,
                        25,
                        30,
                        55),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                3, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("barbalmond", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"minecraft:goat_horn"),
                        new EvolutionEntry("naturaecorn", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"minecraft:spider_eye"),
                        new EvolutionEntry("priestachio", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:lum_berry")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Questnut");

    }


}
