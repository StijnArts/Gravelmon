package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Astronet extends drai.dev.data.pokemon.Pokemon {
    public Astronet() {
        super("Astronet",
                Type.FIRE,Type.ELECTRIC,
                new Stats(65,
                        124,
                        68,
                        55,
                        58,
                        115),
                List.of(Ability.RECKLESS,Ability.BLAZE), Ability.LEVITATE,
                14, 0,
                new Stats(0,2,0,0,0,0), 100,
                0.5,
                166, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Astronet");

    }


}
