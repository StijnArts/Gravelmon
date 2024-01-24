package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Periyeti extends drai.dev.gravelmon.pokemon.Pokemon {
    public Periyeti() {
        super("Periyeti",
                Type.ICE,Type.FIGHTING,
                new Stats(100,
                        135,
                        75,
                        60,
                        70,
                        70),
                List.of(Ability.SNOW_CLOAK), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                178, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Periyeti live in exile as they abandon themselves from all people and Pokemon. Due to their snow-colored fur, it's nearly impossible to spot one and makes many people doubt their existence."),
                List.of(),
                List.of(                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Periyeti");

    }


}
