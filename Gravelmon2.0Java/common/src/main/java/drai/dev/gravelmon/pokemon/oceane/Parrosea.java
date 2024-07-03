package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Parrosea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Parrosea() {
        super("Parrosea",
                Type.NORMAL, Type.FLYING,
                new Stats(40,
                        52,
                        35,
                        50,
                        38,
                        55),
                List.of(Ability.SWIFT_SWIM), Ability.MULTISCALE,
                4, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                54, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_2),
                List.of("Parrosea's gills are so large that it can use them for short periods of flight. It's favourite food is Coralony, though they rely on their parents to feed them it."),
                List.of(new EvolutionEntry("nauticaw", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SING,6),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.AQUA_RING,14),
                        new MoveLearnSetEntry(Move.TWISTER,18),
                        new MoveLearnSetEntry(Move.DEFOG,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.TORPEDODASH,32),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 2, 23, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        setCanFly(true);

    }


}
