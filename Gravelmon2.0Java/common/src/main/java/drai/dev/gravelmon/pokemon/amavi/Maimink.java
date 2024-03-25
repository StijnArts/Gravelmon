package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Maimink extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maimink() {
        super("Maimink",
                Type.NORMAL,Type.DARK,
                new Stats(70,
                        115,
                        55,
                        45,
                        45,
                        100),
                List.of(Ability.ANGER_POINT), Ability.COMPETITIVE,
                9, 195,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                130, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Location: Route 1 -Circle Grove (Evolve)"),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maimink");

    }


}
