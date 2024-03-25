package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Buneary extends drai.dev.gravelmon.pokemon.Pokemon {
    public Buneary() {
        super("Buneary",
                Type.NORMAL,
                new Stats(55,
                        66,
                        44,
                        44,
                        56,
                        85),
                List.of(Ability.KLUTZ,Ability.RUN_AWAY), Ability.LIMBER,
                3, 55,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                84, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Buneary");

    }


}
