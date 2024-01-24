package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pudgey extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pudgey() {
        super("Pudgey",
                Type.NORMAL,Type.FLYING,
                new Stats(100,
                        45,
                        75,
                        40,
                        50,
                        20),
                List.of(Ability.GLUTTONY), Ability.GLUTTONY,
                8, 165,
                new Stats(1,0,0,0,0,0), 33,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("Pudgey mimic the appearance of Pidgey because their lazy parents- who don't want to raise them- instead lay their eggs in Pidgeot nests. Newly hatched Pudgey will hog all of the food from its nest-mates, often starving its 'siblings' in the process. Once the Pokemon has mooched all the food from it's host nest and feels satisfied, it will evolve."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHOVEOFF,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pudgey");

    }


}
