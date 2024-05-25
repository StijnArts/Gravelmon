package drai.dev.gravelmon.pokemon.fliga.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Helioptile extends drai.dev.gravelmon.pokemon.Pokemon {
    public Helioptile(int dex) {
        super(dex, "Helioptile",
                Type.ELECTRIC, Type.NORMAL,
                new Stats(44,
                        38,
                        33,
                        61,
                        43,
                        70),
                List.of(Ability.SAND_VEIL,Ability.DRY_SKIN), Ability.SOLAR_POWER,
                5, 60,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Description They make their home in deserts. They can generate their energy from basking in the sun, so eating food is not a requirement."),
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
           setLangFileName("Helioptile");

    }


}
