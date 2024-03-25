package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cowctus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cowctus() {
        super("Cowctus",
                Type.GRASS,Type.STEEL,
                new Stats(80,
                        105,
                        105,
                        40,
                        100,
                        70),
                List.of(Ability.IRON_BARBS,Ability.SAP_SIPPER), Ability.DESERTBODY,
                13, 1011,
                new Stats(0,0,2,0,0,0), 90,
                0.875,
                176, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Cowctus stores large amounts of liquid inside its body so it can last a very long time in the hot desert. Drinking this liquid will cause anyone else to hallucinate."),
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
           setLangFileName("Cowctus");

    }


}
