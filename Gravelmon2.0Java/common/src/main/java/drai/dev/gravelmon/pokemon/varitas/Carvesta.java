package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Carvesta extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carvesta() {
        super("Carvesta",
                Type.PSYCHIC,Type.WATER,
                new Stats(55,
                        85,
                        55,
                        50,
                        55,
                        60),
                List.of(Ability.SHELL_ARMOR,Ability.HYDRATION,Ability.POISON_TOUCH), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Once mistaken for Larvesta for its shape, it normally lies at the bottom of the ocean and ensnares passing prey with its tentacles. It can also propel itself backwards to skewer foes with its pointed shell"),
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
           setLangFileName("Carvesta");

    }


}
