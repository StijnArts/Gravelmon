package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toxipine extends drai.dev.data.pokemon.Pokemon {
    public Toxipine() {
        super("Toxipine",
                Type.POISON,
                new Stats(60,
                        40,
                        50,
                        30,
                        45,
                        50),
                List.of(Ability.POISON_POINT,Ability.RUN_AWAY), Ability.TOXIC_BOOST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It glides around the woodland floor, gathering up berries as it goes. Despite its little size, its toxin is quite lethal."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Toxipine");

    }


}
