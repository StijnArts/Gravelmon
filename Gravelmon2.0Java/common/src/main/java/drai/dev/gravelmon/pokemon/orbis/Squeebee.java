package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Squeebee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squeebee() {
        super("Squeebee",
                Type.NORMAL,
                new Stats(95,
                        25,
                        15,
                        25,
                        33,
                        25),
                List.of(Ability.LIMBER), Ability.LIMBER,
                2, 30,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                40, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
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
           setLangFileName("Squeebee");

    }


}
