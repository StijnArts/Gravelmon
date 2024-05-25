package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kelpush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kelpush() {
        super("Kelpush",
                Type.GRASS,
                new Stats(103,
                        74,
                        63,
                        75,
                        68,
                        65),
                List.of(Ability.WATER_ABSORB,Ability.DAMP,Ability.REGENERATOR), Ability.REGENERATOR,
                14, 165,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                157, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its ability to absorb water is impeccable, and often times can triple it's weight with liquid. Without water, it can be carried around with relative ease."),
                List.of(new EvolutionEntry("kelprash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.WRAP,9),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,14),
                        new MoveLearnSetEntry(Move.SYNTHESIS,17),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.TICKLE,25),
                        new MoveLearnSetEntry(Move.AQUA_RING,30),
                        new MoveLearnSetEntry(Move.BRINE,35),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,41),
                        new MoveLearnSetEntry(Move.GROWTH,45),
                        new MoveLearnSetEntry(Move.WRING_OUT,51),
                        new MoveLearnSetEntry(Move.POWER_WHIP,57)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 26, 37, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
