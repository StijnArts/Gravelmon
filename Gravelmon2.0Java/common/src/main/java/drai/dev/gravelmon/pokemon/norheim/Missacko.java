package drai.dev.gravelmon.pokemon.norheim;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Missacko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Missacko(Stats stats) {
        super("Missacko",
                Type.DARK, Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.CHARM,4),
                        new MoveLearnSetEntry(Move.PURSUIT,7),
                        new MoveLearnSetEntry(Move.ATTRACT,10),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,13),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,28),
                        new MoveLearnSetEntry(Move.NEW_MOON,31),
                        new MoveLearnSetEntry(Move.FLATTER,34),
                        new MoveLearnSetEntry(Move.DARK_PULSE,37),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,43),
                        new MoveLearnSetEntry(Move.MOONLIGHT,46),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON,50),
                        new MoveLearnSetEntry(Move.HURRICANE,55)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 37, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Missacko");

    }


}
