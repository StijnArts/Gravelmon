package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianSkiploom extends drai.dev.data.pokemon.Pokemon {
    public TheossianSkiploom(String name, Aspect aspect) {
        super(name, aspect, "Skiploom",
                Type.GROUND, Type.GRASS,
                new Stats(80,
                        45,
                        50,
                        45,
                        65,
                        55),
                List.of(Ability.UNNERVE,Ability.HARVEST), Ability.DRY_SKIN,
                10, 4,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Skiploom have hallow bodies filled with straw. They can often be seen jumping through the fields of farms."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Skiploom");

    }


}
