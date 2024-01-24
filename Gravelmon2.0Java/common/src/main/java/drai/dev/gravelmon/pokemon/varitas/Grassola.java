package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grassola extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grassola() {
        super("Grassola",
                Type.GRASS,Type.FAIRY,
                new Stats(65,
                        55,
                        95,
                        65,
                        95,
                        35),
                List.of(Ability.LEAF_GUARD,Ability.REGENERATOR,Ability.SERENE_GRACE), Ability.SERENE_GRACE,
                8, 165,
                new Stats(0,0,1,0,1,0), 60,
                0.25,
                144, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It slowly moves along the forest floor, camougoomyed among old pieces of wood. It was initially mistaken for Corsola due to the way branches sprout from it"),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grassola");

    }


}
