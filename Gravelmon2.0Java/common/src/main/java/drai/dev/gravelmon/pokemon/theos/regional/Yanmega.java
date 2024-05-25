package drai.dev.gravelmon.pokemon.theos.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Yanmega extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yanmega(int dex) {
        super(dex, "Yanmega",
                Type.BUG, Type.DRAGON,
                new Stats(86,
                        76,
                        86,
                        116,
                        56,
                        95),
                List.of(Ability.PRESSURE,Ability.TINTED_LENS), Ability.ADAPTABILITY,
                19, 515,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The beat of its wings is so powerful that it accidentally dislodges full-grown trees when it takes off in flight."),
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
           setLangFileName("Yanmega");

    }


}
