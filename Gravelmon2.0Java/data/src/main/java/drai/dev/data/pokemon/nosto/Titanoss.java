package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Titanoss extends drai.dev.data.pokemon.Pokemon {
    public Titanoss() {
        super("Titanoss",
                Type.GRASS, Type.GROUND,
                new Stats(90,
                        118,
                        100,
                        63,
                        84,
                        80),
                List.of(Ability.OVERGROW), Ability.SHEER_FORCE,
                21, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.ROCK_THROW,21),
                        new MoveLearnSetEntry(Move.INGRAIN,26),
                        new MoveLearnSetEntry(Move.BULLDOZE,33),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,35),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,38),
                        new MoveLearnSetEntry(Move.SEED_BOMB,42),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,47),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,50),
                        new MoveLearnSetEntry(Move.BULK_UP,54),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,60),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Titanoss");

    }


}
