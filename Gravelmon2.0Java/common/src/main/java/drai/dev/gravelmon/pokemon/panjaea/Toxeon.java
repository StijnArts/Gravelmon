package drai.dev.gravelmon.pokemon.panjaea;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Toxeon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Toxeon() {
        super("Toxeon",
                Type.POISON,
                new Stats(95,
                        65,
                        130,
                        65,
                        110,
                        60),
                List.of(Ability.POISON_TOUCH), Ability.CORROSION,
                10, 239,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.PANJAEA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Toxeon");

    }


}
