package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Herculeo extends drai.dev.data.pokemon.Pokemon {
    public Herculeo() {
        super("Herculeo",
                Type.GRASS, Type.FIGHTING,
                new Stats(75,
                        125,
                        85,
                        75,
                        75,
                        100),
                List.of(Ability.OVERGROW), Ability.DEFIANT,
                20, 1500,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Wild Herculeo have been recorded holding tournament-style battles, where Pokémon compete to become the jungle champion."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Herculeo");

    }


}
