package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Guillie extends drai.dev.data.pokemon.Pokemon {
    public Guillie() {
        super("Guillie",
                Type.WATER,
                new Stats(60,
                        45,
                        45,
                        55,
                        65,
                        45),
                List.of(Ability.TORRENT), Ability.STORM_DRAIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It splashes around it puddles it creates, messing around with Pokémon and Humans alike. On hot summer days, they usually are found relaxing near lakes to cool down."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Guillie");

    }


}
