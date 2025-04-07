package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranUrsaring extends drai.dev.data.pokemon.Pokemon {
    public NodorranUrsaring(String name, Aspect aspect) {
        super(name, aspect, "Ursaring",
                Type.NORMAL, Type.FIGHTING,
                new Stats(100,
                        135,
                        81,
                        59,
                        70,
                        55),
                List.of(Ability.GUTS,Ability.TOUGH_CLAWS), Ability.ADAPTABILITY,
                18, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ursaring");

    }


}
