package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scorpop extends drai.dev.data.pokemon.Pokemon {
    public Scorpop() {
        super("Scorpop",
                Type.FAIRY, Type.BUG,
                new Stats(70,
                        90,
                        60,
                        90,
                        60,
                        85),
                List.of(Ability.ARENA_TRAP), Ability.SWEET_VEIL,
                5, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                159, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.BUG),
                List.of("- Sweet DecaySTAB Fairy - Play RoughSTAB Fairy - LungeSTAB Bug - Sugar Rush Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scorpop");

    }


}
