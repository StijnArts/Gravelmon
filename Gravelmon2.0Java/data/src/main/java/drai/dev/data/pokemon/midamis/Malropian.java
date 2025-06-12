package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Malropian extends drai.dev.data.pokemon.Pokemon {
    public Malropian() {
        super("Malropian",
                Type.POISON, Type.BUG,
                new Stats(80,
                        60,
                        95,
                        100,
                        75,
                        75),
                List.of(Ability.LIQUID_OOZE), Ability.POISON_POINT,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Malropian's tail cannot sting, rather, it can spray terrible acid that can melt skin. It's large appearance can be quite intimidating, comparable to Drapion."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,4),
                        new MoveLearnSetEntry(Move.PROTECT,8),
                        new MoveLearnSetEntry(Move.POISON_TAIL,12),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.VENOSHOCK,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,40),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44)
                ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of( new BiomeSpawnCondition(List.of(Biome.IS_SUMMER,Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Malropian");

    }


}
