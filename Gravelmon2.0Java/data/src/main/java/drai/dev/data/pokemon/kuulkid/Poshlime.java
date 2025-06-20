package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Poshlime extends drai.dev.data.pokemon.Pokemon {
    public Poshlime() {
        super("Poshlime",
                Type.POISON,
                new Stats(86,
                        77,
                        75,
                        84,
                        75,
                        58),
                List.of(Ability.GOOEY,Ability.EFFECT_SPORE), Ability.POWEROFALCHEMY,
                10, 0,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Poshlime");

    }


}
