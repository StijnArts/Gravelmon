package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Scrachty extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scrachty() {
        super("Scrachty",
                Type.FLYING,Type.GROUND,
                new Stats(65,
                        90,
                        115,
                        45,
                        115,
                        58),
                List.of(Ability.BIG_PECKS,Ability.OVERCOAT,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As long as the nest of mud and thorns around its lower half is in good shape, it struts around confidently and carefree. When it's not spending time maintaining its nest, it tends to the comb on its head instead."),
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
           setLangFileName("Scrachty");

    }


}
