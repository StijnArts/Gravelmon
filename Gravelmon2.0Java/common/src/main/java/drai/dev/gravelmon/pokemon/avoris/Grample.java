package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Grample extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grample() {
        super("Grample",
                Type.GRASS,
                new Stats(120,
                        80,
                        90,
                        100,
                        80,
                        30),
                List.of(Ability.NATURAL_CURE), Ability.STURDY,
                23, 165,
                new Stats(2,0,0,0,0,0), 95,
                1.0,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The length and density of its mustache-shaped sap is an indicator of its age. More mature Grample are even known to have lengthy beards and a sweeter sap."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.BLOCK,6),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,9),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,16),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,20),
                        new MoveLearnSetEntry(Move.INGRAIN,24),
                        new MoveLearnSetEntry(Move.NATURE_POWER,27),
                        new MoveLearnSetEntry(Move.WHIRLWIND,31),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,36),
                        new MoveLearnSetEntry(Move.SYNTHESIS,42),
                        new MoveLearnSetEntry(Move.AIR_SLASH,48),
                        new MoveLearnSetEntry(Move.LEAF_STORM,53)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_SPRING, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grample");

    }


}
