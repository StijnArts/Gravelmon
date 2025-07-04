package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roostuff extends drai.dev.data.pokemon.Pokemon {
    public Roostuff() {
        super("Roostuff",
                Type.FIGHTING, Type.FLYING,
                new Stats(80,
                        120,
                        85,
                        50,
                        70,
                        75),
                List.of(Ability.INNER_FOCUS), Ability.DEFIANT,
                13, 180,
                new Stats(0,2,0,0,0,0), 70,
                1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE, Biome.IS_ARID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Roostuff");

    }


}
