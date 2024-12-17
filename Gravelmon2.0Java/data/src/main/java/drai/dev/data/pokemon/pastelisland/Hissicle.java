package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hissicle extends drai.dev.data.pokemon.Pokemon {
    public Hissicle() {
        super("Hissicle",
                Type.WATER,
                new Stats(65,
                        45,
                        60,
                        40,
                        55,
                        35),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                3, 39,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Hissicle are patient and calm, and love swim gaudily through cold seas. They have a cold toxin in their body that chills those it bites."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hissicle");

    }


}
