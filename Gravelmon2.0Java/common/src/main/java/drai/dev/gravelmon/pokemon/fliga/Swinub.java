package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Swinub extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swinub() {
        super("Swinub",
                Type.ICE,Type.GROUND,
                new Stats(50,
                        50,
                        40,
                        30,
                        30,
                        50),
                List.of(Ability.OBLIVIOUS,Ability.SNOW_CLOAK), Ability.THICK_FAT,
                4, 65,
                new Stats(0,1,0,0,0,0), 225,
                0.5,
                50, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swinub");

    }


}
