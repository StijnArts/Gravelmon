package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mammahonia extends drai.dev.data.pokemon.Pokemon {
    public Mammahonia() {
        super("Mammahonia",
                Type.GRASS, Type.GROUND,
                new Stats(105,
                        95,
                        105,
                        80,
                        80,
                        60),
                List.of(Ability.OVERGROW), Ability.STURDY,
                24, 3723,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mammahonia");

    }


}
