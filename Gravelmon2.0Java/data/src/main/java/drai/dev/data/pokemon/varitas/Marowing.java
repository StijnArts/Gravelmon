package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Marowing extends drai.dev.data.pokemon.Pokemon {
    public Marowing(Stats stats) {
        super("Marowing",
                Type.DARK, Type.FLYING,
                stats,
                List.of(Ability.ROCK_HEAD,Ability.LIGHTNING_ROD,Ability.BATTLE_ARMOR), Ability.BATTLE_ARMOR,
                16, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(39).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Marowing");

    }


}
