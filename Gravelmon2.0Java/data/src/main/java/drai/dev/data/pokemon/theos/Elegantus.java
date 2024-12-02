package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Elegantus extends drai.dev.data.pokemon.Pokemon {
    public Elegantus() {
        super("Elegantus",
                Type.POISON, Type.FAIRY,
                new Stats(57,
                        90,
                        95,
                        136,
                        103,
                        29),
                List.of(Ability.SHIELD_DUST), Ability.SERENE_GRACE,
                18, 498,
                new Stats(0,0,0,3,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Elegantus constantly release pheromones attracting many Shroolie. These shroolie will mindlessly follow the commands of their leader."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Elegantus");

    }


}
