package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Carburn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carburn() {
        super("Carburn",
                Type.FIRE,Type.ROCK,
                new Stats(60,
                        45,
                        77,
                        35,
                        30,
                        33),
                List.of(Ability.SHELL_ARMOR,Ability.BLAZE), Ability.MAGMA_ARMOR,
                8, 200,
                new Stats(0,0,1,0,0,0), 130,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
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
           setLangFileName("Carburn");

    }


}
