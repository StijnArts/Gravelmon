package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tricklock extends drai.dev.data.pokemon.Pokemon {
    public Tricklock() {
        super("Tricklock",
                Type.STEEL, Type.GHOST,
                new Stats(48,
                        77,
                        80,
                        77,
                        80,
                        50),
                List.of(Ability.TIMETWIST), Ability.TIMETWIST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is said that coming in contact with a Tricklock means said person will soon meet their fate. It is all urban legends, however."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAPPY_HOUR,"tm"),
                        new MoveLearnSetEntry(Move.TEATIME,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tricklock");

    }


}
