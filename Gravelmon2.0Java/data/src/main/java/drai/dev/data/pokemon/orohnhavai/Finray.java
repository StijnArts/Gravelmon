package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Finray extends drai.dev.data.pokemon.Pokemon {
    public Finray() {
        super("Finray",
                Type.WATER,
                new Stats(40,
                        55,
                        40,
                        65,
                        45,
                        55),
                List.of(Ability.SWIFT_SWIM,Ability.WATER_VEIL,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                6, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_2),
                List.of("It swims against strong currents by skillfully using its tail as a rudder. Its acute hearing allows it to evade any danger."),
                List.of(new EvolutionEntry("ogoprowl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,6),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,24),
                        new MoveLearnSetEntry(Move.YAWN,28),
                        new MoveLearnSetEntry(Move.CRUNCH,33),
                        new MoveLearnSetEntry(Move.AGILITY,37),
                        new MoveLearnSetEntry(Move.DARK_PULSE,42),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,46),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,51),
                        new MoveLearnSetEntry(Move.CALM_MIND,55),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,60),
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 3, 22, 9, List.of(
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
