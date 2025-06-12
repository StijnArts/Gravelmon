package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peppercoon extends drai.dev.data.pokemon.Pokemon {
    public Peppercoon() {
        super("Peppercoon",
                Type.FIRE,
                new Stats(40,
                        55,
                        40,
                        70,
                        50,
                        60),
                List.of(Ability.BLAZE), Ability.RECKLESS,
                7, 0,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("he source of Peppercoon's firey attacks come from its bushy tail, which glows a bright amber as it heats up. Trainers often have a hard time keeping a Peppercoons as they are always running off to explore their surroundings."),
                List.of(new EvolutionEntry("krakoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Peppercoon");

    }


}
