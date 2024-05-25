package drai.dev.gravelmon.pokemon.fliga.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Piloswine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Piloswine(int dex) {
        super(dex, "Piloswine",
                Type.ICE, Type.GROUND,
                new Stats(100,
                        100,
                        80,
                        60,
                        60,
                        50),
                List.of(Ability.OBLIVIOUS,Ability.SNOW_CLOAK), Ability.THICK_FAT,
                11, 558,
                new Stats(1,1,0,0,0,0), 75,
                0.5,
                158, ExperienceGroup.SLOW,
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
           setLangFileName("Piloswine");

    }


}
