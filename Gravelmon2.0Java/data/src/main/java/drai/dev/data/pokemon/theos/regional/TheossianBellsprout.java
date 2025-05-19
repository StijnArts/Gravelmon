package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianBellsprout extends drai.dev.data.pokemon.Pokemon {
    public TheossianBellsprout(String name, Aspect aspect) {
        super(name, aspect, "Bellsprout",
                Type.GRASS, Type.DARK,
                new Stats(50,
                        75,
                        45,
                        60,
                        30,
                        40),
                List.of(Ability.INTIMIDATE), Ability.GLUTTONY,
                7, 40,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Bellsprout are much more vicious than other Bellsprout. Due to their darker nature, people try and avoid them as they're quick to lash out against anything that get close."),
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
           setLangFileName("Bellsprout");

    }


}
