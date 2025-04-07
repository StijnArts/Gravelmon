package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hedgeheat extends drai.dev.data.pokemon.Pokemon {
    public Hedgeheat() {
        super("Hedgeheat",
                Type.FIRE, Type.GRASS,
                new Stats(60,
                        40,
                        80,
                        40,
                        50,
                        30),
                List.of(Ability.FLASH_FIRE,Ability.FLAME_BODY), Ability.IRON_BARBS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hedgeheat");

    }


}
