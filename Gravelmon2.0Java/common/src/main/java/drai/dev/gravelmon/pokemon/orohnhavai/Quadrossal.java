package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Quadrossal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quadrossal() {
        super("Quadrossal",
                Type.WATER, Type.ICE,
                new Stats(140,
                        100,
                        110,
                        130,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                33, 165,
                new Stats(2,0,0,0,1,0), 3,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A legendary Pokemon that came from the depths of the abyss. Folklore says it once flooded the islands to cleanse it of impurities. It went to slumber deep in the icy depths of the region."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROUND,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,8),
                        new MoveLearnSetEntry(Move.WATER_PULSE,15),
                        new MoveLearnSetEntry(Move.AMNESIA,22),
                        new MoveLearnSetEntry(Move.FROST_BREATH,29),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,43),
                        new MoveLearnSetEntry(Move.ICE_BEAM,50),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,57),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,64),
                        new MoveLearnSetEntry(Move.CALM_MIND,71),
                        new MoveLearnSetEntry(Move.BOOMBURST,78),
                        new MoveLearnSetEntry(Move.BLIZZARD,85),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,92)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
