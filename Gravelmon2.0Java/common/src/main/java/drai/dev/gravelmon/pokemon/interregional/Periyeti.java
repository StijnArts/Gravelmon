package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Periyeti extends drai.dev.gravelmon.pokemon.Pokemon {
    public Periyeti() {
        super("Periyeti",
                Type.ICE, Type.FIGHTING,
                new Stats(100,
                        135,
                        75,
                        60,
                        70,
                        70),
                List.of(Ability.SNOW_CLOAK), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                178, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Periyeti live in exile as they abandon themselves from all people and Pokemon. Due to their snow-colored fur, it's nearly impossible to spot one and makes many people doubt their existence."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,17),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,22),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.AVALANCHE,29),
                        new MoveLearnSetEntry(Move.REVERSAL,33),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,37),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,42),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,45),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,49)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Periyeti");

    }


}
