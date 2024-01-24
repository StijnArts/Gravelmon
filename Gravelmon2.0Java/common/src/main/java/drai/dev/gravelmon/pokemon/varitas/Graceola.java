package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Graceola extends drai.dev.gravelmon.pokemon.Pokemon {
    public Graceola() {
        super("Graceola",
                Type.GRASS,Type.FAIRY,
                new Stats(60,
                        95,
                        50,
                        145,
                        130,
                        30),
                List.of(Ability.MAGIC_GUARD,Ability.REGENERATOR,Ability.SERENE_GRACE), Ability.SERENE_GRACE,
                8, 165,
                new Stats(0,0,0,2,0,0), 30,
                0.25,
                179, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("They normally stay very still to absorb sunlight but every year groups of them will come together and do beautiful dances to welcome the coming of spring."),
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
           setLangFileName("Graceola");

    }


}
