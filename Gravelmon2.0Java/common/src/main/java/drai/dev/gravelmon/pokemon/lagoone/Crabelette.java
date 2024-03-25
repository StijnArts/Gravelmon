package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Crabelette extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crabelette() {
        super("Crabelette",
                Type.NORMAL,
                new Stats(85,
                        115,
                        85,
                        40,
                        85,
                        90),
                List.of(Ability.PICKPOCKET), Ability.WEAK_ARMOR,
                14, 930,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("They fight eachother over territory. If its outer shell were to break, its inner shell is incredibly light, allowing an almost guaranteed escape from the fight."),
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
           setLangFileName("Crabelette");

    }


}
