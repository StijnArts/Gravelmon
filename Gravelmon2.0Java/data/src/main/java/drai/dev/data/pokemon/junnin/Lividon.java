package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lividon extends drai.dev.data.pokemon.Pokemon {
    public Lividon() {
        super("Lividon",
                Type.WATER, Type.DARK,
                new Stats(120,
                        70,
                        120,
                        80,
                        70,
                        70),
                List.of(Ability.TORRENT), Ability.ANGER_POINT,
                16, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("Lividon is known for its bad temper. It often sleeps on the ocean floor, and if it is awoken it will become furious and attack anything in the area."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.BUBBLE,8),
                        new MoveLearnSetEntry(Move.BIDE,11),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.AQUA_JET,17),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,20),
                        new MoveLearnSetEntry(Move.TWISTER,24),
                        new MoveLearnSetEntry(Move.SHOVEOFF,28),
                        new MoveLearnSetEntry(Move.SCARY_FACE,33),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,43),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,48),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.GLARE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
