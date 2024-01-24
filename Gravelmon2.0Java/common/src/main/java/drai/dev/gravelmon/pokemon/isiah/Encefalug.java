package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Encefalug extends drai.dev.gravelmon.pokemon.Pokemon {
    public Encefalug() {
        super("Encefalug",
                Type.ELECTRIC,Type.PSYCHIC,
                new Stats(100,
                        50,
                        55,
                        95,
                        130,
                        40),
                List.of(Ability.FOREWARN,Ability.STICKY_HOLD,Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                8, 165,
                new Stats(0,0,0,0,2,0), 0,
                0.5,
                165, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Encefalug");

    }


}
