package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Acrown extends drai.dev.data.pokemon.Pokemon {
    public Acrown() {
        super("Acrown",
                Type.GRASS,
                new Stats(45,
                        80,
                        90,
                        25,
                        30,
                        50),
                List.of(Ability.CHLOROPHYLL,Ability.ROCK_HEAD), Ability.SHEER_FORCE,
                2, 20,
                new Stats(0,0,1,0,0,0), 205,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("majestree", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:kings_rock")))),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Acrown");

    }


}
