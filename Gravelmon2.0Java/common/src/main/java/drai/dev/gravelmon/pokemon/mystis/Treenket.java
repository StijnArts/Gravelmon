package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Treenket extends drai.dev.gravelmon.pokemon.Pokemon {
    public Treenket() {
        super("Treenket",
                Type.GRASS,
                new Stats(50,
                        45,
                        60,
                        45,
                        60,
                        50),
                List.of(Ability.SNOW_CLOAK,Ability.TANGLED_FEET), Ability.QUICK_FEET,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                62, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Treenket");

    }


}
