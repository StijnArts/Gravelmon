package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Chickoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chickoo() {
        super("Chickoo",
                Type.NORMAL,Type.FLYING,
                new Stats(50,
                        40,
                        40,
                        40,
                        40,
                        60),
                List.of(Ability.EARLY_BIRD), Ability.OBLIVIOUS,
                3, 13,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                54, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Chickoo");

    }


}
