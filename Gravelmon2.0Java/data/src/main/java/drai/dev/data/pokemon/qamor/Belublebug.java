package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Belublebug extends drai.dev.data.pokemon.Pokemon {
    public Belublebug() {
        super("Belublebug",
                Type.FIRE, Type.BUG,
                new Stats(99,
                        88,
                        77,
                        66,
                        55,
                        44),
                List.of(Ability.FLAME_BODY), Ability.FRIEND_GUARD,
                11, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Once a Belublebug finds its soulmate, the two are paired for life and never leave each other's sides. They have difficulty flying alone due to their weak wings, but two together are able to support their collective weight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.TEAM_UP,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.LIGHT_UP,11),
                        new MoveLearnSetEntry(Move.WARM_EMBRACE,11),
                        new MoveLearnSetEntry(Move.CHERUB_ARROW,22),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,22),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,33),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,33),
                        new MoveLearnSetEntry(Move.BURNING_PASSION,44),
                        new MoveLearnSetEntry(Move.LUNGE,44),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,55),
                        new MoveLearnSetEntry(Move.HEALING_WISH,55)
                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 32, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
