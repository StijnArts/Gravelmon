package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Seedlee extends drai.dev.data.pokemon.Pokemon {
    public Seedlee() {
        super("Seedlee",
                Type.GRASS,
                new Stats(70,
                        30,
                        70,
                        50,
                        70,
                        20),
                List.of(Ability.RATTLED), Ability.EFFECT_SPORE,
                3, 18,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Seedlee are easily scared, and will often disguise themselves as plant sprouts when sensing anyone nearby. They can release a potent scent from their petals if predators get too close."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Seedlee");

    }


}
