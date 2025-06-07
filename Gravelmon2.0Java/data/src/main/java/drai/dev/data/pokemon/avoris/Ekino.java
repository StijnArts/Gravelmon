package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ekino extends drai.dev.data.pokemon.Pokemon {
    public Ekino() {
        super("Ekino",
                Type.WATER,
                new Stats(60,
                        65,
                        40,
                        55,
                        45,
                        50),
                List.of(Ability.TORRENT), Ability.TORRENT,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Ekino are very well known to be courteous to people and Pokemon. They are high intelligent and want to impress their trainers. However, if they feel like a disappointment they will go hide and cry. When threatened, spikes come out their arms and they prepare to attack."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ekino");

    }


}
