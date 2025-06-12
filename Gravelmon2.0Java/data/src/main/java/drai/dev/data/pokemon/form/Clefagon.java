package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clefagon extends drai.dev.data.pokemon.Pokemon {
    public Clefagon() {
        super("Clefagon",
                Type.FAIRY,Type.DRAGON,
                new Stats(85,
                        45,
                        73,
                        105,
                        100,
                        73),
                List.of(Ability.SERENE_GRACE), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Clefagon");

    }


}
