package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hingjaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hingjaw() {
        super("Hingjaw",
                Type.WATER,Type.STEEL,
                new Stats(100,
                        90,
                        90,
                        65,
                        140,
                        40),
                List.of(Ability.SHELL_ARMOR,Ability.STEELWORKER,Ability.OVERCOAT), Ability.OVERCOAT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hingjaw is a member of the Shellder and the Cloyster family. While its insides are soft and fragile and served as a delicacy in Norheim, its exterior shell is incredibly hard and tough. This Pokémon has a tendency to bite onto anything that approaches it."),
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
           setLangFileName("Hingjaw");

    }


}
