package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cromountain extends drai.dev.data.pokemon.Pokemon {
    public Cromountain() {
        super("Cromountain",
                Type.ICE, Type.FIGHTING,
                new Stats(85,
                        135,
                        80,
                        70,
                        70,
                        60),
                List.of(Ability.TINTED_LENS), Ability.NO_GUARD,
                17, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Cromountain's DNA is frighteningly similar to human DNA. They are gentle giants, preferring to play with tools as opposed to fighting."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,7),
                        new MoveLearnSetEntry(Move.BULK_UP,10),
                        new MoveLearnSetEntry(Move.RAGE,14),
                        new MoveLearnSetEntry(Move.ICE_SHARD,17),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,21),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,24),
                        new MoveLearnSetEntry(Move.TAUNT,27),
                        new MoveLearnSetEntry(Move.ICE_BALL,32),
                        new MoveLearnSetEntry(Move.MIND_READER,35),
                        new MoveLearnSetEntry(Move.REST,40),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,44),
                        new MoveLearnSetEntry(Move.AGILITY,47),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 57, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cromountain");

    }


}
