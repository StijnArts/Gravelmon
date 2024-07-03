package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Snomagnon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snomagnon() {
        super("Snomagnon",
                Type.ICE, Type.FIGHTING,
                new Stats(50,
                        75,
                        50,
                        60,
                        60,
                        50),
                List.of(Ability.TINTED_LENS), Ability.NO_GUARD,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Snomagnon are living fossils, as they managed to survive several extinction events by freezing themselves. Sometimes they are accidentally released from glaciers."),
                List.of(new EvolutionEntry("cromountain", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 37, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snomagnon");

    }


}
