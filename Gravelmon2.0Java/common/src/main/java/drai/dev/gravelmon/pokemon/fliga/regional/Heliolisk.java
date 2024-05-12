package drai.dev.gravelmon.pokemon.fliga.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Heliolisk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Heliolisk(int dex) {
        super(dex, "Heliolisk",
                Type.ELECTRIC, Type.NORMAL,
                new Stats(62,
                        55,
                        52,
                        109,
                        94,
                        109),
                List.of(Ability.SAND_VEIL,Ability.DRY_SKIN), Ability.SOLAR_POWER,
                10, 210,
                new Stats(0,0,0,1,0,1), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("They flare their frills and generate energy. A single Heliolisk can generate sufficient electricity to power a skyscburmyr."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Heliolisk");

    }


}
