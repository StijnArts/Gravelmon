package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianSkorupi extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianSkorupi() {
        super("Skorupi",
                Type.GROUND,
                new Stats(40,
                        60,
                        80,
                        30,
                        55,
                        65),
                List.of(Ability.IMMUNITY), Ability.TECHNICIAN,
                8, 165,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Their nests are commonly found in steep cliffsides. Swarms of Skorupis can be seem climbing up mountains as the sun sets."),
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
           setLangFileName("Skorupi");

    }


}
