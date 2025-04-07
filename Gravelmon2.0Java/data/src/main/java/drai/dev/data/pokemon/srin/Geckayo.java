package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geckayo extends drai.dev.data.pokemon.Pokemon {
    public Geckayo() {
        super("Geckayo",
                Type.FIGHTING,Type.GRASS,
                new Stats(60,
                        110,
                        80,
                        95,
                        70,
                        90),
                List.of(Ability.INNER_FOCUS,Ability.SHED_SKIN), Ability.PROTEAN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Razor LeafSTAB Grass - Leaf BladeSTAB Grass - Dragon Tail Dragon - Shed Tail (N) Normal - Branch PokeSTAB Grass - Meditate Psychic - CounterSTAB Fighting - Force PalmSTAB Fighting - Wake-Up Slap (N)STAB Fighting - Low SweepSTAB Fighting - Dragon Dance Dragon - Focus Energy Normal - Focus BlastSTAB Fighting - Focus PunchSTAB Fighting - Detect Fighting - Camouflage Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.MEDITATE,1),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,1),
                        new MoveLearnSetEntry(Move.SHED_TAIL,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.COUNTER,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,1)                        ),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Geckay-o");

    }


}
