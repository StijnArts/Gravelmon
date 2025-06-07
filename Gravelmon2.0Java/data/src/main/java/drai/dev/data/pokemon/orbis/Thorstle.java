package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Thorstle extends drai.dev.data.pokemon.Pokemon {
    public Thorstle() {
        super("Thorstle",
                Type.GRASS, Type.POISON,
                new Stats(60,
                        85,
                        75,
                        65,
                        70,
                        40),
                List.of(Ability.POISON_POINT), Ability.OWN_TEMPO,
                7, 73,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                138, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Thorstle live in fields that don't get tended to well. Their bright pink flower is extremely spiky, and releases toxins when touched that give a sharp stinging pain."),
                List.of(new EvolutionEntry("thistance", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.POISONBURST,1),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Thorstle");

    }


}
