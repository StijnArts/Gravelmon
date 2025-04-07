package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blokkead extends drai.dev.data.pokemon.Pokemon {
    public Blokkead() {
        super("Blokkead",
                Type.ROCK, Type.NORMAL,
                new Stats(100,
                        80,
                        100,
                        50,
                        80,
                        40),
                List.of(Ability.ROCK_HEAD), Ability.UNAWARE,
                8, 0,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Blokkead");

    }


}
