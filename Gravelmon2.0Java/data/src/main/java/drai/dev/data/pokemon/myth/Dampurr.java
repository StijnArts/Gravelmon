package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Dampurr extends Pokemon {
    public Dampurr() {
        super("Dampurr",
                Type.WATER, Type.ROCK,
                new Stats(40,35,65,55,45,40),
                List.of(Ability.FUR_COAT, Ability.RAIN_DISH), Ability.BERSERK,
                5, 69,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("Dampurr have very thick fur that can withstand both Liquids and Solids, it's body can take multiple attacks before the fur on it's body wears out."),
                List.of(new EvolutionEntry("soakcuff", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.PEBBLE_SHOT, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 7),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 10),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 14),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, 16),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 20),

                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg"),
                        new MoveLearnSetEntry(Move.CRUNCH, "egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "egg")
                ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
