package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wiselicious extends drai.dev.data.pokemon.Pokemon {
    public Wiselicious() {
        super("Wiselicious",
                Type.DARK, Type.FIGHTING,
                new Stats(96,
                        68,
                        78,
                        109,
                        95,
                        73),
                List.of(Ability.TECHNICIAN,Ability.SUCTION_CUPS), Ability.TELEPATHY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Wrap Normal - Whirlpool Water - Focus Energy Normal - Hypnosis Psychic 8 Meditate Psychic 12 Disable Normal 17 Vacuum WaveSTAB Fighting 20 Detect Fighting 26 Low SweepSTAB Fighting 30 Confuse Ray Ghost 36 Psywave Psychic 40 Calm Mind Psychic 45 Dark PulseSTAB Dark 49 Parting Shot Dark 55 Focus BlastSTAB Fighting 55 Mind Reader Normal 62 ReversalSTAB Fighting"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.MEDITATE,8),
                        new MoveLearnSetEntry(Move.DISABLE,12),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,17),
                        new MoveLearnSetEntry(Move.DETECT,20),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,26),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,30),
                        new MoveLearnSetEntry(Move.PSYWAVE,36),
                        new MoveLearnSetEntry(Move.CALM_MIND,40),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,49),
                        new MoveLearnSetEntry(Move.MIND_READER,55),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,55),
                        new MoveLearnSetEntry(Move.REVERSAL,62),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wiselicious");

    }


}
