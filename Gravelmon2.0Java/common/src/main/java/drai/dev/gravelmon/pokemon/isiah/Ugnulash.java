package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ugnulash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ugnulash() {
        super("Ugnulash",
                Type.NORMAL,
                new Stats(90,
                        90,
                        85,
                        55,
                        75,
                        90),
                List.of(Ability.GUTS,Ability.ANGER_POINT,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                8, 165,
                new Stats(1,1,0,0,0,0), 45,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ugnulash");

    }


}
