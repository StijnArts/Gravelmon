package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Spoutot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spoutot() {
        super("Spoutot",
                Type.WATER,
                new Stats(44,
                        38,
                        49,
                        79,
                        61,
                        32),
                List.of(Ability.RAIN_DISH), Ability.TANGLED_FEET,
                4, 150,
                new Stats(0,0,0,1,0,0), 225,
                0.0,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Unable to control its waterflow, it consistently tries to keep balance and not allow its water to spill out. It waits until rain to refill its dish."),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spoutot");

    }


}
