package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dinomond extends drai.dev.data.pokemon.Pokemon {
    public Dinomond() {
        super("Dinomond",
                Type.ROCK, Type.DRAGON,
                new Stats(70,
                        120,
                        100,
                        50,
                        100,
                        70),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,3,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Though sought-after by poachers for the gemstones pretruding from it's body, Dinomond have more than enough strength to defend themselves."),
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
           setLangFileName("Dinomond");

    }


}
