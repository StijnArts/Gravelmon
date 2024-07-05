package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvorianChemecko extends drai.dev.data.pokemon.Pokemon {
    public AvorianChemecko() {
        super("Chemecko",
                Type.POISON, Type.DARK,
                new Stats(34,
                        54,
                        52,
                        69,
                        41,
                        80),
                List.of(Ability.RATTLED,Ability.AFTERMATH,Ability.CORROSION), Ability.CORROSION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It creates a mix of poisonous chemicals in its tail. When in fear, they drop behind the tail which then explodes, releasing hazardous gases hoping to scare off or harm any threats."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chemecko");

    }


}
