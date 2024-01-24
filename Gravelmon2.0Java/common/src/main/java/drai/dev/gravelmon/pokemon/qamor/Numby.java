package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Numby extends drai.dev.gravelmon.pokemon.Pokemon {
    public Numby() {
        super("Numby",
                Type.FLYING,
                new Stats(59,
                        49,
                        75,
                        57,
                        40,
                        10),
                List.of(Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Numby's source of power come from the yellow orb on its forehead which contains an oddly large concentration of static electricity within.. Numby like to collect socks and are known to steal them from laundromats."),
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
           setLangFileName("Numby");

    }


}
