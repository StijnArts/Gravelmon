package drai.dev.data.pokemon.olysos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class OlysosianBuneary extends drai.dev.data.pokemon.Pokemon {
    public OlysosianBuneary(String name, Aspect aspect) {
        super(name, aspect, "Buneary",
                Type.ICE,Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CUTE_CHARM), Ability.REFRIGERATE,
                4, 55,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Having adapted to the cold harsh environment of the colder regions, they mostly use their frosty fur as a easy defense against their opponents."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Buneary");

    }


}
