package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anewack extends drai.dev.data.pokemon.Pokemon {
    public Anewack() {
        super("Anewack",
                Type.POISON, Type.FIGHTING,
                new Stats(50,
                        50,
                        60,
                        50,
                        60,
                        30),
                List.of(Ability.DRY_SKIN), Ability.ROUGH_SKIN,
                5, 60,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its poison and strong tentacles are enough to ward off most predators, but when it needs it can dettach from the ocean floor and swim away from danger."),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Anewack");

    }


}
