package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stumple extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stumple() {
        super("Stumple",
                Type.GRASS,
                new Stats(80,
                        50,
                        55,
                        55,
                        50,
                        20),
                List.of(Ability.NATURAL_CURE), Ability.STURDY,
                8, 165,
                new Stats(1,0,0,0,0,0), 210,
                1.0,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The sticky sap that drips from Stumple's nose is incredibly bitter to humans, but is considered a delicacy among Bug-type Mons. It has trouble running from them on account of its stubby legs."),
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
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,35),
                        new MoveLearnSetEntry(Move.SYNTHESIS,39),
                        new MoveLearnSetEntry(Move.AIR_SLASH,43),
                        new MoveLearnSetEntry(Move.LEAF_STORM,48)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stumple");

    }


}
