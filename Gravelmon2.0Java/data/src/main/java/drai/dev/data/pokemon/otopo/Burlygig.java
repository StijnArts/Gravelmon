package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Burlygig extends drai.dev.data.pokemon.Pokemon {
    public Burlygig() {
        super("Burlygig",
                Type.GRASS,
                new Stats(70,
                        45,
                        70,
                        85,
                        60,
                        40),
                List.of(Ability.POWERLEECH,Ability.DRY_SKIN), Ability.OVERGROW,
                0, 0,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("When it evolves, it keeps its enormous leaves, which help it defend itself against flying Pokémon. It can move about, however it attempts to move as little as possible owing to the energy necessary to evolve."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.BULLET_SEED,12),
                        new MoveLearnSetEntry(Move.GROWTH,14),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.SLAM,18),
                        new MoveLearnSetEntry(Move.SWIFT,20),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,32),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,45)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Burlygig");

    }


}
