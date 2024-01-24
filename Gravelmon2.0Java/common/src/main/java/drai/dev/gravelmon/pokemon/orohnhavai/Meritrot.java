package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Meritrot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meritrot() {
        super("Meritrot",
                Type.NORMAL,
                new Stats(55,
                        50,
                        38,
                        50,
                        40,
                        72),
                List.of(Ability.RUN_AWAY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Gentle-natured and friendly, Meritrot love being around people and giving rides. They are far stronger than they appear and are used for farm work all over Atlas."),
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
           setLangFileName("Meritrot");

    }


}
