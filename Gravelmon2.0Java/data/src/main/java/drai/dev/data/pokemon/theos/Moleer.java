package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moleer extends drai.dev.data.pokemon.Pokemon {
    public Moleer() {
        super("Moleer",
                Type.GROUND,
                new Stats(60,
                        65,
                        60,
                        30,
                        45,
                        70),
                List.of(Ability.INSOMNIA), Ability.SAND_FORCE,
                5, 85,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Moleer have very poor eye sight and rely on their sense of smell to know their surroundings. Their tough claws allow them to break through rock with ease."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Moleer");

    }


}
