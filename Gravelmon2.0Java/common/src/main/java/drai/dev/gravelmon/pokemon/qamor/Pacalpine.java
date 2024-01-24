package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pacalpine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pacalpine() {
        super("Pacalpine",
                Type.ROCK,Type.ICE,
                new Stats(93,
                        55,
                        120,
                        77,
                        99,
                        86),
                List.of(Ability.FUR_COAT), Ability.SOLID_ROCK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Indigenous groups domesticated Pacalpine to harvest their insulating wool to create fabrics and textiles while their durable stones are used to create ornate turquoise jewelry."),
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
           setLangFileName("Pacalpine");

    }


}
