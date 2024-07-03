package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Svalbat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Svalbat() {
        super("Svalbat",
                Type.DARK, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FOREWARN,Ability.SECRETINSIGHT,Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                7, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This flightless cave dweller lacks vision, just like Zubat. Navigating through narrow paths with the help of sound, Svalbat creates eerie noises by lifting its wing like arms up and down. In return, the sound reverbs, causing long lasting echoes. Not my proudest of faps."),
                List.of(new EvolutionEntry("svalor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.PAYBACK,9),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.SWAGGER,18),
                        new MoveLearnSetEntry(Move.SLASH,21),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,24),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,27),
                        new MoveLearnSetEntry(Move.SWITCHEROO,33),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,37),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,47)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Svalbat");

    }


}
