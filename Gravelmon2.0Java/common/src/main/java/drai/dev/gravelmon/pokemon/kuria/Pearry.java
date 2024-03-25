package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pearry extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pearry() {
        super("Pearry",
                Type.GRASS,Type.FLYING,
                new Stats(65,
                        82,
                        91,
                        111,
                        87,
                        94),
                List.of(Ability.BERRYPLUMAGE), Ability.BERRYPLUMAGE,
                15, 519,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                208, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pearry");

    }


}
