package drai.dev.gravelmon.pokemon.fliga.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mamoswine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mamoswine(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Mamoswine",
                Type.ICE, Type.GROUND,
                new Stats(110,
                        130,
                        80,
                        70,
                        60,
                        80),
                List.of(Ability.OBLIVIOUS,Ability.SNOW_CLOAK), Ability.THICK_FAT,
                32, 2910,
                new Stats(0,3,0,0,0,0), 50,
                0.5,
                239, ExperienceGroup.SLOW,
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
           setLangFileName("Mamoswine");

    }


}
