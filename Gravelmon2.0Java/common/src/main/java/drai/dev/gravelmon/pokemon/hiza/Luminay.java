package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Luminay extends drai.dev.gravelmon.pokemon.Pokemon {
    public Luminay() {
        super("Luminay",
                Type.DRAGON,Type.WATER,
                new Stats(92,
                        80,
                        62,
                        80,
                        66,
                        70),
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                8, 165,
                new Stats(0,0,0,1,0,0), 78,
                0.5,
                75, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_2),
                List.of("Their bright lights can be seem all the way from the surface. They used to guide ships traveling accross intense fog."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Luminay");

    }


}
