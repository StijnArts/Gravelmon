package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Slotherror extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slotherror() {
        super("Slotherror",
                Type.ROCK,Type.FIGHTING,
                new Stats(117,
                        108,
                        77,
                        61,
                        77,
                        55),
                List.of(Ability.TOUGH_CLAWS,Ability.ANGER_POINT,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colossloth are still as lazy as their unevolved counterpart, but are particularly vicious when awoken. Their claws can tear through boulders like butter."),
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
           setLangFileName("Slotherror");

    }


}
