package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Spunch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spunch() {
        super("Spunch",
                Type.FIGHTING,
                new Stats(46,
                        45,
                        62,
                        36,
                        56,
                        45),
                List.of(Ability.WATER_ABSORB), Ability.REFLEXSTRIKE,
                8, 165,
                new Stats(1,1,0,0,0,0), 100,
                1.0,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("By filling its fists with water, it can expand its punches to incredible proportions. Unfortunately, they still cause little damage. It's true power lies in absorbing damage within its springy body."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spunch");

    }


}
