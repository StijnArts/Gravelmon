package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Blizzarcher extends drai.dev.data.pokemon.Pokemon {
    public Blizzarcher() {
        super("Blizzarcher",
                Type.ICE, Type.GHOST,
                new Stats(44,
                        45,
                        56,
                        123,
                        67,
                        123),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 45,
                -1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Blizzarcher is thought to have been born from the remains of a comet that burnt up in the atmosphere long ago. It's found in Lonava's infamously brutal Bruemoor Beacons, where it hides in mountain caves, waiting for anyone to dare trespass on its territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.FLATTER,11),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.BRINE,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,29),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,32),
                        new MoveLearnSetEntry(Move.ICE_BEAM,36),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,40),
                        new MoveLearnSetEntry(Move.HEX,44),
                        new MoveLearnSetEntry(Move.FREEZEDRY,48),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.DISABLE,54),
                        new MoveLearnSetEntry(Move.BLIZZARD,57),
                        new MoveLearnSetEntry(Move.SHEER_COLD,60)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Blizzarcher");

    }


}
