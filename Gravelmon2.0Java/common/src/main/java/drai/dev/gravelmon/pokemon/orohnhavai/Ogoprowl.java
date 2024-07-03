package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Ogoprowl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ogoprowl() {
        super("Ogoprowl",
                Type.WATER, Type.DARK,
                new Stats(60,
                        75,
                        55,
                        90,
                        65,
                        75),
                List.of(Ability.SWIFT_SWIM,Ability.WATER_VEIL,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                11, 165,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_2),
                List.of("They are known to dwell deep in underwater caves. Their glowing red eyes can pierce through the darkest areas."),
                List.of(new EvolutionEntry("sephysar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
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
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,66),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 34, 47, 1.1, List.of(
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
