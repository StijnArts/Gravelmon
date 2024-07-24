package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Krickiet extends drai.dev.data.pokemon.Pokemon {
    public Krickiet() {
        super("Sicada",
                Type.BUG, Type.PSYCHIC,
                new Stats(34,
                        40,
                        30,
                        73,
                        40,
                        60),
                List.of(Ability.SWARM,Ability.TELEPATHY,Ability.CACOPHONY), Ability.CACOPHONY,
                3, 165,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                45, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Sicada send telepathic frequencies to gather in groups of three that sing together until one evolves. The remaining duo has to search for a new partner."),
                List.of(new EvolutionEntry("maestring", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,4),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,7),
                        new MoveLearnSetEntry(Move.SING,10),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,12),
                        new MoveLearnSetEntry(Move.ROUND,14),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,18),
                        new MoveLearnSetEntry(Move.ENCORE,21),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,24),
                        new MoveLearnSetEntry(Move.RESONATE,27),
                        new MoveLearnSetEntry(Move.METRONOME,30),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,34),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,37),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,43),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,47),
                        new MoveLearnSetEntry(Move.PERISH_SONG,54),
                        new MoveLearnSetEntry(Move.TEAMUP,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
