package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Majestree extends drai.dev.data.pokemon.Pokemon {
    public Majestree() {
        super("Majestree",
                Type.GRASS, Type.FIGHTING,
                new Stats(89,
                        132,
                        114,
                        52,
                        57,
                        86),
                List.of(Ability.CHLOROPHYLL,Ability.RECKLESS), Ability.SHEER_FORCE,
                30, 1540,
                new Stats(0,2,1,0,0,0), 30,
                0.5,
                279, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Branch PokeSTAB Grass - Tackle Normal 18 CounterSTAB Fighting 22 Growth Normal 26 SubmissionSTAB Fighting 28 Horn LeechSTAB Grass 32 Grav AppleSTAB Grass 38 Hammer ArmSTAB Fighting 40 Ingrain Grass 44 Wood HammerSTAB Grass 50 Dynamic PunchSTAB Fighting 52 Forest's Curse Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.COUNTER,18),
                        new MoveLearnSetEntry(Move.GROWTH,22),
                        new MoveLearnSetEntry(Move.SUBMISSION,26),
                        new MoveLearnSetEntry(Move.HORN_LEECH,28),
                        new MoveLearnSetEntry(Move.GRAV_APPLE,32),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,38),
                        new MoveLearnSetEntry(Move.INGRAIN,40),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,44),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,50),
                        new MoveLearnSetEntry(Move.FORESTS_CURSE,52),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Majestree");

    }


}
