package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanShellder extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanShellder() {
        super("Shellder",
                Type.WATER,Type.STEEL,
                new Stats(50,
                        60,
                        90,
                        40,
                        60,
                        20),
                List.of(Ability.SHELL_ARMOR,Ability.STEELWORKER,Ability.OVERCOAT), Ability.OVERCOAT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Norheiman Shellder are always seen in big numbers, forming large beds on the ocean floor. Other wild Pokémon may occasionaly rest on top of groups of Shellder. This may make them angry, causing them to migrate elsewhere."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shellder");

    }


}
