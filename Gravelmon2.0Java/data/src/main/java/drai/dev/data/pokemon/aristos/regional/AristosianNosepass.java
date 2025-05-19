package drai.dev.data.pokemon.aristos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class AristosianNosepass extends drai.dev.data.pokemon.Pokemon {
    public AristosianNosepass(String name, Aspect aspect) {
        super(name, aspect,"AristosianNosepass",
                Type.ROCK, Type.GRASS,
                new Stats(30,
                        45,
                        135,
                        45,
                        90,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.0,
                75, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nosepass");

    }


}
