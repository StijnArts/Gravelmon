package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Geckid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Geckid() {
        super("Geckid",
                Type.WATER,
                new Stats(55,
                        35,
                        65,
                        70,
                        65,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.PRANKSTER), Ability.HYDRATION,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Geckid");

    }


}
