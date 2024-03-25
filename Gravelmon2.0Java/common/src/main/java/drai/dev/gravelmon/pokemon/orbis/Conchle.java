package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Conchle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conchle() {
        super("Conchle",
                Type.WATER,Type.ROCK,
                new Stats(50,
                        45,
                        92,
                        45,
                        50,
                        46),
                List.of(Ability.SHELL_ARMOR), Ability.SWIFT_SWIM,
                3, 60,
                new Stats(0,0,1,0,0,0), 150,
                0.5,
                63, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conchle");

    }


}
