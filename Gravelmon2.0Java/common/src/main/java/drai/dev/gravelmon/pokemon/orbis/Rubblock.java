package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Rubblock extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rubblock() {
        super("Rubblock",
                Type.ROCK,
                new Stats(35,
                        65,
                        85,
                        25,
                        40,
                        20),
                List.of(Ability.STURDY), Ability.STURDY,
                2, 130,
                new Stats(0,0,1,0,0,0), 205,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Rubblock are born from the rubble and debris of fallen buildings and structures. The iron pipes on their heads pick up signals from other Rubblock. When enough Rubblock band together they will evolve."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,12),
                        new MoveLearnSetEntry(Move.SHARPEN,20),
                        new MoveLearnSetEntry(Move.ROCK_THROW,25),
                        new MoveLearnSetEntry(Move.SANDSTORM,31),
                        new MoveLearnSetEntry(Move.IRON_HEAD,38)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rubblock");

    }


}
