package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Vikice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vikice() {
        super("Vikice",
                Type.ICE,Type.FIGHTING,
                new Stats(78,
                        117,
                        105,
                        67,
                        98,
                        50),
                List.of(Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FLYING),
                List.of("Evo Dragon Breath Dragon"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vikice");

    }


}
