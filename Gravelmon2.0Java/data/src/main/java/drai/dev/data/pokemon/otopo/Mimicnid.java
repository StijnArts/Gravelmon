package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mimicnid extends drai.dev.data.pokemon.Pokemon {
    public Mimicnid() {
        super("Mimicnid",
                Type.BUG,
                new Stats(50,
                        40,
                        55,
                        30,
                        120,
                        95),
                List.of(Ability.TRACE), Ability.RECEIVER,
                6, 0,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                137, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Because of their likeness to Ledyba, Mimicnid are highly sought for by Bug Catchers. When opponents are caught in its web, it can exactly duplicate their moves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIMIC,1),
                        new MoveLearnSetEntry(Move.METRONOME,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH)
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
           setLangFileName("Mimicnid");

    }


}
