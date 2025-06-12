package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Statchamp extends drai.dev.data.pokemon.Pokemon {
    public Statchamp() {
        super("Statchamp",
                Type.ROCK,Type.FIGHTING,
                new Stats(100,
                        98,
                        112,
                        65,
                        60,
                        72),
                List.of(Ability.SOLID_ROCK,Ability.BATTLE_ARMOR), Ability.MOLD_BREAKER,
                17, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(40)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Statchamp");

    }


}
