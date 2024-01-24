package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Quaboom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quaboom() {
        super("Quaboom",
                Type.ROCK,Type.POISON,
                new Stats(40,
                        80,
                        130,
                        40,
                        130,
                        5),
                List.of(Ability.AFTERMATH), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,1,0,0,0), 65,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_2),
                List.of("It hides around rocks where it spends most of the days sleeping. If provoked it will shoot out poisonous barbs from its back in all directions."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quaboom");

    }


}
