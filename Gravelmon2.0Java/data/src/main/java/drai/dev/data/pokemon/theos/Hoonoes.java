package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hoonoes extends drai.dev.data.pokemon.Pokemon {
    public Hoonoes() {
        super("Hoonoes",
                Type.GHOST,
                new Stats(60,
                        30,
                        45,
                        65,
                        60,
                        50),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.LEVITATE,
                10, 5,
                new Stats(0,0,0,1,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoonoes like to hide in the shadows making loud noises to scare people passing by. It's said they can fortell when someone will die."),
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
           setLangFileName("Hoonoes");

    }


}
