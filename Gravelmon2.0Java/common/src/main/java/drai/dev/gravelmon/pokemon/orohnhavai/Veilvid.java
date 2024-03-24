package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Veilvid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Veilvid() {
        super("Veilvid",
                Type.WATER,Type.GRASS,
                new Stats(60,
                        50,
                        60,
                        70,
                        100,
                        80),
                List.of(Ability.WATER_ABSORB), Ability.WATER_VEIL,
                9, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Veilvid can only be found in freshwater streams and lakes. They feed on aquatic plants. Their leafy fins help it to camouflage in the water, hidden out of sight from predators. Their fins are actually almost plant-like. They swim near the surface to absorb sunlight to convert into energy."),
                List.of(),
                List.of(                new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.WRAP,9),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.TICKLE,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,21),
                        new MoveLearnSetEntry(Move.SYNTHESIS,24),
                        new MoveLearnSetEntry(Move.BRINE,27),
                        new MoveLearnSetEntry(Move.AQUA_RING,31),
                        new MoveLearnSetEntry(Move.ENSNARE,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.WRING_OUT,45),
                        new MoveLearnSetEntry(Move.POWER_WHIP,50)        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 9, 32, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
