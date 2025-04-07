package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Twaddle extends drai.dev.data.pokemon.Pokemon {
    public Twaddle() {
        super("Twaddle",
                Type.WATER,
                new Stats(72,
                        57,
                        67,
                        88,
                        65,
                        66),
                List.of(Ability.TORRENT), Ability.TORRENT,
                8, 288,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                145, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Twaddle have an acute sense of loyalty to those who feed it and take care of it. If itself is challenged, it will battle as it usually would - however, if it's family is threatened, Twaddle will fight with unbridled might."),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Twaddle");

    }


}
