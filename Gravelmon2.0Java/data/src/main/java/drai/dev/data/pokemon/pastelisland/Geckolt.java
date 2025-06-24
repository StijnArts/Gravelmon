package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geckolt extends drai.dev.data.pokemon.Pokemon {
    public Geckolt() {
        super("Geckolt",
                Type.GRASS, Type.ELECTRIC,
                new Stats(90,
                        60,
                        65,
                        110,
                        120,
                        85),
                List.of(Ability.OVERGROW), Ability.MOTOR_DRIVE,
                18, 548,
                new Stats(0,0,0,2,1,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("These Pokémon are often seen on the forest floors, running at high speeds and generating sparks as they move. Their electrical blasts are deadly, to say the least."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Geckolt");

    }


}
