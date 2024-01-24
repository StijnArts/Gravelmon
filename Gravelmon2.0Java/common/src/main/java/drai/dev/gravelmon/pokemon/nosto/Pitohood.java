package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pitohood extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pitohood() {
        super("Pitohood",
                Type.POISON,Type.FLYING,
                new Stats(55,
                        82,
                        42,
                        53,
                        40,
                        58),
                List.of(Ability.POISON_POINT), Ability.MERCILESS,
                8, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                116, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pitohood");

    }


}
