package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fortregon extends drai.dev.data.pokemon.Pokemon {
    public Fortregon() {
        super("Fortregon",
                Type.DRAGON,Type.NORMAL,
                new Stats(60,
                        95,
                        145,
                        85,
                        70,
                        60),
                List.of(Ability.BATTLE_ARMOR), Ability.MULTISCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Fortregon's rock-hard hide is nearly impenetrable. With wings spread, the sheer, glass-like membrane catches light and glows."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,5),
                        new MoveLearnSetEntry(Move.HARDEN,8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,14),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,27),
                        new MoveLearnSetEntry(Move.POWER_GEM,32),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,44),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,48),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,53),
                        new MoveLearnSetEntry(Move.MOLTENDEFENSE,57),
                        new MoveLearnSetEntry(Move.PROTECT,65),
                        new MoveLearnSetEntry(Move.STONE_EDGE,69)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fortregon");

    }


}
