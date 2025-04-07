package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quokkute extends drai.dev.data.pokemon.Pokemon {
    public Quokkute() {
        super("Quokkute",
                Type.FAIRY,
                new Stats(160,
                        10,
                        50,
                        120,
                        50,
                        60),
                List.of(Ability.CUTE_CHARM,Ability.FRIEND_GUARD), Ability.PIXILATE,
                15, 140,
                new Stats(3,0,0,0,0,0), 190,
                0.5,
                151, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Quokkute are the most affectionate of all Pokemon, and once they form a relationship with a trainer, they would never abandon them."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Quokkute");

    }


}
