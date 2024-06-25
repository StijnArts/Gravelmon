package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Cabochomp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cabochomp() {
        super("Cabochomp",
                Type.WATER, Type.ROCK,
                new Stats(40,
                        70,
                        40,
                        50,
                        40,
                        80),
                List.of(Ability.ROUGH_SKIN,Ability.STRONG_JAW), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Alone, it hunts down smaller prey on both land and sea, capable of jumping 12 feet to reach them. In groups, they can take down most Pokémon with ease."),
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
           setLangFileName("Cabochomp");

    }


}
