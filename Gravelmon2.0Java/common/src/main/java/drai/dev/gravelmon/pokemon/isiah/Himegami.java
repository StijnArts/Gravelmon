package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Himegami extends drai.dev.gravelmon.pokemon.Pokemon {
    public Himegami() {
        super("Himegami",
                Type.NORMAL,Type.STEEL,
                new Stats(63,
                        142,
                        41,
                        72,
                        50,
                        107),
                List.of(Ability.HYPER_CUTTER), Ability.STEADFAST,
                8, 165,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                216, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
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
           setLangFileName("Himegami");

    }


}
