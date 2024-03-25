package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Poperi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Poperi() {
        super("Poperi",
                Type.POISON,Type.FIGHTING,
                new Stats(65,
                        60,
                        54,
                        50,
                        49,
                        42),
                List.of(Ability.SAP_SIPPER,Ability.OBLIVIOUS), Ability.SCRAPPY,
                6, 127,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                72, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Poperi have a trained sense of smell which is used to hunt for food. They are used in law enforcement to track down criminals, and attack with their heavy set arms."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Poperi");

    }


}
