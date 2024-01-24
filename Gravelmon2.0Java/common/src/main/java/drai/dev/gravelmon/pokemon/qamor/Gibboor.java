package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Gibboor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gibboor() {
        super("Gibboor",
                Type.DARK,
                new Stats(50,
                        84,
                        80,
                        75,
                        47,
                        66),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE,Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FIELD),
                List.of("Due to their flexibility and astounding reflexes, Gibboor able to contort its body in odd and sometime unsettling angles in order to see in any directions."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gibboor");

    }


}
