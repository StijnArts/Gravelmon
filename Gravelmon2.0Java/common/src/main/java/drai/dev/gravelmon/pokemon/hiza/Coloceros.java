package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Coloceros extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coloceros() {
        super("Coloceros",
                Type.GRASS,Type.ROCK,
                new Stats(102,
                        93,
                        112,
                        70,
                        82,
                        71),
                List.of(Ability.OVERGROW), Ability.GRASS_PELT,
                8, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("This huge Pokemon exclusively eats a special fruit which it guards the tree with its life. The sturdy horn on its nose cannot be cut or broken no matter what."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coloceros");

    }


}
