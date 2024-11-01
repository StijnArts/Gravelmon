package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Denartery extends drai.dev.data.pokemon.Pokemon {
    public Denartery() {
        super("Denartery",
                Type.WATER, Type.POISON,
                new Stats(90,
                        30,
                        67,
                        80,
                        80,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 165,
                new Stats(0,0,0,0,0,0), 85,
                0.5,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_1),
                List.of("It has grown to take on a more predatory lifestyle. Old habits die hard, though, as it is commonly seen trying to latch onto a larger Pokemon and getting dragged around uncomfortably."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,4),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.WATER_SPORT,16),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,23),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,29),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,32),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,36),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 32, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
