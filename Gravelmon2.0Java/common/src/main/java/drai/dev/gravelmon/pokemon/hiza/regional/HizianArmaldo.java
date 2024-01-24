package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianArmaldo extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianArmaldo() {
        super("Armaldo",
                Type.BUG,Type.DRAGON,
                new Stats(75,
                        125,
                        100,
                        70,
                        80,
                        45),
                List.of(Ability.OUTBURST), Ability.OUTBURST,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                173, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its believed to be one of the first apex predators. Terrible dragon energy courses its body, scaring away anything that might challenge it."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armaldo");

    }


}
