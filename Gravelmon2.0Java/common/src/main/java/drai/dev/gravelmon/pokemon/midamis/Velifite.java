package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Velifite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Velifite() {
        super("Velifite",
                Type.FIGHTING, Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("raptrocas", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,6),
                        new MoveLearnSetEntry(Move.ARM_THRUST,11),
                        new MoveLearnSetEntry(Move.ROCK_THROW,14),
                        new MoveLearnSetEntry(Move.MIND_READER,17),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,21),
                        new MoveLearnSetEntry(Move.FEINT,23),
                        new MoveLearnSetEntry(Move.ROAR,28),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,32),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,33),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,36),
                        new MoveLearnSetEntry(Move.STONE_EDGE,40),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,44),
                        new MoveLearnSetEntry(Move.TITLEMATCH,48)
                ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Velifite");

    }


}
