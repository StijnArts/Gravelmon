package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Umbralu extends Pokemon {
    public Umbralu() {
        super("Umbralu",
                Type.DARK, Type.WATER,
                new Stats(55,
                        70,
                        50,
                        110,
                        65,
                        100),
                List.of(Ability.PETRICHOR, Ability.SAP_SIPPER), Ability.EVENTIDE,
                8, 31,
                new Stats(0,0,0,1,0,0), 127,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.WATER_1),
                List.of("Umbralu have a dark aura in their underskirt that is pitch black and impossible to see through. Strong Unbralu can concentrate this energy to shoot beams of darkness that leach the opponent’s life force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.POISON_STING,4),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,8),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,16),
                        new MoveLearnSetEntry(Move.HEX,20),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.SNARL,28),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,32),
                        new MoveLearnSetEntry(Move.RECOVER,36),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,41),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,44),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,48),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 47, 11.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
    }
}
