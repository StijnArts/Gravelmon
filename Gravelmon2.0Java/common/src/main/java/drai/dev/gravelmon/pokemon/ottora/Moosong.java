package drai.dev.gravelmon.pokemon.ottora;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Moosong extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moosong() {
        super("Moosong",
                Type.NORMAL,
                new Stats(46,
                        42,
                        45,
                        27,
                        36,
                        60),
                List.of(Ability.SAP_SIPPER,Ability.RUN_AWAY), Ability.SOUNDPROOF,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OTTORA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Moosong");

    }


}
