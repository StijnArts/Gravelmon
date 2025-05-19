package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Perlusc extends drai.dev.data.pokemon.Pokemon {
    public Perlusc() {
        super("Perlusc",
                Type.FAIRY, Type.WATER,
                new Stats(47,
                        43,
                        65,
                        45,
                        38,
                        92),
                List.of(Ability.HYDRATION), Ability.SHELL_ARMOR,
                6, 200,
                new Stats(0,0,1,0,0,0), 225,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Perlusc live in shallow seas in the tropical regions of Otopo. Incredibly shy, it does its best to camouflage into its surroundings. People harvest the pearls it makes and gift them to those they love."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,8),
                        new MoveLearnSetEntry(Move.LEER,12),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,16),
                        new MoveLearnSetEntry(Move.SUPERSONIC,20),
                        new MoveLearnSetEntry(Move.SWEET_KISS,24),
                        new MoveLearnSetEntry(Move.PROTECT,28),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,50),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,53)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Perlusc");

    }


}
