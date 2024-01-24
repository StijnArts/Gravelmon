package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Camohut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Camohut() {
        super("Camohut",
                Type.GROUND,Type.DRAGON,
                new Stats(40,
                        50,
                        100,
                        65,
                        70,
                        15),
                List.of(Ability.BATTLE_ARMOR,Ability.OVERCOAT,Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their disguise as tiny huts helps prevent them from getting in danger with predators. They move in herds traveling around near the foot of mountains. Their tough exterior withstands powerful attacks and harsh weather conditions."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Camohut");

    }


}
