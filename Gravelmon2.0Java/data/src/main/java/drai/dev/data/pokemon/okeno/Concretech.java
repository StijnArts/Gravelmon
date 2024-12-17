package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Concretech extends drai.dev.data.pokemon.Pokemon {
    public Concretech() {
        super("Concretech",
                Type.GROUND, Type.STEEL,
                new Stats(90,
                        130,
                        150,
                        60,
                        60,
                        40),
                List.of(Ability.STURDY,Ability.PRESSURE,Ability.OVERWHELMING), Ability.OVERWHELMING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Concretech");

    }


}
