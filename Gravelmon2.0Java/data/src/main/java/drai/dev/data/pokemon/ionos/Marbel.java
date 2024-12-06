package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marbel extends drai.dev.data.pokemon.Pokemon {
    public Marbel() {
        super("Marbel",
                Type.ROCK,
                new Stats(60,
                        59,
                        80,
                        43,
                        60,
                        10),
                List.of(Ability.MAGIC_BOUNCE), Ability.ROCK_HEAD,
                6, 0,
                new Stats(0,0,0,0,0,0), 210,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is extremely difficult to tell if Marbel is a statue or in fact a Pokémon. Some believe that it is both. It changes its pose when nobody is watching. Legends say that this Pokémon will only wake up and learn how to walk on certain days of the Ionan calendar."),
                List.of(new EvolutionEntry("marbelous", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_SPRING.getId() + ":" + Biome.IS_SPRING.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.COUNTER,11),
                        new MoveLearnSetEntry(Move.AMNESIA,17),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,23),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.SAND_TOMB,39),
                        new MoveLearnSetEntry(Move.SUPERPOWER,55),
                        new MoveLearnSetEntry(Move.POWER_GEM,67)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 27, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD))
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Marbel");

    }


}
