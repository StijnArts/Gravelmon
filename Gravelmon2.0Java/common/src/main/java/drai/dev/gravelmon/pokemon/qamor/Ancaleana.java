package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Ancaleana extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ancaleana() {
        super("Ancaleana",
                Type.GRASS,Type.DRAGON,
                new Stats(105,
                        95,
                        83,
                        48,
                        90,
                        79),
                List.of(Ability.NATURAL_CURE), Ability.BIG_PECKS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("Ancaleana live in thick rain forests and other humid areas, one might catch a glimpse of their gorgeous wings flying in the canopy above. Their heads and wings are crested with vibrant flowers which they use to attract a mate or companions."),
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
           setLangFileName("Ancaleana");

    }


}
