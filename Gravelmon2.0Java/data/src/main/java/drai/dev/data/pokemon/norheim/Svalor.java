package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Svalor extends drai.dev.data.pokemon.Pokemon {
    public Svalor(Stats stats) {
        super("Svalor",
                Type.DARK, Type.PSYCHIC,
                stats,
                List.of(Ability.MOXIE,Ability.INFILTRATOR,Ability.UNNERVE), Ability.UNNERVE,
                14, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Svalor creeps inside ancient ruins, often old towers on smaller islands. Islands where young couples used to come and visit by boat in search of refuge. The tower ruins would be a great spot to cover from the heavy storms, so they thought."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 53, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Svalor");

    }


}
