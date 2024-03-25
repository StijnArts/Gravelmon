package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Phanchasm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phanchasm() {
        super("Phanchasm",
                Type.GHOST,Type.GROUND,
                new Stats(80,
                        120,
                        40,
                        40,
                        100,
                        90),
                List.of(Ability.SUPER_LUCK), Ability.TOUGH_CLAWS,
                15, 120,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FIELD),
                List.of("Their trickster nature can sometimes be difficult to work with, but their excellent sense of smell and massive digging claws have made them perfect companions for miners in search of gold."),
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
           setLangFileName("Phanchasm");

    }


}
