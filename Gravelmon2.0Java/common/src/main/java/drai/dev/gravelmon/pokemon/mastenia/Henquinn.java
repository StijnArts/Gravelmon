package drai.dev.gravelmon.pokemon.mastenia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Henquinn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Henquinn() {
        super("Henquinn",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(70,
                        80,
                        70,
                        130,
                        100,
                        80),
                List.of(Ability.GLIMMER), Ability.DAZZLING,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.13,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Henquinn");

    }


}
