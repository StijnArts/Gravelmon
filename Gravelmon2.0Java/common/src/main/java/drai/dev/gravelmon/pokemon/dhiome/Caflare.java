package drai.dev.gravelmon.pokemon.dhiome;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Caflare extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caflare() {
        super("Caflare",
                Type.FIRE,
                new Stats(50,
                        60,
                        50,
                        50,
                        45,
                        55),
                List.of(Ability.BLAZE), Ability.SIMPLE,
                4, 61,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("People used to raise this Pokemon in houses cause of the warmth emanating from its skin. It is believed to bring good luck."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caflare");

    }


}
