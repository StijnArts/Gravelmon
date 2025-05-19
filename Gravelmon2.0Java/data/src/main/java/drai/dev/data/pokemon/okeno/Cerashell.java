package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cerashell extends drai.dev.data.pokemon.Pokemon {
    public Cerashell() {
        super("Cerashell",
                Type.ROCK, Type.POISON,
                new Stats(60,
                        67,
                        110,
                        106,
                        70,
                        82),
                List.of(Ability.FLARE_BOOST), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Rapid Spin Normal Knock Off Dark Rock BlastSTAB Rock Clear SmogSTAB Poison Shell Smash Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cerashell");

    }


}
