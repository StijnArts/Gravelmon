package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Grizzik extends drai.dev.data.pokemon.Pokemon {
    public Grizzik() {
        super("Grizzik",
                Type.FIGHTING, Type.ICE,
                new Stats(95,
                        130,
                        70,
                        65,
                        75,
                        65),
                List.of(Ability.VITAL_SPIRIT), Ability.VITAL_SPIRIT,
                16, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Grizzik are such aggressive Pokemon, that they don’t rest or tire. The only time they rest is in Winter, where they hibernate until Spring."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,6),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,12),
                        new MoveLearnSetEntry(Move.ICE_FANG,15),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,21),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,27),
                        new MoveLearnSetEntry(Move.SLASH,30),
                        new MoveLearnSetEntry(Move.ICE_BEAM,36),
                        new MoveLearnSetEntry(Move.SUBMISSION,42),
                        new MoveLearnSetEntry(Move.BLIZZARD,45),
                        new MoveLearnSetEntry(Move.AVALANCHE,51),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,57),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,60),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 53, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grizzik");

    }


}
