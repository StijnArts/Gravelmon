package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nauticaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nauticaw() {
        super("Nauticaw",
                Type.NORMAL, Type.FLYING,
                new Stats(58,
                        75,
                        50,
                        65,
                        52,
                        75),
                List.of(Ability.SWIFT_SWIM), Ability.MULTISCALE,
                11, 165,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                131, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_2),
                List.of("Hardened scales adorn the top of Seaparrot's head, which it uses to headbutt wildly when enraged. The gills have grown so large that they can produce strong gusts of wind."),
                List.of(new EvolutionEntry("coronacaw", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
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
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 16, 31, 1.32, List.of(
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
