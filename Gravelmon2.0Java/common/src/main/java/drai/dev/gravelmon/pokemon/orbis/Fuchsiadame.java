package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Fuchsiadame extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fuchsiadame() {
        super("Fuchsiadame",
                Type.GRASS, Type.FAIRY,
                new Stats(100,
                        65,
                        60,
                        105,
                        135,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 180,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                213, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fuchsiadame");

    }


}
