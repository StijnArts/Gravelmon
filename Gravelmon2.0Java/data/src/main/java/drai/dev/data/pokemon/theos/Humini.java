package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Humini extends drai.dev.data.pokemon.Pokemon {
    public Humini() {
        super("Humini",
                Type.BUG,Type.FAIRY,
                new Stats(40,
                        45,
                        40,
                        55,
                        40,
                        85),
                List.of(Ability.HONEY_GATHER,Ability.SHIELD_DUST), Ability.INFILTRATOR,
                5, 17,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Humini");

    }


}
