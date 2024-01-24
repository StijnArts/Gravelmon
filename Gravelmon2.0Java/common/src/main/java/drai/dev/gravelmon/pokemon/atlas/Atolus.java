package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Atolus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Atolus() {
        super("Atolus",
                Type.FIGHTING,
                new Stats(98,
                        127,
                        122,
                        50,
                        78,
                        45),
                List.of(Ability.SHEER_FORCE), Ability.PRESSURE,
                8, 165,
                new Stats(0,0,0,0,0,0), 30,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Everytime it wins a battle, it carries a larger rock. It is said that an Atolus once pushed a mountain to save a village."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,1)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Atolus");

    }


}
