package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianAnorith extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianAnorith() {
        super("Anorith",
                Type.BUG,Type.DRAGON,
                new Stats(45,
                        95,
                        50,
                        40,
                        50,
                        75),
                List.of(Ability.OUTBURST), Ability.OUTBURST,
                8, 165,
                new Stats(0,1,0,0,0,0), 90,
                0.5,
                71, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Reanimated from an unusually large Claw Fossil, it has powerful serrated claws capable of crushing even the hardest shell."),
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
           setLangFileName("Anorith");

    }


}
