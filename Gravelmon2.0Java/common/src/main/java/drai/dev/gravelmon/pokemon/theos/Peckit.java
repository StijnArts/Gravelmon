package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Peckit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peckit() {
        super("Peckit",
                Type.FLYING,Type.GROUND,
                new Stats(40,
                        70,
                        60,
                        50,
                        50,
                        50),
                List.of(Ability.BIG_PECKS,Ability.QUICK_FEET), Ability.GUTS,
                4, 30,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Peckit cannot fly but can jump quite high. Their beak is quite strong, using it to peck through the hard ground to find hiding Sqworm."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peckit");

    }


}
