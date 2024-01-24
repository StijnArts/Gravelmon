package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bubblea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bubblea() {
        super("Bubblea",
                Type.WATER,Type.FAIRY,
                new Stats(60,
                        60,
                        80,
                        85,
                        110,
                        80),
                List.of(Ability.RAIN_DISH), Ability.AROMA_VEIL,
                8, 165,
                new Stats(0,0,0,0,2,0), 63,
                0.35,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.FAIRY),
                List.of("Bubblea are known to float around large bodies of water, like lakes. Rumors say that popping Bubblea's bubbles by force brings it immense pain."),
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
           setLangFileName("Bubblea");

    }


}
