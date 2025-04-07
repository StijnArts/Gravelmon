package drai.dev.data.pokemon.avalos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AvalossianSceptile extends drai.dev.data.pokemon.Pokemon {
    public AvalossianSceptile(String name, Aspect aspect) {
        super(name, aspect, "Sceptile",
                Type.ROCK,
                new Stats(70,
                        105,
                        85,
                        85,
                        65,
                        120),
                List.of(Ability.SAND_FORCE), Ability.UNBURDEN,
                18, 0,
                new Stats(0,0,0,0,0,3), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                new MoveLearnSetEntry(Move.PECK,1),
                new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                new MoveLearnSetEntry(Move.METAL_CLAW,10),
                new MoveLearnSetEntry(Move.IRON_DEFENSE,16),
                new MoveLearnSetEntry(Move.SLASH,22),
                new MoveLearnSetEntry(Move.AIR_SLASH,26),
                new MoveLearnSetEntry(Move.ROCK_POLISH,30),
                new MoveLearnSetEntry(Move.POWER_GEM,36),
                new MoveLearnSetEntry(Move.NIGHT_SLASH,42),
                new MoveLearnSetEntry(Move.FOCUS_ENERGY,46),
                new MoveLearnSetEntry(Move.STONE_EDGE,50),
                new MoveLearnSetEntry(Move.DOUBLEEDGE,56)
                ),
        List.of(Label.AVALOS),
                0, List.of(
        ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sceptile");

    }


}
