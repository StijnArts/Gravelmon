package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Drout extends Pokemon {
    public Drout() {
        super("Drout",
                Type.WATER, Type.GROUND,
                new Stats(90,
                        60,
                        60,
                        105,
                        80,
                        110),
                List.of(Ability.WET_AND_DRY), Ability.WET_AND_DRY,
                17, 1235,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                194, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Drout is regarded as an ancestor to Sanook, although scientists are unsure of how both pokemon can co-exist in the same time period. They have weak lungs but choose to breathe through their gills."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BELCH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.SNORE,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.AMNESIA,18),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,24),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,33),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,48),
                        new MoveLearnSetEntry(Move.FISSURE,56),
                        new MoveLearnSetEntry(Move.THRASH,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 22, 56, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of(new PokemonForm("Dry", true,
                        Type.ROCK, Type.GROUND,
                        new Stats(90,
                                91,
                                107,
                                60,
                                107,
                                50),
                        List.of(Ability.WET_AND_DRY), Ability.WET_AND_DRY,
                        17, 1213,
                        new Stats(0, 0, 0, 2, 0, 0), 120,
                        0.5,
                        161, ExperienceGroup.MEDIUM_FAST,
                        70,
                        51, List.of(EggGroup.WATER_1),
                        List.of(Aspect.DRY),
                        List.of(),
                        List.of(),
                        List.of(
                        ),
                        List.of(Label.LOCKEMON),
                        0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 12, 34, 0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                        List.of(SpawnPreset.NEAR_WATER),
                        1.4, 0.3)));
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
