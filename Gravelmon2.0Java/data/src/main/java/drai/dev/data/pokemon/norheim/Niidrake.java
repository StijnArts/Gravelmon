package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Niidrake extends drai.dev.data.pokemon.Pokemon {
    public Niidrake() {
        super("Niidrake",
                Type.GROUND, Type.DRAGON,
                new Stats(79,
                        101,
                        113,
                        80,
                        62,
                        75),
                List.of(Ability.MOLD_BREAKER,Ability.SAND_RUSH,Ability.SKILL_LINK), Ability.SKILL_LINK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("After defeating its enemies, Niidrake will progressively grow more bone-like structures on its armor. While being incredibly fearsome, they still choose to bury their prey in the ground as a gesture of respect."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Niidrake");

    }


}
