package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sephysar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sephysar() {
        super("Sephysar",
                Type.WATER, Type.DARK,
                new Stats(90,
                        80,
                        90,
                        125,
                        105,
                        110),
                List.of(Ability.SWIFT_SWIM,Ability.WATER_VEIL,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                31, 165,
                new Stats(0,0,0,2,0,1), 15,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_2),
                List.of("Sephysar are known to inhabit the mysterious Lake Altus. There goes a saying that whoever dares cross its territory will face great danger. It's able to harness the power of storms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,6),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,24),
                        new MoveLearnSetEntry(Move.TAUNT,28),
                        new MoveLearnSetEntry(Move.CRUNCH,33),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,34),
                        new MoveLearnSetEntry(Move.AGILITY,38),
                        new MoveLearnSetEntry(Move.DARK_PULSE,44),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,49),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,55),
                        new MoveLearnSetEntry(Move.CALM_MIND,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,67),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,73),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 52, 70, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
