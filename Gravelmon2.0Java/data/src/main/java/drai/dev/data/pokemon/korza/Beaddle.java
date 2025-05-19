package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Beaddle extends drai.dev.data.pokemon.Pokemon {
    public Beaddle() {
        super("Beaddle",
                Type.WATER,
                new Stats(90,
                        100,
                        80,
                        70,
                        80,
                        80),
                List.of(Ability.THICK_FAT,Ability.STRONG_JAW), Ability.SIMPLE,
                10, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Best known for their large dams, built from trees chewed down using their large teeth. Beaddle's tail functions as an all-in-one building tool, as well as a rudder as they swim."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUASLAP,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.AQUA_RING,6),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.AQUA_JET,16),
                        new MoveLearnSetEntry(Move.ICE_FANG,20),
                        new MoveLearnSetEntry(Move.DIVE,25),
                        new MoveLearnSetEntry(Move.HEADBUTT,29),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,33),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,38),
                        new MoveLearnSetEntry(Move.BULK_UP,43),
                        new MoveLearnSetEntry(Move.CRUNCH,47),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,52),
                        new MoveLearnSetEntry(Move.WATERFALL,58),
                        new MoveLearnSetEntry(Move.SLACK_OFF,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Beaddle");

    }


}
