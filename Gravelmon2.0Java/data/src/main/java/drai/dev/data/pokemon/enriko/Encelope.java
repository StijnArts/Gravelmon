package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Encelope extends drai.dev.data.pokemon.Pokemon {
    public Encelope() {
        super("Encelope",
                Type.PSYCHIC, Type.DARK,
                new Stats(20,
                        15,
                        15,
                        95,
                        100,
                        60),
                List.of(Ability.ANALYTIC), Ability.ADAPTABILITY,
                9, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("They are said to have come from a meteor strike. Encelope attempt to cover the heads of unsuspecting prey to feed off of their thoughts."),
                List.of(new EvolutionEntry("controlyu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.AMNESIA.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.BIND,5),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.POISON_FANG,13),
                        new MoveLearnSetEntry(Move.CRUNCH,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,21),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,23),
                        new MoveLearnSetEntry(Move.FACADE,26),
                        new MoveLearnSetEntry(Move.SNARL,30),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.AMNESIA,43),
                        new MoveLearnSetEntry(Move.DARK_PULSE,46),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 45, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Encelope");

    }


}
