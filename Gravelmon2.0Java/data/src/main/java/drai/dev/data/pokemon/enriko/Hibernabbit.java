package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hibernabbit extends drai.dev.data.pokemon.Pokemon {
    public Hibernabbit() {
        super("Hibernabbit",
                Type.ICE, Type.GROUND,
                new Stats(108,
                        100,
                        80,
                        45,
                        56,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                23, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It sleeps throughout almost the entire year, only waking up on certain nights. Nobody has woken one up and survived."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,22),
                        new MoveLearnSetEntry(Move.ICY_WIND,29),
                        new MoveLearnSetEntry(Move.FREEZEDRY,36),
                        new MoveLearnSetEntry(Move.AFTER_YOU,43),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,50),
                        new MoveLearnSetEntry(Move.SWAGGER,57),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,64),
                        new MoveLearnSetEntry(Move.SHEER_COLD,71)                  ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(47)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hibernabbit");

    }


}
