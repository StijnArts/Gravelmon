package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Roomere extends drai.dev.gravelmon.pokemon.Pokemon {
    public Roomere() {
        super("Roomere",
                Type.GHOST,Type.FIRE,
                new Stats(110,
                        70,
                        50,
                        95,
                        95,
                        75),
                List.of(Ability.LEVITATE,Ability.CUTE_CHARM,Ability.INFILTRATOR), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Roomere may appear inside local buildings next to roads, spreading rumors. Some say that these ghosts used to work as innkeeper ladies and were the victims of terrible house fires."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ATTRACT,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Roomere");

    }


}
