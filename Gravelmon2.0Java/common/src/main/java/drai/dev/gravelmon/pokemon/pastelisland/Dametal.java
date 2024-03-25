package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Dametal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dametal() {
        super("Dametal",
                Type.STEEL,
                new Stats(55,
                        50,
                        60,
                        45,
                        35,
                        45),
                List.of(Ability.GUTS,Ability.PRESSURE), Ability.HUGE_POWER,
                19, 170,
                new Stats(0,0,0,0,0,0), 0,
                0.6,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dametal");

    }


}
