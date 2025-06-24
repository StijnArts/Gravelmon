package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jackajolt extends drai.dev.data.pokemon.Pokemon {
    public Jackajolt() {
        super("Jackajolt",
                Type.ELECTRIC,
                new Stats(35,
                        45,
                        40,
                        80,
                        40,
                        140),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,2), 70,
                0.5,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is readily stimulated, prompting it to rush off at high rates. When it is startled, it discharges a burst of electrical energy."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(14).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Jackajolt");

    }


}
