package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Subserow extends drai.dev.data.pokemon.Pokemon {
    public Subserow(Stats stats) {
        super("Subserow",
                Type.ICE,Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Triple Kick (N)STAB Fighting - Triple Axel (N)STAB Ice - Jump KickSTAB Fighting - High Jump KickSTAB Fighting - Double Kick (N)STAB Fighting - Ice ShardSTAB Ice - Megahorn Bug - Smart Strike Steel - Mist (N) Ice - Snowscape Ice - Horn Attack Normal - Bulk Up Fighting - Head Charge Normal - Scary Face Normal - Leer Normal - Sheer ColdSTAB Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,1),
                        new MoveLearnSetEntry(Move.SHEER_COLD,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,1),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,1)                        ),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Subserow");

    }


}
