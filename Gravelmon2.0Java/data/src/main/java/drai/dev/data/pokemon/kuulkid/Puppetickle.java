package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Puppetickle extends drai.dev.data.pokemon.Pokemon {
    public Puppetickle() {
        super("Puppetickle",
                Type.FAIRY,Type.FIGHTING,
                new Stats(63,
                        65,
                        44,
                        40,
                        42,
                        62),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                5, 0,
                new Stats(0,1,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("monstermash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Puppetickle");

    }


}
