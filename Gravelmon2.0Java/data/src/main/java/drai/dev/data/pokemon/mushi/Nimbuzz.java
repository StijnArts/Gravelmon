package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nimbuzz extends drai.dev.data.pokemon.Pokemon {
    public Nimbuzz() {
        super("Nimbuzz",
                Type.FLYING,Type.BUG,
                new Stats(50,
                        50,
                        45,
                        70,
                        40,
                        95),
                List.of(Ability.SHIELD_DUST,Ability.TINTED_LENS), Ability.SPEED_BOOST,
                9, 0,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

        setLangFileName("Nimbuzz");

    }


}
