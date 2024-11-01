package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gryago extends drai.dev.data.pokemon.Pokemon {
    public Gryago() {
        super("Gryago",
                Type.ICE,Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.POISON_POINT,Ability.SNOW_WARNING), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("A fearsome endurer from multiple Ice Ages. Gūryago carries toxins from pre-historic metals and carbon. These toxins can easily break down bone that in return builds up its exo-skeleton."),
                List.of(),
                List.of(                        ),
                List.of(Label.SORIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gūryago");

    }


}
