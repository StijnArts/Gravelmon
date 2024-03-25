package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Spawnkey extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spawnkey() {
        super("Spawnkey",
                Type.FIRE,
                new Stats(45,
                        60,
                        45,
                        45,
                        35,
                        80),
                List.of(Ability.BLAZE), Ability.PRANKSTER,
                6, 73,
                new Stats(0,0,0,0,0,1), 45,
                0.75,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("Location: Groveridge (Starter)"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,20),
                        new MoveLearnSetEntry(Move.FAKE_OUT,27),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,32),
                        new MoveLearnSetEntry(Move.CRUNCH,42),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,48)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spawnkey");

    }


}
