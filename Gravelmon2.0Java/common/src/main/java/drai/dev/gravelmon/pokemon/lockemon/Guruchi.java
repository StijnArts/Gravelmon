package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Guruchi extends Pokemon {
    public Guruchi() {
        super("Guruchi",
                Type.WATER, Type.ELECTRIC,
                new Stats(67,
                        50,
                        70,
                        110,
                        70,
                        93),
                List.of(Ability.ENERGIZER, Ability.SWIFT_SWIM), Ability.MOTOR_DRIVE,
                11, 1255,
                new Stats(0,0,0,2,0,0), 110,
                0.5,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Guruchi have turbine-like tails which they use to process and condense water. This processed water can be shot at incredibly fast rates through the gap between its teeth, allowing Guruchi to cut wood with ease."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,16),
                        new MoveLearnSetEntry(Move.SPARK,20),
                        new MoveLearnSetEntry(Move.CHARGE,24),
                        new MoveLearnSetEntry(Move.DISCHARGE,30),
                        new MoveLearnSetEntry(Move.AQUA_RING,36),
                        new MoveLearnSetEntry(Move.FLAIL,42),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,48),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.PRESENT,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 19, 44, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
    }
}
