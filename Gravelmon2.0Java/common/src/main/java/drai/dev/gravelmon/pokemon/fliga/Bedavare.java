package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bedavare extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bedavare() {
        super("Bedavare",
                Type.STEEL, Type.NORMAL,
                new Stats(70,
                        80,
                        130,
                        100,
                        80,
                        120),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,2,0,1), 35,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bedavare");

    }


}
