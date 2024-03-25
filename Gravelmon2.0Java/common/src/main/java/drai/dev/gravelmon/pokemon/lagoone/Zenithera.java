package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Zenithera extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zenithera() {
        super("Zenithera",
                Type.DARK,Type.ELECTRIC,
                new Stats(85,
                        100,
                        90,
                        140,
                        80,
                        105),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 680,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
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
           setLangFileName("Zenithera");

    }


}
