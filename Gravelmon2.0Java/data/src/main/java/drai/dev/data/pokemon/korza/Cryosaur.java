package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cryosaur extends drai.dev.data.pokemon.Pokemon {
    public Cryosaur() {
        super("Cryosaur",
                Type.ICE,
                new Stats(60,
                        100,
                        115,
                        60,
                        80,
                        70),
                List.of(Ability.SNOWPLOW), Ability.ICE_BODY,
                19, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With a streamlined stomach, this mon can easily slide over snow and ice and pack it down. Cryosaur stores ice inside its highly insulated tail to keep cool in warm weather."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.ICE_BALL,7),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,12),
                        new MoveLearnSetEntry(Move.ICE_FANG,16),
                        new MoveLearnSetEntry(Move.SCREECH,20),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,23),
                        new MoveLearnSetEntry(Move.ICE_SHARD,26),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,31),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,37),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,42),
                        new MoveLearnSetEntry(Move.REST,46),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,50)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cryosaur");

    }


}
