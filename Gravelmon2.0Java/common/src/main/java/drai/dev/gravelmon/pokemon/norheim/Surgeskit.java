package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Surgeskit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Surgeskit() {
        super("Surgeskit",
                Type.BUG, Type.ELECTRIC,
                new Stats(60,
                        110,
                        50,
                        80,
                        50,
                        104),
                List.of(Ability.SWIFT_SWIM), Ability.ELECTRIC_SURGE,
                8, 165,
                new Stats(0,1,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Surgeskit");

    }


}
