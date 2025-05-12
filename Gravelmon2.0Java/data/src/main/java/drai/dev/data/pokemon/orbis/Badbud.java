package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Badbud extends drai.dev.data.pokemon.Pokemon {
    public Badbud() {
        super("Badbud",
                Type.GRASS, Type.POISON,
                new Stats(35,
                        65,
                        50,
                        50,
                        55,
                        30),
                List.of(Ability.POISON_POINT), Ability.OWN_TEMPO,
                3, 41,
                new Stats(0,1,0,0,0,0), 255,
                0.0,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Poison StingSTAB Poison - Growth Normal 6 Razor LeafSTAB Grass 14 Poison Powder Poison 31 Toxic Spikes Poison 35 Leaf BladeSTAB Grass"),
                List.of(new EvolutionEntry("thorstle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,6),
                        new MoveLearnSetEntry(Move.POISON_POWDER,14),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,35)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(4).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Badbud");

    }


}
