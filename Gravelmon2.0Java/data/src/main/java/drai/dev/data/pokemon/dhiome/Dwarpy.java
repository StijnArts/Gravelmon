package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dwarpy extends drai.dev.data.pokemon.Pokemon {
    public Dwarpy() {
        super("Dwarpy",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.PICKUP,Ability.SUPER_LUCK), Ability.UNAWARE,
                6, 178,
                new Stats(0,1,0,0,0,0), 240,
                0.5,
                34, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Lucky are those who can grasp the golden tip of its tail. They gather near places where treasure is found."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dwarpy");

    }


}
