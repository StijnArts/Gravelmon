package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Snellow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snellow() {
        super("Snellow",
                Type.BUG,Type.GRASS,
                new Stats(105,
                        45,
                        100,
                        65,
                        125,
                        49),
                List.of(Ability.HARVEST,Ability.GLUTTONY), Ability.UNBURDEN,
                9, 218,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                145, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
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
           setLangFileName("Snellow");

    }


}
