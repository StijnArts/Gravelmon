package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Trickabod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trickabod() {
        super("Trickabod",
                Type.GHOST, Type.FIRE,
                new Stats(55,
                        45,
                        70,
                        145,
                        85,
                        105),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 60,
                1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,5),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,10),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,14),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,19),
                        new MoveLearnSetEntry(Move.FLAME_BURST,23),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.WISH,33),
                        new MoveLearnSetEntry(Move.KARMA_BEAM,39),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,44),
                        new MoveLearnSetEntry(Move.MEMENTO,44),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,50),
                        new MoveLearnSetEntry(Move.SAFEGUARD,55),
                        new MoveLearnSetEntry(Move.POSSESSION,61),
                        new MoveLearnSetEntry(Move.IMPRISON,66),
                        new MoveLearnSetEntry(Move.INFERNO,72),
                        new MoveLearnSetEntry(Move.HEALING_WISH,77)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 51, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trickabod");

    }


}
