package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pirambuouy extends drai.dev.data.pokemon.Pokemon {
    public Pirambuouy() {
        super("Pirambuouy",
                Type.ELECTRIC, Type.WATER,
                new Stats(76,
                        65,
                        80,
                        90,
                        104,
                        60),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Supersonic Normal WhirlpoolSTAB Water Muddy WaterSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pirambuouy");

    }


}
