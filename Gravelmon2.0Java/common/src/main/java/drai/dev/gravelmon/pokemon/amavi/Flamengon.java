package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Flamengon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flamengon() {
        super("Flamengon",
                Type.DRAGON, Type.FIGHTING,
                new Stats(72,
                        115,
                        80,
                        65,
                        103,
                        107),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.ACID,4),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,8),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,13),
                        new MoveLearnSetEntry(Move.STOMP,17),
                        new MoveLearnSetEntry(Move.GLARE,20),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,25),
                        new MoveLearnSetEntry(Move.FACADE,29),
                        new MoveLearnSetEntry(Move.JUMP_KICK,32),
                        new MoveLearnSetEntry(Move.ROOST,36),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,39),
                        new MoveLearnSetEntry(Move.MIND_READER,41),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,44),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,47),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,50),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,55),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,58),
                        new MoveLearnSetEntry(Move.OUTRAGE,62),
                        new MoveLearnSetEntry(Move.VICTORY_DANCE,66)           ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flamengon");

    }


}
