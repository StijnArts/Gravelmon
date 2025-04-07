package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brambull extends drai.dev.data.pokemon.Pokemon {
    public Brambull() {
        super("Brambull",
                Type.GRASS,
                new Stats(86,
                        74,
                        78,
                        68,
                        51,
                        53),
                List.of(Ability.OVERCOAT), Ability.OVERCOAT,
                10, 130,
                new Stats(2,0,0,0,0,0), 110,
                0.85,
                143, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A thick cover of leaves coats their wooly mane and covers over their eyes, though they can still see fine."),
                List.of(new EvolutionEntry("maizotaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,11),
                        new MoveLearnSetEntry(Move.YAWN,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.SUBMISSION,24),
                        new MoveLearnSetEntry(Move.RETALIATE,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,32),
                        new MoveLearnSetEntry(Move.MILK_DRINK,37),
                        new MoveLearnSetEntry(Move.HORN_LEECH,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,47),
                        new MoveLearnSetEntry(Move.LEAF_STORM,52)                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Brambull");

    }


}
