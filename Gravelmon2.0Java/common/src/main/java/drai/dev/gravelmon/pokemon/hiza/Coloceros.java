package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Coloceros extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coloceros() {
        super("Coloceros",
                Type.GRASS, Type.ROCK,
                new Stats(102,
                        93,
                        112,
                        70,
                        82,
                        71),
                List.of(Ability.OVERGROW), Ability.GRASS_PELT,
                20, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("This huge Pokemon exclusively eats a special fruit which it guards the tree with its life. The sturdy horn on its nose cannot be cut or broken no matter what."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.CURSE,17),
                        new MoveLearnSetEntry(Move.BITE,22),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,33),
                        new MoveLearnSetEntry(Move.SYNTHESIS,39),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,57),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,63)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coloceros");

    }


}
