package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Murkreep extends drai.dev.data.pokemon.Pokemon {
    public Murkreep() {
        super("Murkreep",
                Type.DARK, Type.GRASS,
                new Stats(70,
                        106,
                        90,
                        80,
                        64,
                        110),
                List.of(Ability.STRONG_JAW), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Cry: skurleton"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAW_LOCK,1)                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Murkreep");

    }


}
