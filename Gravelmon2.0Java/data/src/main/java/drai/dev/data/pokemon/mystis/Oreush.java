package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Oreush extends drai.dev.data.pokemon.Pokemon {
    public Oreush() {
        super("Oreush",
                Type.DARK, Type.FAIRY,
                new Stats(50,
                        10,
                        50,
                        10,
                        20,
                        60),
                List.of(Ability.RELENTLESS), Ability.JAWBREAKER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It resembles a popular snack beloved for its creamy filling. While it does taste good, it rarely lets anyone taste it."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oreush");

    }


}
