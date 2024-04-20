package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dracoknight extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dracoknight() {
        super("Dracoknight",
                Type.DRAGON, Type.STEEL,
                new Stats(120,
                        80,
                        110,
                        100,
                        130,
                        60),
                List.of(Ability.BATTLE_ARMOR), Ability.MIRROR_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("The closest relative to Dragonite. Legends tell a story of dragons, forging their own armor with magical fire to protect themselves and its allies in great battles ahead."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dracoknight");

    }


}
