package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bandicute extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bandicute() {
        super("Bandicute",
                Type.NORMAL, Type.DARK,
                new Stats(50,
                        75,
                        30,
                        25,
                        25,
                        75),
                List.of(Ability.PICKUP), Ability.PICKPOCKET,
                3, 59,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Location: Route 1 -Circle Grove"),
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
           setLangFileName("Bandicute");

    }


}
