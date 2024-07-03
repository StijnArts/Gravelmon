package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Gelatini extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gelatini() {
        super("Gelatini",
                Type.PSYCHIC, Type.FIGHTING,
                new Stats(60,
                        25,
                        65,
                        30,
                        65,
                        47),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("jellodiac", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,7),
                        new MoveLearnSetEntry(Move.COUNTER,12),
                        new MoveLearnSetEntry(Move.CONFUSION,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,24),
                        new MoveLearnSetEntry(Move.PSYBEAM,28),
                        new MoveLearnSetEntry(Move.FORCE_PALM,32),
                        new MoveLearnSetEntry(Move.RECOVER,36),
                        new MoveLearnSetEntry(Move.AMNESIA,41),
                        new MoveLearnSetEntry(Move.PSYCHIC,46),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,50),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,55),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,60)                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gelatini");

    }


}
