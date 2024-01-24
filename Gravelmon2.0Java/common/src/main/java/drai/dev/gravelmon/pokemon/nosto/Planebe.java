package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Planebe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Planebe() {
        super("Planebe",
                Type.WATER,
                new Stats(60,
                        36,
                        45,
                        24,
                        38,
                        42),
                List.of(Ability.SWIFT_SWIM,Ability.INNER_FOCUS,Ability.HYDRATION), Ability.HYDRATION,
                8, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                46, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
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
           setLangFileName("Planebe");

    }


}
