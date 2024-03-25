package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Anepunch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anepunch() {
        super("Anenemy",
                Type.POISON,Type.FIGHTING,
                new Stats(50,
                        50,
                        60,
                        50,
                        60,
                        30),
                List.of(Ability.DRY_SKIN), Ability.ROUGH_SKIN,
                5, 60,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its poison and strong tentacles are enough to ward off most predators, but when it needs it can dettach from the ocean floor and swim away from danger."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Anenemy");

    }


}
