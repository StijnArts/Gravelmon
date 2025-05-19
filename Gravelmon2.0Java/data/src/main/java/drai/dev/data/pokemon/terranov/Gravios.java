package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gravios extends drai.dev.data.pokemon.Pokemon {
    public Gravios() {
        super("Gravios",
                Type.ROCK, Type.FIRE,
                new Stats(105,
                        100,
                        150,
                        90,
                        75,
                        45),
                List.of(Ability.STURDY), Ability.STURDY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite having large wings its only capable of limited flight due to its weight. Its stone armor deflects most blows and allows it to swim freely inside molten magma."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gravios");

    }


}
