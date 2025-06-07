package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Imicada extends drai.dev.data.pokemon.Pokemon {
    public Imicada() {
        super("Imicada",
                Type.BUG,
                new Stats(40,
                        58,
                        43,
                        31,
                        46,
                        52),
                List.of(Ability.SWARM), Ability.LEAF_GUARD,
                4, 34,
                new Stats(0,1,0,0,0,0), 225,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Imcada camouflages themselves as sunkern to blend in within the sunflower fields where they feed upon the flowers."),
                List.of(new EvolutionEntry("suncada", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.INFESTATION,3),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,8),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.MIMIC,19),
                        new MoveLearnSetEntry(Move.MORNING_SUN,25),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,27),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,34)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FLORAL).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Imicada");

    }


}
