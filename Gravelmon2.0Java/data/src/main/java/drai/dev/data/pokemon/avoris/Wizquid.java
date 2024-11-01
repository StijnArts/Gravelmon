package drai.dev.data.pokemon.avoris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wizquid extends drai.dev.data.pokemon.Pokemon {
    public Wizquid() {
        super("Wizquid",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), Ability.CONTRARY,
                11, 205,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They mastered their skills after daily training, resulting in this evolution. They continue to perfect their water magic until they are ready to evolve again. Wizquid remain loyal to their trainers and will do anything to not fail them. They train all day to impress people with their skills using water and magic."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wizquid");

    }


}
