package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Quillistic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quillistic() {
        super("Quillistic",
                Type.POISON,Type.NORMAL,
                new Stats(80,
                        88,
                        93,
                        45,
                        71,
                        73),
                List.of(Ability.POISON_POINT,Ability.IRON_BARBS), Ability.SCRAPPY,
                15, 170,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Upon evolution, Quillistic have grown their confidence. Their quills are sharp and poisonous and can be shot in any direction they choose."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quillistic");

    }


}
