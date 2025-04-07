package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Arveeny extends drai.dev.data.pokemon.Pokemon {
    public Arveeny() {
        super("Arveeny",
                Type.NORMAL,
                new Stats(52,
                        69,
                        30,
                        30,
                        39,
                        70),
                List.of(Ability.RUN_AWAY,Ability.PICKUP), Ability.CHEEK_POUCH,
                0, 0,
                new Stats(0,0,0,0,0,1), 255,
                0.75,
                58, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Lemmini are extremely small, making them difficult to capture. It has been said that Lemmini accidently fall of cliffs."),
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
           setLangFileName("Arveeny");

    }


}
