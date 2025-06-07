package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yipho extends drai.dev.data.pokemon.Pokemon {
    public Yipho() {
        super("Yipho",
                Type.ROCK,Type.GROUND,
                new Stats(32,
                        53,
                        42,
                        21,
                        32,
                        65),
                List.of(Ability.TOUGH_CLAWS), Ability.GUTS,
                9, 200,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("An extinct mon from the days of early humans which lived in caves. In its time, no other mon could rival its digging and tracking abilities."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,10),
                        new MoveLearnSetEntry(Move.DIG,14),
                        new MoveLearnSetEntry(Move.ICE_FANG,17),
                        new MoveLearnSetEntry(Move.FIRE_FANG,17),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,21),
                        new MoveLearnSetEntry(Move.BULLDOZE,24),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,30)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Yipho");

    }


}
