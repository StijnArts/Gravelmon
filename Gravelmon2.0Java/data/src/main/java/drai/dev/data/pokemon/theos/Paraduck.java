package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Paraduck extends drai.dev.data.pokemon.Pokemon {
    public Paraduck() {
        super("Paraduck",
                Type.FLYING, Type.GRASS,
                new Stats(60,
                        50,
                        70,
                        95,
                        100,
                        65),
                List.of(Ability.RAIN_DISH,Ability.OWN_TEMPO), Ability.OVERCOAT,
                12, 242,
                new Stats(0,0,0,0,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Paraduck love the rain but dislike getting wet. They use large fallen leaves as umbrellas, sitting outside during storms."),
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
           setLangFileName("Paraduck");

    }


}
