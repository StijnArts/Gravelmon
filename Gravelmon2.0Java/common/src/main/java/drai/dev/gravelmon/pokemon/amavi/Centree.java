package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Centree extends drai.dev.gravelmon.pokemon.Pokemon {
    public Centree() {
        super("Centree",
                Type.FAIRY,Type.GRASS,
                new Stats(105,
                        40,
                        55,
                        88,
                        145,
                        105),
                List.of(Ability.FLOWER_VEIL,Ability.SAP_SIPPER), Ability.CHLOROPHYLL,
                21, 1034,
                new Stats(1,0,0,0,1,1), 0,
                0.25,
                185, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of(""),
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
           setLangFileName("Centree");

    }


}
