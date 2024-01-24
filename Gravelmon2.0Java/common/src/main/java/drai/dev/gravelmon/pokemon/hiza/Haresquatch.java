package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Haresquatch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Haresquatch() {
        super("Haresquatch",
                Type.ICE,Type.GROUND,
                new Stats(122,
                        105,
                        90,
                        45,
                        55,
                        60),
                List.of(Ability.SLUSH_RUSH,Ability.SOUNDPROOF,Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                151, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It leaves massive footprints as it walks, intimidating predators that would attempt to track them. Its large claws allow it to dig underground at an impressive speed."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Haresquatch");

    }


}
