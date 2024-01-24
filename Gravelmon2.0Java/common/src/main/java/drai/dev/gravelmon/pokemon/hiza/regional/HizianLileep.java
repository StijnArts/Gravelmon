package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianLileep extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianLileep() {
        super("Lileep",
                Type.GRASS,Type.GHOST,
                new Stats(66,
                        41,
                        77,
                        87,
                        61,
                        23),
                List.of(Ability.PERISH_BODY), Ability.PERISH_BODY,
                8, 165,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                71, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Reanimated from an unusually light Root Fossil. Its glowing tentacles are extremely sticky and captures anything that comes close to it."),
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
           setLangFileName("Lileep");

    }


}
